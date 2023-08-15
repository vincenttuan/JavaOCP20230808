package day09;

public class CoffeeTest2 {

	public static void main(String[] args) {
		Coffee latte      = new Coffee("Latte", "LARGE", "COLD"); // 拿鐵
		Coffee espresso   = new Coffee("Espresso", "MEDIUM", "HOT"); // 濃縮
		Coffee mocha      = new Coffee("Mocha", "SMALL", "COLD"); // 摩卡
		Coffee cappuccino = new Coffee("Cappuccino", "LARGE", "HOT"); // 卡布奇諾
		Coffee americano  = new Coffee("AmericanCoffee", "LARGE", "COLD"); // 美式
		Coffee macchiate  = new Coffee("Macchiate", "MEDIUM", "HOT"); // 瑪奇朵
		Coffee flatWhite  = new Coffee("FlatWhite", "SMALL", "HOT"); // 白咖啡
		
		Coffee[] coffees = {latte, espresso, mocha, cappuccino, americano, macchiate, flatWhite};
		int cups = coffees.length;
		System.out.printf("總共有 %d 杯\n", cups);
	}

}
