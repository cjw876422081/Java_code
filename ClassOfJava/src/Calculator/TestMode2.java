package Calculator;

public class TestMode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorVehicle[] cars = new MotorVehicle[4] ;
		cars[0] = new Car("����" ,"123");
		cars[1] = new Car("�µ�" , "234 ") ; 
		cars[2] = new Bus("����" , "789" , 34 );
		cars[3] = new Truck("����" , "753" , 5) ; 
		Customer A = new Customer("abc" , 123) ; 
		System.out.println( A.calcTotalRent(cars ,  5 ));
	}

}
