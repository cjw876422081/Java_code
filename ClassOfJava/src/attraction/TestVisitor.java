package attraction;

import java.util.Scanner;

public class TestVisitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������������֣�");
		Scanner sc = new Scanner(System.in);
		String name  = sc.nextLine() ;
		System.out.print("������������䣺");
		int age = sc.nextInt() ;
		Visitor person = new Visitor(name, age);
		System.out.println(person.price());
				
	}

}
