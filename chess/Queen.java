
import java.io.PrintStream;

public class Queen extends Piece{
	
	public Queen( char color){
		super(color);
	}

	public int getType(){
		return Def.QUEEN;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(""+getColor()+"Q ");
	}
	
}

