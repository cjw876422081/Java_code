package Implement_thread;


public class Producer implements Runnable{
	StoreHouse q ;   			//�洢��Ķ���
	public Producer ( StoreHouse q ) {
		this.q = q ; 
	}
	@Override
	public void run() {
		 int i = 0 ;  			// �ж�����ż���ı���
		 while( true ) {
			 synchronized (q) {
				 if(q.flag) {		//�������ʱ
					 try{
						q.wait();  		//	���ڵȴ�״̬
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				 
				 if( i == 0 ) {  //���Ϊż��
					 q.name = "С��" ;
					 try {				//�߳�����һ��ʱ��
							 Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 q.sex = "��";
				 }
				 else			//Ϊ����
				 {
					q.name = "С��" ; 
					q.sex = "Ů" ;
				 }
				q.flag = true ; // ���ñ�Ǳ���flag
				q.notify();  //�����߳�
				i = (i + 1 ) % 2 ; 
			}
		 }
		 
	}


}

