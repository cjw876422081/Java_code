package software1711.niit;

import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ; 
		int x = sc.nextInt() ; 
		int y = sc.nextInt() ; 
		Point A = new Point(x , y ) ; 
		x = sc.nextInt();
		y = sc.nextInt() ; 
		Point B = new Point(x , y  ) ; 
		System.out.println( A.distance( B));
	}

}
