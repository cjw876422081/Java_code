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
			Dog dog = new Dog("junjun" , 80 , 70 , "����") ;
			return  dog ; 
		}
		Penguin A = new Penguin("awang" , 20 , 30 ,"���2");
		return  A; 
	}
	public void play(Pet pet) {
		if( pet instanceof Dog) { // ���pet����ʱdog���ʵ���Ļ�
			Dog dog = (Dog)pet ;
			dog.catchingFlyDisc();//�Ͱѳ������ǿ��ת��dog�����
		}else if(pet instanceof Penguin ) {
			Penguin qq = (Penguin) pet ;
			qq.swimming();
		}
	}
}
