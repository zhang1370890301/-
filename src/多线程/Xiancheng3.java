package ���߳�;

public class Xiancheng3  implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<20;i++) {
			try {
			//�����	sleep(1000);�����ˣ���Ϊsleep��Thread���еķ�����Ҫ����������ķ�������Ҫ�õ�������仰
			//��ȡ��ǰ�߳�
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("˵"+i);
		}
		
		
	}

	
}
