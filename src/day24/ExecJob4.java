package day24;

public class ExecJob4 {
	public static void main(String[] args) {
		// 執行印出奇數與偶數的工作
		// Multithreading 多執行緒(分時多工)作業模式
		// 1.先建立 Runnable 工作物件
		Runnable odd = new Odd();
		Runnable even = new Even();
		
		// 2.建立執行緒物件並賦予工作
		// 預設的執行緒是 UserThread
		Thread t1 = new Thread(odd); // 建立一個空的執行緒並賦予 odd 工作
		t1.setName("烏龜"); // 設定執行緒名稱
		Thread t2 = new Thread(even, "兔子"); // 第二個參數可設定執行緒名稱
		
		// 3. 調整權限 (1~10, 預設是 5)
		t1.setPriority(10); // Thread.MAX_PRIORITY
		t2.setPriority(Thread.MIN_PRIORITY); // 1
		System.out.printf("%s 的執行緒權限: %d\n", t1.getName(), t1.getPriority());
		System.out.printf("%s 的執行緒權限: %d\n", t2.getName(), t2.getPriority());
		
		// 下達 start() 指令開始作業
		t1.start();
		t2.start();
		
		// 計算總共有幾條活著的執行緒
		System.out.printf("Active 執行緒數量: %d\n", Thread.activeCount());
		
	}
}
