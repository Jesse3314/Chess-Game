import java.io.PrintStream;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
public class Queen extends Piece{
	private BufferedImage img;
   private String fileName;
	public Queen(char color){
		super(color);
	}

	public int getType(){
		return Def.QUEEN;
	}	
	
	public void paint(Graphics2D g){
     if(colorNum == 98){
         fileName = Def.imgBlackQueen;
    }
      else if(colorNum == 119){
		   fileName = Def.imgWhiteQueen;
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

