package rectangle;

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		System.out.print("�����볤��");
		Scanner sc = new Scanner(System.in);
		int length  = sc.nextInt() ;
		System.out.print("�������");
		int wide = sc.nextInt() ;
		Rectangle A = new Rectangle( length , wide )  ; 
		System.out.println(A.area());
	}
}
