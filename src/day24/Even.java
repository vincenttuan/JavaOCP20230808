package day24;

// 印出偶數
public class Even {
	
	public void job() {
		// 取得執行緒名稱
		String threadName = Thread.currentThread().getName();
		// 印出 2~1000 的偶數
		for(int i=2;i<=1000;i+=2) {
			System.out.printf("%s i=%d\n", threadName, i);
		}
	}
	
}
