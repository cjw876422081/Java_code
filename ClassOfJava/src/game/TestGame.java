package game;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game A = new Game();
		int cnt = 0 ; 
		do {
			A.init();
			System.out.println("是否查看分数 1.是 2. 否");
			Scanner sc = new Scanner(System.in) ; 
			if( sc.nextInt() == 1 )
			{
				System.out.println( A.getCount());
			}
			System.out.println("是否继续比赛 1.是 2.否");
			cnt = sc.nextInt() ; 
		}while(cnt != 2 ) ; 
		System.out.println("再见");
	}

}
