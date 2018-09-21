package Fourth_week;

import java.util.Scanner;

/*你的程序要读入一个整数，范围是[-100000,100000]。然后，用汉语拼音将这个整数
的每一位输出出来。
如输入1234，则输出：
yi er san si
注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。当遇到负数时，在输出
的开头加上“fu”，如-2341 输出为：
fu er san si yi
输入格式:
一个整数，范围是[-100000,100000]。
输出格式：
表示这个整数的每一位数字的汉语拼音，每一位数字的拼音之间以空格分隔，末尾没有空格。
输入样例：
-30
输出样例：
fu san ling*/
public class Test_2 {

	    public static void main(String args[]) {

	        Scanner sc=new Scanner(System.in);
	        String number= sc.nextLine();
	        sc.close();
	        readNumber( number ) ; 

	    }

		private static void readNumber(String ss) {
			int i,j;
			String[] num={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
			String[] wei={"","shi","bai","qian","wan","shi","bai","qian","yi","shi","bai"};
			String buffer=new String();
			boolean flag=true;
			if( ss.charAt(0) == '-')
			{
				System.out.printf("fu ");
			}
			for(i=0;i<ss.length();i++){
				for(j=0;j<10;j++){
					if(ss.charAt(i)!=j+'0')continue;
					if((ss.length()+2)%4==0&&i==0&&j==1){
						//最高的一组（四位一组）为10，读作shi
						buffer+=wei[ss.length()-1-i]+" ";
					}
					else if(i!=ss.length()-1&&j==0){//遇0
						if(flag){//遇第一个0
							buffer+=num[j]+" ";
							flag=false;//这样遇第二个0就不读
						}
					}
					else if(i==ss.length()-1&&j==0){//末尾为0
						if(!flag){//且倒数第二位也为0
							buffer=buffer.substring(0, buffer.length()-1-4);
						}
					}
					else{
						buffer+=num[j]+" "+wei[ss.length()-i-1]+" ";
						flag=true;
					}
				}
			}
			System.out.println(buffer);
			
		}

}	
