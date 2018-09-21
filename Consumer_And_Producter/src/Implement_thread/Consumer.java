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
						q.wait();  		//	���ڵȴ�״̬
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {				//����ⲻΪ��ʱ
					System.out.println("����������������������������������������");
					//ȡ����Ӧ������
					System.out.println("ѧ��������Ϊ:" + q.name) ;
					System.out.println("ѧ�����Ա�Ϊ:" + q.sex) ;
					q.flag = false ;
					q.notify();   //�����߳�
					
				}
				
			}
		}
		
	}
}