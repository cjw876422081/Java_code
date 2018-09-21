package Fifth_week;

import java.util.Scanner;

/*一个多项式可以表达为x 的各次幂与系数乘积的和，比如：
现在，你的程序要读入两个多项式，然后输出这两个多项式的和，也就是把对应的幂上的系
数相加然后输出。
程序要处理的幂最大为100。
输入格式:
总共要输入两个多项式，每个多项式的输入格式如下：
每行输入两个数字，第一个表示幂次，第二个表示该幂次的系数，所有的系数都是整数。第
一行一定是最高幂，最后一行一定是0 次幂。
注意第一行和最后一行之间不一定按照幂次降低顺序排列；如果某个幂次的系数为0，就不
出现在输入数据中了；0 次幂的系数为0 时还是会出现在输入数据中。
输出格式：
从最高幂开始依次降到0 幂，如：
2x6+3x5+12x3-6x+20
注意其中的x 是小写字母x，而且所有的符号之间都没有空格，如果某个幂的系数为0 则
不需要有那项。
输入样例：
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
输出样例：
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
