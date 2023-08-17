package day11;

public class CoffeePolyTest {

	public static void main(String[] args) {
		// Coffee 多型
		Coffee coffee1 = new Espresso("濃縮咖啡", 70);
		Coffee coffee2 = new Latte("拿鐵", 60);
		
		coffee1.taste();
		System.out.printf("%s $%d\n", coffee1.getName(), coffee1.getPrice());
		
		coffee2.taste();
		System.out.printf("%s $%d\n", coffee2.getName(), coffee2.getPrice());
		
		Coffee[] coffees = {coffee1, coffee2};
		for(Coffee coffee : coffees) {
			coffee.taste();
		}
	}

}
