package rectangle;

public class Rectangle {
	private int length ;
	private int wide ;
	public Rectangle(int length,  int wide) {
		super();
		this.length = length ; 
		this.wide = wide ;
	}
	public int  area() {
		return this.length * this.wide ;
	}
	
	
}
