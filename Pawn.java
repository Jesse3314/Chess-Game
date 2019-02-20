import java.io.PrintStream;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
public class Pawn extends Piece{
   private BufferedImage img;
   private String fileName;
   private int x, y;
  
   public Pawn(char color){
	   super(color);
	}

   /*public Pawn(char color, int x, int y){
	   super(color);
      this.x = 45 + x*45;
      this.y = 45 + y*45;
	}*/

	public int getType(){
		return Def.PAWN;
	}

   public void paint(Graphics2D g){
      if(colorNum == 98){
         fileName = Def.imgBlackPawn;
      }
      else if(colorNum == 119){
		   fileName = Def.imgWhitePawn;
      }
      try{
			img = ImageIO.read(new File(fileName));
		}catch (IOException e){
		}
      int xCord = location.getCol() * 45 + 45;
      int yCord = location.getRow() * 45 + 45;
      g.drawImage(img, xCord, yCord, img.getWidth(), img.getHeight(), null);
   }

   public int getColor(){
      return colorNum;
   }
}
