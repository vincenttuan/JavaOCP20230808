package day24;

public class SleepThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			// 每隔一秒印一次
			try {
				Thread.sleep(1000); // 1000ms = 1s
				System.out.println(i);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}
