package day16;

public class DrinkTest {

	public static void main(String[] args) {
		Drink d1 = new Drink(Size.大);
		System.out.println(d1.getPrice());
		
		Drink2 d2 = new Drink2(Size2.大);
		System.out.println(d2.getPrice());
	}

}
