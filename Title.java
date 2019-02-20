import java.io.PrintStream;
import java.awt.Graphics2D; 
public class Title extends Piece{
	
	private char symbol;

	public Title(char symbol){
		super();
		this.symbol=symbol;
	}
	
	public int getType(){
		return Def.BOARDER;
	}	
	
	public void paint(Graphics2D g2){
		//PrintStream out= (PrintStream) media;
		//out.print(" "+symbol+" ");
	}
	
   public int getColor(){// that returns the color of the piece such as BLACK
      return 0;
   }
}

