
import java.io.PrintStream;

public class Pawn extends Piece{
	
	public Pawn( char color){
		super(color);
	}

	public int getType(){
		return Def.PAWN;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"P ");
	}
	
}

