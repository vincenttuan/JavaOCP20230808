package day11;

public class CoffeePolyTest {

	public static void main(String[] args) {
		// Coffee 多型
		Coffee coffee1 = new Espresso("濃縮咖啡", 70);
		coffee1.taste();
		System.out.printf("%s $%d\n", coffee1.getName(), coffee1.getPrice());
		
	}

}
