package software1711.niit;

public class Penguin extends Pet {

	/*private String name ;
	private int health ;
	private int love ;*/
	private String sex ; 
	public Penguin(String name, int health, int love, String sex) {
		super(name , health , love ); 
		/*this.name = name;
		this.health = health;
		this.love = love;*/
		this.sex = sex;
	}
	/*public void print() { 
		System.out.println("��Һã��ҵ�������"+ super.getName() + "����ֵ" +  super.getHealth()+ 
				"���ܶ�" +  super.getLove() +  "����" + this.sex );
		
	}*/
	public void eat(){
		if( super.getHealth() >= 100 )
		{
			System.out.println("������");
		}else {
			super.setHealth(getHealth() + 5 );
		}
	}
	public void swimming() {
		super.setHealth(super.getHealth() - 10 );
		super.setLove(super.getLove() + 5 ) ;
	}
}
