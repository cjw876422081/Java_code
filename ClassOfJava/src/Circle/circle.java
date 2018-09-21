package Circle;

public class circle {
	private double circle ; 
	
	public circle() {
		
	}
	public circle( double circle) {
		 this.circle = circle ; 
	}
	public double area() {
		return this.circle * Math.PI * this.circle; 
	}
	public double perimeter() {
		return this.circle * 2 * Math.PI ; 
	}

}
