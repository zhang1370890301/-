package ∂‡œﬂ≥Ã;

public class Zhuhanshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Thread a=new Xiancheng1();
		   Thread x2=new Xiancheng2();
		   
		   Runnable r=new Xiancheng3();
		   Thread t3=new Thread(r);
			
			a.start();
			x2.start();
			t3.start();
	}

}
