package software1711.niit;

public class Point {

	private  int x ; 
	private int y ; 
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public  double distance(  Point b) {
		return Math.sqrt((this.x - b.x)* (this.x - b.x) + (this.y - b.y)*(this.y - b.y)) ; 
	}

}
	