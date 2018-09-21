package software1711.niit;

public class ClassVar {

	private int i= 0 ; 
	private static int  j = 0 ; 
	public void print() {
		System.out.println("i = " + i );
		System.out.println("j = " + j );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassVar sc = new ClassVar();
		sc.j ++ ; 
		sc.i ++ ;
		sc.print();
		ClassVar sx = new ClassVar();
		sx.print();
	}
}
