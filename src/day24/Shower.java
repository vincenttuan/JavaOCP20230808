package day24;

class Father extends Thread {
	@Override
	public void run() {
		System.out.println("爸爸下班回家, 準備洗熱水澡");
		System.out.println("爸爸發現沒瓦斯, 打電話請瓦斯工人送瓦斯");
		
		Thread worker = new Worker();
		worker.start();
		
		try {
			worker.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		System.out.println("爸爸開始洗澡, 洗澡結束");
	}
}

class Worker extends Thread {
	@Override
	public void run() {
		System.out.println("瓦斯工人準備送瓦斯");
		for(int i=1;i<=5;i++) { // 模擬送瓦斯的時間
			try {
				sleep(1000);
				System.out.print(i + "秒鐘 ");
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("\n瓦斯工人將瓦斯送到家");
	}
}


public class Shower {
	
	public static void main(String[] args) {
		new Father().start();
	}

}
