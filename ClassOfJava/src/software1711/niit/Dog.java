package software1711.niit;

public class Dog extends Pet{

	//����
	/*private String name ;
	private int health ;
	private int love ;*/
	private String strain ; 
	public Dog(String name, int health, int love, String strain) {
		super(name , health , love ); 
		
		/*this.name = name;
		this.health = health;
		this.love = love;*/
		this.strain = strain;
	}

	
	
	//��Ҫ�������Ǳ����ʵ������
	public void print() { 
		System.out.println("��Һã��ҵ�������"+ super.getName() + "����ֵ" +  super.getHealth()+ 
				"���ܶ�" +  super.getLove() + "Ʒ��" + this.strain );
		
	}
	public void eat() {
		if( super.getHealth() >= 100 )
		{
			System.out.println("������");
		}else {
			super.setHealth(getHealth() + 3 );
		}
		
	}
	public void catchingFlyDisc() {
		super.setHealth(super.getHealth() - 10 );
		super.setLove(super.getLove() + 5 ) ;
	}

}
 