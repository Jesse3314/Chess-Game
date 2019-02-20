
import java.io.PrintStream;

public class King extends Piece{
	
	public King( char color){
		super(color);
	}

	public int getType(){
		return Def.KING;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"K ");
	}
	
}

