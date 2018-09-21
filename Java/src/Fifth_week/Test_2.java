package Fifth_week;

import java.util.Scanner;

/*嗯，就是视频里说的那个井字棋。视频里说了它的基本思路，现在，需要你把它全部实现出
来啦。
你的程序先要读入一个整数n，范围是[3,100]，这表示井字棋棋盘的边长。比如n=3 就
表示是一个3x3 的棋盘。然后，要读入n 行，每行n 个数字，每个数字是1 或0，依次表
示[0,0]到[n-1,n-1]位置上的棋子。1 表示X，0 表示O（大写字母O）。
你的程序要判断其中是否存在某一方获胜，获胜的条件是存在整行或整列或整条对角线或整
条反对角线上是相同的棋子。如果存在，则输出代表获胜一方字母：X 或O（大写字母X
或O）；如果没有任何一方获胜，则输出NIL（三个大写字母，中间是字母I（India 的I）。
注意：所给的棋盘上的棋子分布可能出现同一个棋子有多处满足获胜的条件，但是不会出现
两种棋子都获胜的情况。
输入格式:
一个代表棋盘大小的数字n，后面跟上nxn 个0 或1 的数字。
输出格式：
三种输出之一：
X
O
NIL
均为大写字母。
输入样例：
4
1 1 1 1
0 1 0 0
0 0 1 0
1 0 0 1
输出样例：
X*/
public class Test_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SIZE = sc.nextInt() ; 
		int[][] bg = new int [SIZE][SIZE] ; 
		boolean gotResult = false ; 
		for(int i = 0 ; i < SIZE ; i ++ ){
			for(int j = 0 ; j < SIZE ; j ++ ) {
				bg[i][j] = sc.nextInt();
			}
		}
		if(!gotResult) {					//行
			for(int i = 0 ; i < SIZE ; i ++ ) {
				int numA = 0 ; 
				int numB = 0 ; 
				for( int j = 0 ; j < SIZE; j ++ ) {
					if(bg[i][j] == 1 ) {
						numA ++ ; 
					}
					if(bg[i][j] == 0 ) {
						numB ++ ; 
					}
					if( numA == SIZE) {
						System.out.println("X");
						gotResult = true ;
						break ; 
					}
					else if( numB == SIZE ){
						System.out.println("O");
						gotResult = true ;
						break ; 
					}
				}
			}
		}
		// TODO Auto-generated method stub
		if(!gotResult) {					//列
			for(int i = 0 ; i < SIZE ; i ++ ) {
				int numA = 0 ; 
				int numB = 0 ; 
				for( int j = 0 ; j < SIZE; j ++ ) {
					if(bg[j][i] == 1 ) {
						numA ++ ; 
					}
					if(bg[j][i] == 0 ) {
						numB ++ ; 
					}
					if( numA == SIZE) {
						System.out.println("X");
						gotResult = true ;
						break ; 
					}
					else if(numB == SIZE){
						System.out.println("O");
						gotResult = true ;
						break ; 
					}
				}
			}
		}
		if(!gotResult) {					//对角线
			int numA = 0 ; 
			int numB = 0 ; 
			for( int i = 0 ; i < SIZE ; i ++ ) {
				if(bg[i][i] == 1 ) {
					numA ++ ; 
				}
				if(bg[i][i] == 0 ) {
					numB ++ ; 
				}
				if( numA == SIZE) {
					System.out.println("X");
					gotResult = true ;
					break ; 
				}
				else if(numB == SIZE){
					System.out.println("O");
					gotResult = true ;
					break ; 
				}
					
			}
			
		}
		if(!gotResult) {					//反对角线
			int numA = 0 ; 
			int numB = 0 ; 
			for( int i = 0 ; i < SIZE ; i ++ ) {
				if(bg[i][SIZE - i - 1 ] == 1 ) {
					numA ++ ; 
				}
				if(bg[i][SIZE - i - 1 ] == 0 ) {
					numB ++ ; 
				}
				if( numA == SIZE) {
					System.out.println("X");
					gotResult = true ;
					break ; 
				}
				else if(numB == SIZE){
					System.out.println("O");
					gotResult = true ;
					break ; 
				}
					
			}
		}
		if(!gotResult) {
			System.out.println("NIL");
		}
	}
}
