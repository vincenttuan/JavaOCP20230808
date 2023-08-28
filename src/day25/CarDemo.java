package day25;

import java.util.concurrent.CyclicBarrier;

public class CarDemo {

	public static void main(String[] args) {
		int n = 4;
		Runnable barrierAction = () -> System.out.println("吃中飯");
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(n, barrierAction);
		
		new Car(cyclicBarrier).start();
		new Car(cyclicBarrier).start();
		new Car(cyclicBarrier).start();
		new Car(cyclicBarrier).start();

	}

}
