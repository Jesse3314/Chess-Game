import java.io.PrintStream;
import java.io.InputStream;
import java.util.Scanner;

public class ChessGame{
	private ChessBoard theBoard;
	private PrintStream outStream;
	private InputStream inStream;
	private boolean turn=true;  // true: white turn
								// false: blach turn
	public ChessGame(PrintStream outStream, InputStream inStream){
		theBoard = new ChessBoard();
		this.outStream = outStream;
		this.inStream = inStream;
		
	}
	public void start(){
		String start, end;
		boolean flag = true;
		Scanner input = new Scanner(inStream);
		theBoard.populate();
		theBoard.paint(outStream);
		while(flag){
			if(turn)
				outStream.print("White Moves:");
			else
				outStream.print("Black Moves:");
			start = input.next();
			end = input.next(); 
			if(validInput(start,end)){
				turn = !turn;
				theBoard.paint(outStream);
			}
			else
				outStream.println("invalid move");
			
		}

	}
	private boolean validInput(String start, String end){
		if(!start.matches("[a-hA-H][1-8]") || !end.matches("[a-hA-H][1-8]"))
			return false;

		int col1 = start.charAt(0) -'a'+1;
		int row1 = 9- (start.charAt(1) -'0');
		int col2 = end.charAt(0) -'a'+1;
		int row2 = 9- (end.charAt(1) -'0');
		char first = theBoard.look(row1,col1).getColor(); 
		char second = theBoard.look(row2,col2).getColor();
		if(turn){
			if(first!=Def.WHITE || (second !=Def.BLACK && second != Def.NO_COLOR))
				return false;
		} else{
			if(first!=Def.BLACK || (second !=Def.WHITE && second != Def.NO_COLOR))
				return false;
		}
		theBoard.move(row1,col1,row2,col2);
		return true;
	}
}