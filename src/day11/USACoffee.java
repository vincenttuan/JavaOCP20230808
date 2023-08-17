package day11;

public class USACoffee extends Coffee {

	public USACoffee(String name, int price) {
		super(name, price);
	}

	@Override
	public void taste() {
		System.out.printf("%s 喝起來就像喝咖啡一樣\n", getName());
		
	}	
	
}
