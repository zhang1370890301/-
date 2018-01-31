package Ïß³Ì¼ÓËø;

public class Jiasuo1 implements Runnable {
       int i=20;
	Object lock = new Object();  
	@Override
	public void run() {

		// TODO Auto-generated method stub
      
		while(i>0) {
			synchronized (lock) {
				if(i>0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				try {
					Thread.currentThread().sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				i--;
			}
		}
       }
	

}
