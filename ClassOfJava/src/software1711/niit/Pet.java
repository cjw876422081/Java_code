package software1711.niit;

/**
 * 
 * @author user
 *
 */
public abstract class Pet {


	private String name ;
	private int health ;
	private int love ;
	public Pet(String name, int health, int love) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
	}
	
	public void print()
	{
		System.out.println("大家好！我的名字是"+ this.name + "健康值" +  this.health+ 
				"亲密度" +  this.love);
	}
	public abstract void eat() ; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
}
