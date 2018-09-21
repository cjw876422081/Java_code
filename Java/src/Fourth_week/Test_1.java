package Fourth_week;

import java.util.Scanner;

/*1.题目内容：
我们认为2 是第一个素数，3 是第二个素数，5 是第三个素数，依次类推。
现在，给定两个整数n 和m，0<n<=m<=200，你的程序要计算第n 个素数到第m 个素
数之间所有的素数的和，包括第n 个素数和第m 个素数。
输入格式:
两个整数，第一个表示n，第二个表示m。
输出格式：
一个整数，表示第n 个素数到第m 个素数之间所有的素数的和，包括第n 个素数和第m
个素数。
输入样例：
2 4
输出样例：
15
*/
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in) ; 
		int n = sc.nextInt() ; 
		int m = sc.nextInt() ;
		int cnt = 0 , x = 2 , sum = 0 ; 
		do {
			int isPrime = 1 ; 
			for( int i = 2 ; i < x ; i ++ )
			{
				if( x % i == 0 ) {
					isPrime = 0 ;
					break ; 
				}
			}
	        if(isPrime==1){
	            cnt ++ ;
	            if( cnt >= n && cnt <= m ){   
	                sum += x ;             
	            }
	        }
	        x++;
		}while( 0 < cnt && cnt <= 200 );
		System.out.println(sum);

	}

}
