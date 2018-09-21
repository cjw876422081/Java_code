package software1711.niit;

public class StaticStuff {

	 static int x ; 
	 static {System.out.println("x1 + " + x ); x += 5 ;}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("x2 = " + x );

	}
	static { System.out.println("x3 + " + x ); x %= 3 ;}

}
