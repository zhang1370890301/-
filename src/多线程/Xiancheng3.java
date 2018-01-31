package 多线程;

public class Xiancheng3  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++) {
			try {
			//这里的	sleep(1000);报错了，因为sleep是Thread类中的方法，要调用他里面的方法，就要用到下面这句话
			//获取当前线程
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("说"+i);
		}
		
		
	}

	
}
