import java.awt.Graphics2D;
import java.awt.Graphics;
public class Board{
   private BackGround[][] theBackGround;
   private int row, col;
   private String white, black;
   private int initialX, initialY;
   private int picHeight, picWidth;
   public static Piece[][] pieces = new Piece[8][8];;//populate it with Dummy objects.

   public Board(int row, int col){
      //ChessBoard cb = new ChessBoard(8, 8);
      this.row = row;
      this.col = col;
      theBackGround = new BackGround[row][col];
      black = "image/black.PNG";
      white = "image/white.PNG";
      initialX = 45;
      initialY = 45;
      picHeight = 45;
      picWidth = 45;
      pieces = new Piece[row][col];
      //System.out.println("Row = " + row + " Col = " + col);
      initializeBackGround();
      //populateDummy();
   }

   public void initializeBackGround(){
      int flag = 1;
      for(int i = 0; i < theBackGround.length; i++){
         int x = initialX;
         for(int j = 0; j < theBackGround[0].length; j++){
            if(flag == 1){
               BackGround bg = new BackGround(white, x, initialY);
               x = x + picWidth;
               theBackGround[i][j] = bg;
            }
            if(flag == -1){
               BackGround bg = new BackGround(black, x,initialY);
               x = x + picWidth;
               theBackGround[i][j] = bg;
            }
            flag *= -1;
         }
         initialY += picHeight;
         flag *= -1;
      }
   }

   public void paint(Graphics2D g2){//Ask each background to print itself
      for(int i = 0; i < theBackGround.length; i++){
         for(int j = 0; j < theBackGround.length; j++){
            theBackGround[i][j].paint(g2);
         }
      }
      /*
      Piece bp = new Pawn(Def.BLACK);
      place(bp, 2, 2);
      pieces[2][2] = (bp);
      pieces[2][2].paint(g2);
      */
      // for(int i = 3; i <= pieces.length -2 ; i ++){
      //    for(int j = 1; j <= pieces[0].length; j++){
      //       //pieces[i][j].paint(g2);
      //    }
      // }
   }

   public void populateDummy(){//In Phase 2.3, populate Piece[][] pieces with Dummy objects.
      for(int i = 3; i <= pieces.length -2 ; i ++){
         for(int j = 1; j <= pieces[0].length; j++){
            place(new Dummy(), i, j);
         }
      }
   }

   public void place(Piece p, int rowP, int colP){
      pieces[rowP][colP] = p;
      p.place(rowP, colP);
   }
   
   public void move(int row1, int col1, int row2, int col2){
		pieces[row1][col1].place(row2,col2); // set the pieces know its new position
		pieces[row2][col2] = pieces[row1][col1]; // relocate the piece on the board
		remove(row1,col1);
	}
	
	public void remove(int row, int col){
		pieces[row][col] = new Dummy();
		pieces[row][col].place(row,col);
	}
	
	public Piece look (int row, int col){
		return pieces[row][col];
	}
}