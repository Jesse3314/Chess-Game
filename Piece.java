import java.awt.Point;
import java.awt.Graphics2D;
public abstract class Piece{

	public Location location; // You need this method for Bonus part
	private char color;
  public int colorNum;

	public Piece(){
		location = new Location(0,0);
		this.color = Def.NO_COLOR;
	}

	public Piece(char color){
		location = new Location(0,0);
		this.color=color;
      this.colorNum = (int) color;
	}

	public void place(int row, int col){
		location.setLocation(row, col);
	}

	public Location getLocation(){
		return location;
	}

	//public char getColor(){
		//return color;
	//}

	abstract public void paint(Graphics2D g2);

	abstract public int getType(); // that returns the type of the piece such as PAWN
	abstract public int getColor();// that returns the color of the piece such as BLACK
}
