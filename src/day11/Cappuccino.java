package day11;

public class Cappuccino extends Coffee {

	public Cappuccino(String name, int price) {
		super(name, price);
	}

	@Override
	public void taste() {
		System.out.printf("%s 味道平衡，上面撒有可可粉，帶有奶泡。\n", getName());
	}
	
}
 
