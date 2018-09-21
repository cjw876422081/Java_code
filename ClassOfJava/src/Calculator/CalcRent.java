package Calculator;

public abstract class CalcRent {

	private int number ;
	private String brand ;
	private String color ; 
	private int Mileage ;
	public CalcRent(int number, String brand, String color, int mileage) {
		super();
		this.number = number;
		this.brand = brand;
		this.color = color;
		this.Mileage = mileage;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMileage() {
		return Mileage;
	}
	public void setMileage(int mileage) {
		Mileage = mileage;
	}
	public abstract int pricce(int days) ; 
	public abstract void print() ; 
}
