package Third_week;

import java.util.Scanner;

/*1.��Ŀ���ݣ�
��ĳ���Ҫ����һϵ�����������ݣ�����-1 ��ʾ���������-1 ��������������ݡ���
����������������е�������ż���ĸ�����
�����ʽ:
һϵ���������������ķ�Χ�ǣ�0,100000�����������-1 ���ʾ���������
�����ʽ��
������������һ��������ʾ���������е������ĸ������ڶ���������ʾ���������е�ż����
��������������֮���Կո�ָ���
����������
9 3 4 2 5 7 -1
���������
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
