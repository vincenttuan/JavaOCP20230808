package day11;

public class CoffeePolyTest {

	public static void main(String[] args) {
		// Coffee 多型
		Coffee coffee1 = new Espresso("濃縮咖啡", 70);
		Coffee coffee2 = new Latte("拿鐵", 60);
		Coffee coffee3 = new VanillaLatte("香草拿鐵", coffee2.getPrice() + 5);
		
		coffee1.taste();
		System.out.printf("%s $%d\n", coffee1.getName(), coffee1.getPrice());
		
		coffee2.taste();
		System.out.printf("%s $%d\n", coffee2.getName(), coffee2.getPrice());
		
		coffee3.taste();
		System.out.printf("%s $%d\n", coffee3.getName(), coffee3.getPrice());
		
		Coffee[] coffees = {coffee1, coffee2, coffee3};
		for(Coffee coffee : coffees) {
			coffee.taste();
		}
	}

}
