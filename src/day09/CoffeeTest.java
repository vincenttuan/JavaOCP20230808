package day09;

public class CoffeeTest {
	// Latte, Espresso, Cappuccino
	// SMALL, MEDIUM, LARGE
	// HOT, COLD
	public static void main(String[] args) {
		Coffee latte = new Coffee("Latte", "LARGE", "COLD");
		latte.display();
		
		Coffee espresso = new Coffee("Espresso", "MEDIUM", "HOT");
		espresso.display();
		
		Coffee mocha = new Coffee("Mocha", "SMALL", "COLD");
		mocha.display();
		
		// --------------------------------------------------------
		// 將 latte 改成 MEDIUM 也要改 HOT
		latte.setSize("MEDIUM");
		latte.setTemperature("HOT");
		latte.display();
		
		// 能夠單獨取出 name, price, size, temperature 的資料
		// 可以透過 getter 來取得
		System.out.println(latte.getName());
		System.out.println(latte.getPrice());
		System.out.println(latte.getSize());
		System.out.println(latte.getTemperature());
	}

}
