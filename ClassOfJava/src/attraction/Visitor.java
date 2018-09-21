package attraction;

public class Visitor {

	private String name ;
	private int age ;

	public Visitor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}
	public int price () {
		if( age >= 60 ) {
			return 0 ; 
		}
		if( age <= 18 ) {
			return 10 ; 
		}
		else {
			return 20 ; 
		}
	}

}
