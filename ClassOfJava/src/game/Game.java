package game;

import java.util.Scanner;

public class Game {
	User person = new User(); 
	Computer machine  = new Computer();
	private int count ;
	public int getCount() {
		return count;
	}
	public void init() {
		System.out.println("��ӭ�����˻���ս");
		System.out.println("��������");
		System.out.println("1.ʯͷ  2.����  3.����  �� �������ּ��� �� ���������ȭ");
		System.out.println("******************************************************");
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("���������������");
		String name = sc.next() ; 
		person.setName(name);
		System.out.println("������1.ʯͷ  2.����  3.���� ����һ������ ");
		int finger = sc.nextInt() ; 
		person.setFinger(finger);
		int finger2 = machine.showFirst() ;
		play( finger , finger2 ) ; 
	}
	public void play( int a , int b) {
		boolean win = false ; 
		if( a == 1 ) {
			 if( b == 1) {
				 return ; 
			 }else if(b == 2 ) {
				 count -- ; 
			 }else if(b == 3 ) {
				 count ++ ; 
				 win = true ; 
			 }
		}else if(a == 2 ) {
			if( b == 1) {
				 count ++ ; 
				 win = true ; 
			 }else if(b == 2 ) {
				 return ; 
			 }else if(b == 3 ) {
				 count -- ; 
			 }
		}else if(a == 3 ) {
			if( b == 1) {
				 count -- ; 
			 }else if(b == 2 ) {
				 count ++ ; 
				 win = true ; 
			 }else if(b == 3 ) {
				 return ; 
			 }
		}
			
		if( win == true ) {
			System.out.println("�˾�" + person.getName() + "��ʤ��");
		}else {
			System.out.println("�˾�" + person.getName() + "����");
		}
	}

}