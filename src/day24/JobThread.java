package day24;

public class JobThread extends Thread {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		// 印出 1~1000
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s i=%d\n", threadName, i);
		}
	}
	
}
