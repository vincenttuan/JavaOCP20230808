package day08;

// 蛋糕物件設計圖
public class Cake {
	private String name; // 名稱 (至少要2個字)
	private int price;   // 價格 (10 ~ 1000)
	private double sweetness; // 甜度 (0 ~ 100)
	
	Cake() {
		
	}
	
	// 設定名稱的方法
	void setName(String name) {
		if(name != null && name.length() >= 2) {
			this.name = name;
		}
	}
	
	// 設定價格的方法
	void setPrice(int price) {
		if(price >= 10 && price <= 1000) {
			this.price = price;
		}
	}
	
	// 設定甜度的方法
	void setSweetness(double sweetness) {
		if(sweetness >= 0 && sweetness <= 100) {
			this.sweetness = sweetness;
		}
	}
	
	void display() {
		System.out.printf("%s $%d %.1f%%\n", name, price, sweetness);
	}
}
