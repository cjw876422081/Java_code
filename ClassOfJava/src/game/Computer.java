package game;

public class Computer {

	private String name = "电脑" ;
	private int finger ; 
	public int showFirst() {
		this.finger = (int) ((Math.random() * 10) % 3  + 1)  ;
		switch(this.finger)
		{
			case 1 : System.out.println("出拳 : 石头");
			break;
			case 2 : System.out.println("出拳 : 剪刀") ;
			break;
			case 3 : System.out.println("出拳 : 布子") ;
			break;
		}
		return this.finger ; 
	}
	
}
