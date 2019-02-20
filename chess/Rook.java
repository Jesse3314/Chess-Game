
import java.io.PrintStream;

public class Rook extends Piece{
	
	public Rook( char color){
		super(color);
	}

	public int getType(){
		return Def.ROOK;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"R ");
	}
	
}

