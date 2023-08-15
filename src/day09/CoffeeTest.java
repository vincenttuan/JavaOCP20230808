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
		
		
	}

}
