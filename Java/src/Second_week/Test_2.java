package Second_week;

import java.util.Scanner;

/*2.题目内容：
无线电台的 RS 制信号报告是由三两个部分组成的：
R(Readability) 信号可辨度即清晰度. S(Strength) 信号强度即大小. 其中 R 位于报告第一位，共分 5 级，用 1—5 数字表示.
 
1---Unreadable
2---Barely readable, occasional words distinguishable
3---Readable with considerable difficulty
4---Readable with practically no difficulty
5---Perfectly readable
报告第二位是 S，共分九个级别，用 1—9 中的一位数字表示
1---Faint signals, barely perceptible
2---Very weak signals
3---Weak signals
4---Fair signals
5---Fairly good signals
6---Good signals
7---Moderately strong signals
8---Strong signals
9---Extremely strong signals
现在，你的程序要读入一个信号报告的数字，然后输出对应的含义。如读到 59，则输出：
Extremely strong signals, perfectly readable. 
输入格式: 一个整数，信号报告。整数的十位部分表示可辨度，个位部分表示强度。输入的整数范围是
[11,59]，这个范围外的数字不可能出现在测试数据中。
输出格式：
一句话，表示这个信号报告的意义。按照题目中的文字，先输出表示强度的文字，跟上逗号
和空格，然后是表示可辨度的文字，跟上句号。注意可辨度的句子的第一个字母是小写的。
注意这里的标点符号都是英文的。
输入样例：
33
输出样例： Weak signals, readable with considerable difficulty
*/
public class Test_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int RS = sc.nextInt();
		int r = RS / 10 ; 
		int s = RS % 10 ; 
		switch( s ) {
			 case 1 : System.out.print("Faint signals, barely perceptible, ");
			 break;
			 case 2 : System.out.print("Barely readable, occasional words distinguishable, ");
			 break;	 
			 case 3 : System.out.print("Weak signals, ");
			 break;
			 case 4 : System.out.print("Fair signals, ");
			 break;
			 case 5 : System.out.print("Fairly good signals, ");
			 break;
			 case 6 : System.out.print("Good signals, ");
			 break;
			 case 7 : System.out.print("Moderately strong signals, ");
			 break;
			 case 8 : System.out.print("Strong signals, ");
			 break;
			 case 9 : System.out.print("Extremely strong signals, ");
			 break;
		}
		switch( r ) {
			 case 1 : System.out.print("unreadable.");
			 break;
			 case 2 : System.out.print("very weak signals.");
			 break;	 
			 case 3 : System.out.print("readable with considerable difficulty.");
			 break;
			 case 4 : System.out.print("readable with practically no difficulty.");
			 break;
			 case 5 : System.out.print("perfectly readable.");
			 break;
		}

	}

}
