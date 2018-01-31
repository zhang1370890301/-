package 线程加锁;

import 多线程.Xiancheng3;

public class Zhuhanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1=new Jiasuo1();
		Thread t2=new Thread(t1);
		Thread t3=new Thread(t1); 
		t2.start();
		t3.start();
		
		
		
	}

}
