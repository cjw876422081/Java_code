package Student;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.sun.swing.internal.plaf.basic.resources.basic;

public class TestStudnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[5];  
		Student A = new Student(1 , "张三" , "男" , 10 , 90.0);
		A.print();
		Student B = new Student();
		B.setsNo(2);
		B.setsName("王五");
		B.setsSex("男");
		B.setsAge(15);
		B.setsJava(91.0);
		B.print();
		Student C = new Student(11 , 92 );
		C.setsNo(3);
		C.setsName("赵六");
		C.print();
		Student D = new Student("女" ,11 , 93.0 );
		D.setsNo(4);
		D.setsName("张辉");
		D.print();
		Student E = new Student("李四" , "男", 16 , 94.0 );
		E.setsNo(5);
		E.print();
		
		students[0] = A ; 
		students[1] = B ; 
		students[2] = C ; 
		students[3] = D ; 
		students[4] = E ; 
		double sum = 0 , max= 0  , min =  students[0].getsJava() ;
		int i = 0 ; 
		while( i < 5 ) {
			sum += students[i].getsJava();
			
			if( max <= students[i].getsJava()) {
				max = students[i].getsJava() ;
			}
			if(min >= students[i].getsJava()) {
				min = students[i].getsJava() ; 
			}
			i ++ ;  
		}
		System.out.println("平均成绩" + (sum/5) + "最高成绩" + max + "最低成绩" + min );
				
		
	}

}
