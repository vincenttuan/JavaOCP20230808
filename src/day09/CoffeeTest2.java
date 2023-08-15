package day09;

public class CoffeeTest2 {

	public static void main(String[] args) {
		Coffee latte      = new Coffee("Latte", "LARGE", "COLD"); // 拿鐵
		Coffee espresso   = new Coffee("Espresso", "MEDIUM", "HOT"); // 濃縮
		Coffee mocha      = new Coffee("Mocha", "SMALL", "COLD"); // 摩卡
		Coffee cappuccino = new Coffee("Cappuccino", "LARGE", "HOT"); // 卡布奇諾
		Coffee americano  = new Coffee("American", "LARGE", "COLD"); // 美式
		Coffee macchiate  = new Coffee("Macchiate", "MEDIUM", "HOT"); // 瑪奇朵
		Coffee flatWhite  = new Coffee("FlatWhite", "SMALL", "HOT"); // 白咖啡
		
		Coffee[] coffees = {latte, espresso, mocha, cappuccino, americano, macchiate, flatWhite};
		int cups = coffees.length;
		System.out.printf("總共有 %d 杯\n", cups);
		
		// 分析
		// 1. 總銷售額
		// 2. 平均價
		// 3. 大中小杯的數量
		int totalSales = 0;
		int smallCount = 0, mediumCount = 0, largeCount = 0;
		for(Coffee coffee : coffees) {
			// 印出每一杯咖啡的價格
			System.out.printf("%-12s $%3d\n", coffee.getName(), coffee.getPrice());
			// 累計計算銷售總額
			totalSales += coffee.getPrice();
			// 累計大中小杯的數量
			switch (coffee.getSize()) {
				case "LARGE":
					largeCount++;
					break;
				case "MEDIUM":
					mediumCount++;
					break;	
				case "SMALL":
					smallCount++;
					break;	
			}
		}
		System.out.println("-----------------");
		System.out.printf("%-12s $%3d\n", "Total sales", totalSales);
		System.out.printf("%-12s $%3d\n", "Average", totalSales/cups);
		System.out.printf("L:%-2d M:%-2d S:%-2d\n", largeCount, mediumCount, smallCount);
		
	}

}
