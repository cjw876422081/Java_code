package Fifth_week;

import java.util.Scanner;

/*һ������ʽ���Ա��Ϊx �ĸ�������ϵ���˻��ĺͣ����磺
���ڣ���ĳ���Ҫ������������ʽ��Ȼ���������������ʽ�ĺͣ�Ҳ���ǰѶ�Ӧ�����ϵ�ϵ
�����Ȼ�������
����Ҫ����������Ϊ100��
�����ʽ:
�ܹ�Ҫ������������ʽ��ÿ������ʽ�������ʽ���£�
ÿ�������������֣���һ����ʾ�ݴΣ��ڶ�����ʾ���ݴε�ϵ�������е�ϵ��������������
һ��һ��������ݣ����һ��һ����0 ���ݡ�
ע���һ�к����һ��֮�䲻һ�������ݴν���˳�����У����ĳ���ݴε�ϵ��Ϊ0���Ͳ�
�����������������ˣ�0 ���ݵ�ϵ��Ϊ0 ʱ���ǻ���������������С�
�����ʽ��
������ݿ�ʼ���ν���0 �ݣ��磺
2x6+3x5+12x3-6x+20
ע�����е�x ��Сд��ĸx���������еķ���֮�䶼û�пո����ĳ���ݵ�ϵ��Ϊ0 ��
����Ҫ�����
����������
6 2
5 3
3 12
1 6
0 20
6 2
5 3
2 12
1 6
0 20
���������
4x6+6x5+12x3+12x2+12x+40*/
public class Test_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num = new int [2][101];
		int power_num , max_power = 0  ; 
		boolean isFirst = true ; 
		for( int i = 0 ; i < 2 ; i ++ ) {
			power_num = sc.nextInt() ;
			if( max_power < power_num ) {
				max_power = power_num ; 
			}
			num[i][power_num] = sc.nextInt();
			if(power_num == 0) continue ;
			while(power_num != 0 ) {
				power_num = sc.nextInt();
				num[i][power_num] += sc.nextInt();
			}
		}
		for(int i = max_power ; i >= 0; i --) {
			if(max_power == 0 ) {
				System.out.print(num[0][i] + num[1][i]);
				break;
			}
			if(num[0][i] + num[1][i] != 0 ) {
				if(!isFirst) {
					if(num[0][i] + num[1][i] >= 0 ) {
						System.out.print("+");
					}
				}
			}
			if(num[0][i] + num[1][i] != i || i == 0 ) {
				System.out.print(num[0][i] + num[1][i]);
			}
			if( i != 0 ) {
				System.out.print("x");
			}
			if( i != 0 && i != 1 ) {
				System.out.print(i);
			}
			isFirst = false ; 
		}
		if( isFirst && (num[0][0] + num[1][0]) == 1 ) {
			System.out.print(num[0][0] + num[1][0]);
		}
		// TODO Auto-generated method stub

	}

}
