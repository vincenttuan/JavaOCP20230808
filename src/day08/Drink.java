package day08;

// 飲料物件設計圖
public class Drink { 
	String name; // 飲料名稱 (物件變數)
	int price;   // 飲料價格 (物件變數)
	
	// 建構子
	Drink() {
		
	}
	
	Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void display() { // 顯示飲料名稱與價格的方法 (物件方法)
		System.out.printf("名稱: %s 價格 $%d\n", name, price);
	}
	
	void drink() { // 喝飲料的方法 (物件方法)
		if(price >= 20) {
			System.out.printf("喝 %s 的方法是打開蓋子就喝\n", name);
		} else {
			System.out.printf("喝 %s 的方法是插上吸管才喝\n", name);
		}
	}
}
