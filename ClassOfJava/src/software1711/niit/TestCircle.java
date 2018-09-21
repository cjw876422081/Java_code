package software1711.niit;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ; 
		Cylinder zt = new Cylinder(sc.nextInt() ,sc.nextDouble()) ; 
		zt.show();
		zt.showVolume();
	}

}
