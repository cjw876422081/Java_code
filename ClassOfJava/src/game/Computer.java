package game;

public class Computer {

	private String name = "����" ;
	private int finger ; 
	public int showFirst() {
		this.finger = (int) ((Math.random() * 10) % 3  + 1)  ;
		switch(this.finger)
		{
			case 1 : System.out.println("��ȭ : ʯͷ");
			break;
			case 2 : System.out.println("��ȭ : ����") ;
			break;
			case 3 : System.out.println("��ȭ : ����") ;
			break;
		}
		return this.finger ; 
	}
	
}
