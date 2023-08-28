package day25;

public class CookieDemo {

	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		
		// 主人執行緒
		Thread masterThread = new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					try {
						cookie.put(i);
						Thread.sleep(100); // 模擬主人放餅乾的時間
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		// 小狗執行緒
		Thread dogThread = new Thread() {
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					try {
						cookie.eat(i);
						Thread.sleep(150); // 模擬小狗吃餅乾的時間
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		masterThread.start();
		dogThread.start();

	}

}
