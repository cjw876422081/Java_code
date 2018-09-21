package First_week;

import java.util.Scanner;

/*程序设计入门—Java 语言
第一周编程作业
题目内容：
写一个将华氏温度转换成摄氏温度的程序，转换的公式是：
°F = (9/5)*°C + 32
其中C 表示摄氏温度，F 表示华氏温度。
程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：
(int)x;
其中x 是要转换的那个浮点数。
输入格式:
一个整数。
输出格式：
一个整数
输入样例：
100
输出样例：
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
