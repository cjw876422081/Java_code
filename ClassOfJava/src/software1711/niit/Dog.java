package software1711.niit;

public class Dog extends Pet{

	//属性
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

	
	
	//主要操作的是本类的实例变量
	public void print() { 
		System.out.println("大家好！我的名字是"+ super.getName() + "健康值" +  super.getHealth()+ 
				"亲密度" +  super.getLove() + "品种" + this.strain );
		
	}
	public void eat() {
		if( super.getHealth() >= 100 )
		{
			System.out.println("不饿了");
		}else {
			super.setHealth(getHealth() + 3 );
		}
		
	}
	public void catchingFlyDisc() {
		super.setHealth(super.getHealth() - 10 );
		super.setLove(super.getLove() + 5 ) ;
	}

}
 