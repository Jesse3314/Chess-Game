import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class ChessViewer extends JComponent{
   private ChessBoard chessBoard;
   private MousePressListener ml;
   private int flag;
   private int xFrom, yFrom, xTo, yTo, turns;
   private boolean check;
   public ChessViewer(){
     chessBoard = new ChessBoard(8, 8);
      flag = 1;
	   turns = 0;
	   ml = new MousePressListener();
      addMouseListener(ml);
	}

   public void paint(Graphics h){
		Graphics2D g2 = (Graphics2D)h;
		chessBoard.paint(g2);
	}
   
   class MousePressListener implements MouseListener{  
      public void mousePressed(MouseEvent event){}
      public void mouseReleased(MouseEvent event){}
      public void mouseClicked(MouseEvent event){
    	   int tmp = turns;
    	   if(flag==1){
            int x = event.getX();
            int y = event.getY();
            xFrom = (x - 45) / 45; //get the cordinate
            yFrom = (y - 45) / 45;
            check = chessBoard.ifValidClicked(x, y, xFrom, yFrom);//need check the column clicked is valid
            if(check == true){
            	flag *= -1; //set condition
             	turns++;
        		   System.out.println("x = " + x + " y = " + y);
               System.out.println("Clicked");
            }
            else
               System.out.println("Please make another choice");//user clicked invalid position
    	   }
    	  else if(flag==-1 && tmp==turns){
            xTo = (event.getX() - 45)/45;//get the distant cordinate
            yTo = (event.getY() - 45)/45;
            if(chessBoard.checkDist(xFrom, yFrom, xTo, yTo)){
               chessBoard.move(yFrom, xFrom, yTo, xTo);    
               flag *= -1;
               //turns++;
               System.out.println("xTo = " + xTo + " yTo = " + yTo);  
               System.out.println("After clicked");
       	  	   repaint();
            }
            else 
               System.out.println("Please click a valid distance(click to a object with different color)");  
    	  }
      }
      public void mouseEntered(MouseEvent event){}
      public void mouseExited(MouseEvent event){}
   }

}