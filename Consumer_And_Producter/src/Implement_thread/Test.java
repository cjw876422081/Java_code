package Implement_thread;

public class Test {

	public static void main(String[] args) {
		StoreHouse q = new StoreHouse();
		new Thread(new Producer(q)).start();
		try {
			Thread.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		
		}
		new Thread(new Consumer(q)).start();
}
}
