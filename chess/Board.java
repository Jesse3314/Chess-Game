
import java.io.PrintStream;
public class Board{
	
	private Piece [][] pieces;
	
	public Board(int row, int col){
		pieces = new Piece [row][col];
	}
	
	public void paint(Object media) {
		PrintStream out= (PrintStream) media;
		for ( Piece[] row : pieces){
			for (Piece e : row){
				e.paint(media);
			}
			out.println();

		}	
	}
	
	public void place (Piece p, int row, int col){
		pieces [row][col] = p;
		p.place(row,col);
	}
	
	public void move(int row1, int col1, int row2, int col2){
		pieces[row1][col1].place(row2,col2); // set the pieces know its new position
		pieces[row2][col2] = pieces[row1][col1]; // relocate the piece on the board
		remove(row1,col1);
	}
	
	public void remove(int row, int col){
		pieces[row][col] = new Dummy();
		pieces[row][col].place(row,col);
	}
	
	public Piece look (int row, int col){
		return pieces[row][col];
	}
}
