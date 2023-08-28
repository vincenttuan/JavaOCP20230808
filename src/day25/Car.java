package day25;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

// 循環屏障範例
public class Car extends Thread {
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s 出發了\n", threadName);
		
		try {
			Thread.sleep(new Random().nextInt(5000)); // 模擬做工的時間
			System.out.printf("%s 到苗栗了\n", threadName);
			cyclicBarrier.await(); // 等待其他人
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.printf("%s 結束工作\n", threadName);
	}
	
}
