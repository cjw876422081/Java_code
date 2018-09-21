package software1711.niit;

public class Circle {

	private double radius ;

	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
		this.radius = 0 ;
	}
	
	public double getArea() {
		return this.radius * this.radius * 3.14 ; 
	}
	public double getPerimeter() {
		return 2 * this.radius * 3.14 ; 
	}
	public void  show () {
		System.out.println(this.radius);
		System.out.println(this.getArea());
		System.out.println(this.getPerimeter());
	}
}
