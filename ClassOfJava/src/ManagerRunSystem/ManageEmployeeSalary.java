package ManagerRunSystem;

import java.util.Scanner;

public class ManageEmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ѡ��1.��Ա����2.����");
		int choice = sc.nextInt() ; 
		System.out.println("������Ϣ");
		if( choice == 1 )
		{
			System.out.println("���� ��  ���� �� нˮ �� ��Ӷ��");
			Employee B = new Employee( sc.next() , sc.nextInt() , sc.nextInt() , sc.next());
			B.getInfo();
		}
		else if( choice == 2 ) {
			System.out.println("���� ��  ���� �� нˮ �� ��Ӷ�գ� ���� ����");
			Manager A = new Manager( sc.next() , sc.nextInt() , sc.nextInt() , sc.next(), sc.nextInt() , sc.nextInt()  );
			A.getInfo();
			A.addSalary( 200 );
			A.getInfo();
		}
		
	}

}
