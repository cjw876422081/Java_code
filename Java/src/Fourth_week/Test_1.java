package Fourth_week;

import java.util.Scanner;

/*1.��Ŀ���ݣ�
������Ϊ2 �ǵ�һ��������3 �ǵڶ���������5 �ǵ������������������ơ�
���ڣ�������������n ��m��0<n<=m<=200����ĳ���Ҫ�����n ����������m ����
��֮�����е������ĺͣ�������n �������͵�m ��������
�����ʽ:
������������һ����ʾn���ڶ�����ʾm��
�����ʽ��
һ����������ʾ��n ����������m ������֮�����е������ĺͣ�������n �������͵�m
��������
����������
2 4
���������
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
