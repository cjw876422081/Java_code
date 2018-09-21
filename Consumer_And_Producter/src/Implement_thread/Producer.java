package Implement_thread;


public class Producer implements Runnable{
	StoreHouse q ;   			//存储库的对象
	public Producer ( StoreHouse q ) {
		this.q = q ; 
	}
	@Override
	public void run() {
		 int i = 0 ;  			// 判断奇数偶数的变量
		 while( true ) {
			 synchronized (q) {
				 if(q.flag) {		//储存库满时
					 try{
						q.wait();  		//	处于等待状态
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
				 
				 if( i == 0 ) {  //如果为偶数
					 q.name = "小明" ;
					 try {				//线程阻塞一段时间
							 Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 q.sex = "男";
				 }
				 else			//为奇数
				 {
					q.name = "小红" ; 
					q.sex = "女" ;
				 }
				q.flag = true ; // 设置标记变量flag
				q.notify();  //唤醒线程
				i = (i + 1 ) % 2 ; 
			}
		 }
		 
	}


}

