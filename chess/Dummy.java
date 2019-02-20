import java.io.PrintStream;
// Dummy Piece
public class Dummy extends Piece{
	public Dummy(){
		super(Def.NO_COLOR);
	}

	public int getType(){
		return Def.DUMMY;
	}	
	
	public void paint(Object media){
		PrintStream out= (PrintStream) media;
		out.print(Def.DUMMY_SYMBOL); // print empty space
		
	}
}

