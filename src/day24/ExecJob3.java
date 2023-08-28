package day24;

public class ExecJob3 {
	public static void main(String[] args) {
		// 執行印出奇數與偶數的工作
		// Multithreading 多執行緒(分時多工)作業模式
		// 1.先建立 Runnable 工作物件
		Runnable odd = new Odd();
		
		// 2.建立執行緒物件並賦予工作
		// 預設的執行緒是 UserThread
		// UserThread 的特點就是 主執行緒 main 會等待 UserThread 完成任務之後才會結束
		Thread t1 = new Thread(odd); // 建立一個空的執行緒並賦予 odd 工作
		
		// 將 t1 由預設的 UserThread 改變成背景執行緒
		// 背景執行緒的特點就是 主執行緒 main 會不會等待 背景執行緒 完成任務
		t1.setDaemon(true);
		
		// 下達 start() 指令開始作業
		t1.start();
		
		// 計算總共有幾條活著的執行緒
		System.out.printf("Active 執行緒數量: %d\n", Thread.activeCount());
	}
}
