import java.awt.Point;

public abstract class Piece{

	private Location location; // You need this method for Bonus part
	private char color;
	public Piece(){
		location = new Location(0,0);
		this.color = Def.NO_COLOR;
	}
	
	public Piece(char color){
		location = new Location(0,0);
		this.color=color;
	}

	public void place(int row, int col){
		location.setLocation(row, col);
	}
	
	public Location getLocation(){
		return location;
	}

	public char getColor(){
		return color;
	}
	abstract public void paint(Object media);
	abstract public int getType();
}


