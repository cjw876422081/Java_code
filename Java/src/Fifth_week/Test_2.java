package Fifth_week;

import java.util.Scanner;

/*�ţ�������Ƶ��˵���Ǹ������塣��Ƶ��˵�����Ļ���˼·�����ڣ���Ҫ�����ȫ��ʵ�ֳ�
������
��ĳ�����Ҫ����һ������n����Χ��[3,100]�����ʾ���������̵ı߳�������n=3 ��
��ʾ��һ��3x3 �����̡�Ȼ��Ҫ����n �У�ÿ��n �����֣�ÿ��������1 ��0�����α�
ʾ[0,0]��[n-1,n-1]λ���ϵ����ӡ�1 ��ʾX��0 ��ʾO����д��ĸO����
��ĳ���Ҫ�ж������Ƿ����ĳһ����ʤ����ʤ�������Ǵ������л����л������Խ��߻���
�����Խ���������ͬ�����ӡ�������ڣ�����������ʤһ����ĸ��X ��O����д��ĸX
��O�������û���κ�һ����ʤ�������NIL��������д��ĸ���м�����ĸI��India ��I����
ע�⣺�����������ϵ����ӷֲ����ܳ���ͬһ�������жദ�����ʤ�����������ǲ������
�������Ӷ���ʤ�������
�����ʽ:
һ���������̴�С������n���������nxn ��0 ��1 �����֡�
�����ʽ��
�������֮һ��
X
O
NIL
��Ϊ��д��ĸ��
����������
4
1 1 1 1
0 1 0 0
0 0 1 0
1 0 0 1
���������
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
		if(!gotResult) {					//��
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
		if(!gotResult) {					//��
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
		if(!gotResult) {					//�Խ���
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
		if(!gotResult) {					//���Խ���
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
