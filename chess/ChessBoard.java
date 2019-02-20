public class ChessBoard extends Board{
	
	private static int SIZE = 8;


	public ChessBoard(){
		super(SIZE+1,SIZE+1);
	}

	public void populate(){
		
		placeBoarders();
		placeBlack();
		placeWhite();
		// fill the rest with Dummies
		for(int i=3; i<=SIZE-2; i++){
			for(int j=1; j<=SIZE; j++){
				place (new Dummy(), i,j);
			}
		}

	}
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
			place (new Pawn(Def.WHITE), 7,j);
		}
	}

}