package Fourth_week;

import java.util.Scanner;

/*��ĳ���Ҫ����һ����������Χ��[-100000,100000]��Ȼ���ú���ƴ�����������
��ÿһλ���������
������1234���������
yi er san si
ע�⣬ÿ���ֵ�ƴ��֮����һ���ո񣬵��������ֺ���û�пո񡣵���������ʱ�������
�Ŀ�ͷ���ϡ�fu������-2341 ���Ϊ��
fu er san si yi
�����ʽ:
һ����������Χ��[-100000,100000]��
�����ʽ��
��ʾ���������ÿһλ���ֵĺ���ƴ����ÿһλ���ֵ�ƴ��֮���Կո�ָ���ĩβû�пո�
����������
-30
���������
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
						//��ߵ�һ�飨��λһ�飩Ϊ10������shi
						buffer+=wei[ss.length()-1-i]+" ";
					}
					else if(i!=ss.length()-1&&j==0){//��0
						if(flag){//����һ��0
							buffer+=num[j]+" ";
							flag=false;//�������ڶ���0�Ͳ���
						}
					}
					else if(i==ss.length()-1&&j==0){//ĩβΪ0
						if(!flag){//�ҵ����ڶ�λҲΪ0
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
