package game;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game A = new Game();
		int cnt = 0 ; 
		do {
			A.init();
			System.out.println("�Ƿ�鿴���� 1.�� 2. ��");
			Scanner sc = new Scanner(System.in) ; 
			if( sc.nextInt() == 1 )
			{
				System.out.println( A.getCount());
			}
			System.out.println("�Ƿ�������� 1.�� 2.��");
			cnt = sc.nextInt() ; 
		}while(cnt != 2 ) ; 
		System.out.println("�ټ�");
	}

}
