import java.io.PrintStream;
import java.awt.Graphics2D;
public class Dummy extends Piece{
   
   public Dummy(){
		super(Def.NO_COLOR);
	}
   
   public int getType(){
		return Def.DUMMY;
	}
	
   public void paint(Graphics2D g2){
      // Do nothing
      //because Dummy doesnt need a pic
   }
   
   public int getColor(){
      return 0;
   }
}