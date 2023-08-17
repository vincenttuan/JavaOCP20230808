package day13;

public abstract class FriedChicken implements Snack {
	private int price; // 價格
	
	public FriedChicken(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return price;
	}
	
}
