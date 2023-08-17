package day13;

public abstract class Tofu implements Snack {
	protected int price = 40;
	
	@Override
	public int getPrice() {
		return price;
	}

}
