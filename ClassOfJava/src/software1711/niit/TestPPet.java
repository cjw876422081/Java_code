package software1711.niit;

public class TestPPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Dog dog = new Dog("xiaoxiao" , 80 , 70 , "����") ; 
		Penguin A = new Penguin("abc" , 20 , 30 ,"���1");*/
		Master mm = new Master("����" ,1000 ) ; 
	/*	dog.print();
		A.print();
		mm.feed(dog) ; 
		mm.feed(A) ; 
		dog.print();
		A.print();*/
		
		Pet pet = mm.getPet(1) ; 
		mm.feed(pet);
	}

}
