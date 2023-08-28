package day25;

public class CookieDemo {

	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		
		// 主人執行緒
		Thread masterThread = new Thread() {
			@Override
			public void run() {
				
			}
		};
		
		// 小狗執行緒
		Thread dogThread = new Thread() {
			@Override
			public void run() {
				
			}
		};
		
		masterThread.start();
		dogThread.start();

	}

}
