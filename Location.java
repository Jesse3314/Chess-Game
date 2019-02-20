import java.awt.Point;
public class Location{
	private Point p;
	public Location(){
		p = new Point(0,0);
	}
	public Location(int row, int col){
		p = new Point(row,col);
	}
	
	public int getRow(){
		return (int)p.getX();
	}
	
	public int getCol(){
		return (int)p.getY();
	}

	public void setLocation(int row, int col){
		p.setLocation(row, col);
	}
	
}