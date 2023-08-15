package day09;

// 設計一個 Coffee 物件
public class Coffee {
	
	private String name; // Latte, Espresso, Cappuccino etc...
	private int price; // 價格會根據品名, 大中小, 冷熱 來決定
	private String size; // SMALL, MEDIUM, LARGE
	private String temperature; // HOT, COLD
	private int amount = 1; // 預設 = 1
	// 建構子封裝
	public Coffee(String name, String size, String temperature) {
		this.name = name;
		this.size = size;
		this.temperature = temperature;
		setPrice(); // 根據上述的物件屬性來設定價格
	}
	
	// 方法封裝 getters
	public int getAmount() {
		return amount;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getSize() {
		return size;
	}

	public String getTemperature() {
		return temperature;
	}
	
	// 方法封裝 setters
	public void setName(String name) {
		this.name = name;
		setPrice(); // 重新設定價格
	}
	
	public void setAmount(int amount) {
		if(amount > 0) {
			this.amount = amount;
		}
	}
	
	public void setSize(String size) {
		this.size = size;
		setPrice(); // 重新設定價格
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
		setPrice(); // 重新設定價格
	}

	// 品名, 大中小, 冷熱 來決定
	private void setPrice() {
		// 建立咖啡基礎(小杯)價格
		switch (name) {
			case "拿鐵":
			case "Latte": // 拿鐵
				price = 50;
				break;
			case "濃縮":
			case "Espresso": // 濃縮
				price = 30;
				break;
			case "卡布奇諾":
			case "Cappuccino": // 卡布奇諾
				price = 45;
				break;
			default: // 其他
				price = 40;
				break;
		}
		
		// 根據大中杯調整價格
		switch (size) {
			case "大": 
			case "LARGE":
				price += 25; // 大杯加價 +25
				break;
			case "中": 
			case "MEDIUM":
				price += 10; // 中杯加價 +10
				break;
		}
		
		// 冰+5元
		switch (temperature) {
			case "冰":
			case "COLD":
				price += 5; // 冰加價 +5
				break;
		}
		
	}
	
	public void display() {
		System.out.printf("%s %s %s 單價:$%d 數量:%d 小計:%d\n", size, temperature, name, price, amount, (price*amount));
	}
	
}
