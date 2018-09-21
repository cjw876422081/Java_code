package Calculator;

public class Truck extends MotorVehicle{


	private int load ;
	public Truck(String name, String number , int load ) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.load = load ;
	}
	public int rent( int days ) {
		return load  * days * 100  ; 
	}
	
}
