package day11;

public class CoffeePolyTest2 {

	public static void main(String[] args) {
		// 因為 Coffee 是抽象類所以不可以直接 new
		//Coffee coffee = new Coffee();
		Coffee usaCoffee = new USACoffee("美式咖啡", 40);
		usaCoffee.taste();
		
	}

}
