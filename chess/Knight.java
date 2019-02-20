
import java.io.PrintStream;

public class Knight extends Piece{
	
	public Knight( char color){
		super(color);
	}

	public int getType(){
		return Def.KNIGHT;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"N ");
	}
	
}

