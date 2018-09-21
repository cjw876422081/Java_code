package Circle;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble() ; 
		circle A = new circle(n) ;
		System.out.println(A.area());
		System.out.println(A.perimeter());
	}

}
