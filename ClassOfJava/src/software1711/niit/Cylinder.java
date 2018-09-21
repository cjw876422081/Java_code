package software1711.niit;

public class Cylinder extends Circle {
	private double hight ;

	public Cylinder(double radius, double hight) {
		super(radius);
		this.hight = hight;
	} 
	public double getVolume() {
		return super.getArea() * this.hight ; 
	}
	public void showVolume() {
		
		System.out.println(this.getVolume());
	}

}
