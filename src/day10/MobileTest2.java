package day10;

public class MobileTest2 {

	public static void main(String[] args) {
		// 透過建構子來設定物件屬性資料 (建構子封裝)
		Android android = new Android("Pixel7", 64, 15000, false, 10.1);
		// 透過呼叫 dispaly() 來印出所有相關物件屬性資料
		android.display();

	}

}
