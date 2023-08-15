package day09;

// 設計一個 Coffee 物件
public class Coffee {
	
	private String name; // Latte, Espresso, Cappuccino etc...
	private int price; // 價格會根據品名, 大中小, 冷熱 來決定
	private String size; // SMALL, MEDIUM, LARGE
	private String temperature; // HOT, COLD
	
	public Coffee(String name, String size, String temperature) {
		
	}
	
	// 品名, 大中小, 冷熱 來決定
	private void setPrice() {
		
	}
	
	public void display() {
		System.out.printf("%s %s %s $%d\n", size, temperature, name, price);
	}
	
}
