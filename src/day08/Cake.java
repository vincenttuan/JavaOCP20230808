package day08;

// 蛋糕物件設計圖
public class Cake {
	String name; // 名稱 (至少要2個字)
	int price;   // 價格 (10 ~ 1000)
	double sweetness; // 甜度 (0 ~ 100)
	
	Cake() {
		
	}
	
	void display() {
		System.out.printf("%s $%d %.1f%%\n", name, price, sweetness);
	}
}
