
import java.io.PrintStream;

public class Title extends Piece{
	
	private char symbol;

	public Title(char symbol){
		super();
		this.symbol=symbol;
	}
	
	public int getType(){
		return Def.BOARDER;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(" "+symbol+" ");
	}
	
}

