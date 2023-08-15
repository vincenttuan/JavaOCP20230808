package day08;

// Pizza 物件設計圖
// -----------------------------------------
// 口味(flavor): 夏威夷, 海鮮
// 大小(size): 大, 小
// 配料數量(toppingsCount): 大的有10個, 小的有 5 個
// 加辣(spicy): 有辣, 無辣
// -----------------------------------------
// display()方法可以顯示 Pizza 相關資訊
public class Pizza {
	// 物件變數/屬性
	private String flavor; // 夏威夷, 海鮮
	private String size; // 大, 小
	private int toppingsCount; // 大的有10個, 小的有 5 個
	private boolean spicy; // true:有辣, false:無辣
	
	// 建構子
	public Pizza(String flavor, String size, boolean spicy) {
		this.flavor = flavor;
		this.size = size;
		this.spicy = spicy;
		switch (size) {
			case "大":
				this.toppingsCount = 10;
				break;
			case "小":
				this.toppingsCount = 5;
				break;
		}
	}
	
	// 物件方法
	public void display() {
		System.out.printf("%s 尺寸 %s 配料數量 %d 有否加辣 %b\n", flavor, size, toppingsCount, spicy);
	}
}
