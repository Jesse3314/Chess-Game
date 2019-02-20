import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class ChessBoard extends Board{
	private static int SIZE = 8;

   public ChessBoard(){
 		super(SIZE,SIZE);
	}
      
	public ChessBoard(int row, int col){
		super(row, col);
      populate();
		//Piece bp = new Pawn(Def.BLACK);
		//place(new Pawn(Def.BLACK), 2, 2);
		//pieces[2][2] = (bp);
      //chessBoardSystem.out
      //pieces[1][2].place(4, 4);
	}
   
   public void paint(Graphics2D g2){//Ask each background to print itself
      super.paint(g2);
      for(int i = 0; i < pieces.length; i ++){
         for(int j = 0; j < pieces[0].length; j++){
            pieces[i][j].paint(g2);
         }
      }
   }
   

 	public void populate(){
      //placeBoarders();
 		placeBlack();
 		placeWhite();
 		// fill the rest with Dummies
 		for(int i=2; i<SIZE-2; i++){
 			for(int j=0; j<SIZE; j++){
				place (new Dummy(), i,j);
 			}
 		}
 	}

   //original code below
 	private void placeBoarders(){
 		place(new Dummy(),0,0);  // set top-left corner
 		for(int i=SIZE; i>=1; i--){
 			place (new Title((char)(i-1+'a')),0,i);
 		}
 		for(int j=1; j<=SIZE; j++){
 			place (new Title((char)('9'-j)),j,0);
 		}
 	}
   
    	private void placeBlack(){
 		place(new Rook(Def.BLACK), 0, 0);
 		place(new Rook(Def.BLACK), 0, 7);

 		place(new Knight(Def.BLACK), 0, 1);
 		place(new Knight(Def.BLACK), 0, 6);

 		place(new Bishop(Def.BLACK), 0, 2);
 		place(new Bishop(Def.BLACK), 0, 5);

 		place(new Queen(Def.BLACK), 0, 3);
 		place(new King(Def.BLACK), 0, 4);

 		for(int j=0; j<SIZE; j++){
 			place (new Pawn(Def.BLACK), 1, j);
 		}
 	}

 	private void placeWhite(){
 		place(new Rook(Def.WHITE), 7, 0);
 		place(new Rook(Def.WHITE), 7, 7);
 		place(new Knight(Def.WHITE), 7, 1);
 		place(new Knight(Def.WHITE), 7, 6);
 		place(new Bishop(Def.WHITE), 7,2);
 		place(new Bishop(Def.WHITE), 7, 5);
 		place(new Queen(Def.WHITE), 7, 3);
 		place(new King(Def.WHITE), 7, 4);
 		for(int j=0; j<SIZE; j++){
 			place(new Pawn(Def.WHITE), 6,j);
 		}
 	}
/*
 	private void placeBlack(){
 		place(new Rook(Def.BLACK),1,1);
 		place(new Rook(Def.BLACK),1,8);

 		place(new Knight(Def.BLACK),1,2);
 		place(new Knight(Def.BLACK),1,7);

 		place(new Bishop(Def.BLACK),1,3);
 		place(new Bishop(Def.BLACK),1,6);

 		place(new Queen(Def.BLACK),1,4);
 		place(new King(Def.BLACK),1,5);

 		for(int j=1; j<=SIZE; j++){
 			place (new Pawn(Def.BLACK), 2,j);
 		}
 	}

 	private void placeWhite(){
 		place(new Rook(Def.WHITE),8,1);
 		place(new Rook(Def.WHITE),8,8);
 		place(new Knight(Def.WHITE),8,2);
 		place(new Knight(Def.WHITE),8,7);
 		place(new Bishop(Def.WHITE),8,3);
 		place(new Bishop(Def.WHITE),8,6);
 		place(new Queen(Def.WHITE),8,4);
 		place(new King(Def.WHITE),8,5);
 		for(int j=1; j<=SIZE; j++){
 			place(new Pawn(Def.WHITE), 7,j);
 		}
 	}
   */
   public boolean ifValidClicked(int x, int y, int xCord, int yCord){
      if (y>45&&y<405&&x>45&&x<405){//out of boundary
         if(pieces[yCord][xCord].getType()!=0)//make sure user didnt click Dummy
            return true;
      }
      return false;
   }
   
   public boolean checkDist(int xFrom, int yFrom, int xTo, int yTo){
      if(pieces[yFrom][xFrom].getColor() == pieces[yTo][xTo].getColor())
         return false;
      return true;
   }
}
