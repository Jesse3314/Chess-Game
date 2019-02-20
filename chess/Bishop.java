
import java.io.PrintStream;

public class Bishop extends Piece{
	
	public Bishop( char color){
		super(color);
	}

	public int getType(){
		return Def.BISHOP;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"B ");
	}
	
}

