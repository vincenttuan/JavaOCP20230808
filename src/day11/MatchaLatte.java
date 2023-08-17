package day11;

public class MatchaLatte extends Latte {

	public MatchaLatte(String name, int price) {
		super(name, price);
	}

	@Override
	public void taste() {
		System.out.printf("%s 味道清新，帶有抹茶的獨特風味。\n", getName());
	}
	
}
 
