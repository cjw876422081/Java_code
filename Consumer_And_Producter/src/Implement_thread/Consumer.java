package Implement_thread;

public class Consumer implements Runnable {

	StoreHouse q  ;
	public Consumer (StoreHouse q) {
		this.q = q ; 
		
	}
	@Override
	public void run() {
		while(true) {
			synchronized (q) {
				if(!q.flag) {
					 try{
						q.wait();  		//	处于等待状态
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {				//储存库不为空时
					System.out.println("————————————————————");
					//取出相应的数据
					System.out.println("学生的名字为:" + q.name) ;
					System.out.println("学生的性别为:" + q.sex) ;
					q.flag = false ;
					q.notify();   //唤醒线程
					
				}
				
			}
		}
		
	}
}