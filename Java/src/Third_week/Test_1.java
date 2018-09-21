package Third_week;

import java.util.Scanner;

/*1.题目内容：
你的程序要读入一系列正整数数据，输入-1 表示输入结束，-1 本身不是输入的数据。程
序输出读到的数据中的奇数和偶数的个数。
输入格式:
一系列正整数，整数的范围是（0,100000）。如果输入-1 则表示输入结束。
输出格式：
两个整数，第一个整数表示读入数据中的奇数的个数，第二个整数表示读入数据中的偶数的
个数。两个整数之间以空格分隔。
输入样例：
9 3 4 2 5 7 -1
输出样例：
4 2*/
public class Test_1 {

	public static void main(String[] args) {
		int odd_number = 0 ;
		int even_number = 0 ; 
		while(true) {
			Scanner in = new Scanner(System.in);
			int x = in.nextInt() ;
			if( x == -1 ) {
				break ; 
			}
			else if( x % 2 == 0) {
				even_number ++ ; 
			}
			else {
				odd_number ++ ; 
			}	
		}
		System.out.printf("%d %d\n" , odd_number , even_number);
	}

}
