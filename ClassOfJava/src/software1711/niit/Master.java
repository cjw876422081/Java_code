package software1711.niit;

public class Master {
	private String  name ;
	private int money ; 

	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public void feed( Pet pet ) {
		pet.eat();
	}
	public Pet getPet( int  i ) {
		
		if( i == 1  )
		{
			Dog dog = new Dog("junjun" , 80 , 70 , "土狗") ;
			return  dog ; 
		}
		Penguin A = new Penguin("awang" , 20 , 30 ,"企鹅2");
		return  A; 
	}
	public void play(Pet pet) {
		if( pet instanceof Dog) { // 如果pet对象时dog类的实例的话
			Dog dog = (Dog)pet ;
			dog.catchingFlyDisc();//就把宠物对象强制转换dog类对象
		}else if(pet instanceof Penguin ) {
			Penguin qq = (Penguin) pet ;
			qq.swimming();
		}
	}
}
