package day11;

public class VanillaLatte extends Latte {

	public VanillaLatte(String name, int price) {
		super(name, price);
	}

	@Override
	public void taste() {
		System.out.printf("%s 帶有香草的香甜, 味道更加豐富\n", getName());
	}
	
}
 
