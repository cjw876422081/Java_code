package Calculator;

public class Customer {


	private String name ; 
	private int id ;
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public int calcTotalRent(MotorVehicle[]  cars  , int days ) {
		int sum = 0 ; 
		for(int i = 0 ; i < cars.length ; i ++ ){
			sum += cars[i].rent(days);
		}
		return sum ;
	}
}
