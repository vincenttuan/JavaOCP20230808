package day24;

// 印出奇數
public class Odd {
	
	public void job() {
		// 取得執行緒名稱
		String threadName = Thread.currentThread().getName();
		// 印出 1~1000 的奇數
		for(int i=1;i<1000;i+=2) {
			System.out.printf("%s i=%d\n", threadName, i);
		}
	}
	
}
