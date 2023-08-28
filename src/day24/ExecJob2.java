package day24;

public class ExecJob2 {
	public static void main(String[] args) {
		// 執行印出奇數與偶數的工作
		// Multithreading 多執行緒(分時多工)作業模式
		// 1.先建立 Runnable 工作物件
		Runnable odd = new Odd();
		Runnable even = new Even();
		
		// 2.建立執行緒物件並賦予工作
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		// 下達 start() 指令開始作業
		t1.start();
		t2.start();
		
	}
}
