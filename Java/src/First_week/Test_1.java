package First_week;

import java.util.Scanner;

/*����������š�Java ����
��һ�ܱ����ҵ
��Ŀ���ݣ�
дһ���������¶�ת���������¶ȵĳ���ת���Ĺ�ʽ�ǣ�
��F = (9/5)*��C + 32
����C ��ʾ�����¶ȣ�F ��ʾ�����¶ȡ�
�����������һ����������ʾ�����¶ȡ������Ӧ�������¶ȣ�Ҳ��һ��������
��ʾ��Ϊ�˰Ѽ������ĸ�����ת������������Ҫʹ������ı��ʽ��
(int)x;
����x ��Ҫת�����Ǹ���������
�����ʽ:
һ��������
�����ʽ��
һ������
����������
100
���������
37
*/
public class Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt() ;
		int y = ( x - 32) * 5 / 9 ; 
		System.out.println(y);
		
	}

}
