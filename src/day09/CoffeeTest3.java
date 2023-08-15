package day09;

public class CoffeeTest3 {

	public static void main(String[] args) {
		Coffee coffee = new Coffee("Latte", "LARGE", "COLD");
		coffee.display();
		coffee.setAmount(2); // 改 2 杯
		coffee.display();
		coffee.setSize("SMALL"); // 改小杯
		coffee.display();
		coffee.setTemperature("HOT"); // 改熱的
		coffee.display();
		coffee.setAmount(4); // 改小杯
		coffee.display();
		coffee.setName("Espresso"); // 換咖啡 Espresso
		coffee.display();
		
	}

}
