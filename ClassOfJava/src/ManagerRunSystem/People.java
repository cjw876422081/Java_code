package ManagerRunSystem;

public abstract class People {

	private String name ; 
	private int age ; 
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	
}
