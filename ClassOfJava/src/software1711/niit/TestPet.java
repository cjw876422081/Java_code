package software1711.niit;

public class TestPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("xiaoxiao" , 80 , 70 , "土狗");
		Dog dog2 = new Dog("xiaoxiao2" , 80 , 70 , "土狗2");
		Penguin A = new Penguin("abc" , 20 , 30 ,"企鹅1");
		Penguin B = new Penguin("abc" , 20 , 30 ,"企鹅1");
		dog1.print();
		dog2.print();
		A.print();
		B.print();
	}

}
