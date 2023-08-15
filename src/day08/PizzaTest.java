package day08;

public class PizzaTest {

	public static void main(String[] args) {
		Pizza hawaiianPizza = new Pizza("夏威夷", "大", false);
		Pizza seafoodPizza = new Pizza("海鮮", "小", true);
		
		hawaiianPizza.display();
		seafoodPizza.display();

	}

}
