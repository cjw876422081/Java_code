package game;

public class User {

	private String name ;
	private int finger;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFinger() {
		return finger;
	}
	public void setFinger(int finger) {
		this.finger = finger;
	}
	public void game( ) {
		switch(this.finger)
		{
			case 1 : System.out.println("��ȭ : ʯͷ");
			break;
			case 2 : System.out.println("��ȭ : ����") ;
			break;
			case 3 : System.out.println("��ȭ : ����") ;
			break;
		}
	}
	

}