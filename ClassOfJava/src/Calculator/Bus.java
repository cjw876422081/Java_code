package Calculator;
/*
public class Bus extends CalcRent {
	private int seatCounts ;

	public Bus(int number, String brand, String color, int mileage , int seatCounts) {
		super(number, brand, color, mileage ) ; 
		this.seatCounts = seatCounts;
	} s
	
	public final int price(int days){
		int rent  = 0 ; 
		if( this.seatCounts > 16) {
			rent = 1500 ; 
		}
		else {
			rent = 800 ; 
		}
		return days * rent ; 
		
	}
	public void print() {
		System.out.println("���ƺţ�"+super.getNumber() + " Ʒ�� " + super.getBrand() + 
				"��ɫ" + super.getColor() + "���" + super.getMileage() + "��λ" + this.seatCounts);
	}

}*/
public class Bus extends MotorVehicle {



	private int seatCounts ;
	public Bus(String name, String number, int seatCounts) {
		super(name, number);
		this.seatCounts = seatCounts ; 
		
		// TODO Auto-generated constructor stub
	}
	
	public int rent(int days){
		int money  = 0 ; 
		if( this.seatCounts > 16) {
			money = 1500 ; 
		}
		else {
			money = 800 ; 
		}
		return days * money ; 
		
	}

}