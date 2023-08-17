package day11;

public class Latte extends Coffee {

	public Latte(String name, int price) {
		super(name, price);
	}

	@Override
	public void taste() {
		System.out.printf("%s 味道柔和, 帶有濃厚的奶香\n", getName());
	}
	
	
}
 
