package Calculator;
/*
public class Car extends CalcRent {
	private String type ; 
	public Car(int number, String brand, String color, int mileage ,String type) {
		super(number, brand, color, mileage ) ; 
		this.type = type;
	} 
	public final int price(int days){
		int rent  = 0 ; 
		if( this.type.equals( "a1")) {
			rent = 300 ; 
		}
		else if( this.type.equals("b1")){
			rent = 500 ; 
		}
		else if( this.type.equals("c1")) {
			rent = 800 ; 
		}
		return days * rent ; 
		
	}
	public void print() {
		System.out.println("车牌号："+super.getNumber() + " 品牌 " + super.getBrand() + 
				"颜色" + super.getColor() + "里程" + super.getMileage() + "型号" + this.type);
	}
}
*/
public class Car extends MotorVehicle {

	public Car(String name, String number) {
		super(name, number);
		// TODO Auto-generated constructor stub
	}
	public int rent( int days ) {
		int money = 0 ; 
		if( this.getName().equals("宝马")) {
			money = 500 ; 
		}else if(  this.getName().equals("奥迪")) {
			money = 800 ; 
		}
		return money * days ; 
	}
	

}