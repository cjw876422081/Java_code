package Calculator;

public abstract class MotorVehicle {


	private String name  ; 
	private String number ; 
	
	public MotorVehicle(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	public abstract int rent(int days  );
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	
}
