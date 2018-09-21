package ManagerRunSystem;

import java.util.Scanner;

public class ManageEmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("选择1.雇员或者2.经理");
		int choice = sc.nextInt() ; 
		System.out.println("输入信息");
		if( choice == 1 )
		{
			System.out.println("姓名 ，  年龄 ， 薪水 ， 雇佣日");
			Employee B = new Employee( sc.next() , sc.nextInt() , sc.nextInt() , sc.next());
			B.getInfo();
		}
		else if( choice == 2 ) {
			System.out.println("姓名 ，  年龄 ， 薪水 ， 雇佣日， 奖金， 假期");
			Manager A = new Manager( sc.next() , sc.nextInt() , sc.nextInt() , sc.next(), sc.nextInt() , sc.nextInt()  );
			A.getInfo();
			A.addSalary( 200 );
			A.getInfo();
		}
		
	}

}
