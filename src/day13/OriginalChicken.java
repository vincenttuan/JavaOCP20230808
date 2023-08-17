package day13;

public class OriginalChicken extends FriedChicken {

	public OriginalChicken(int price) {
		super(price);
	}

	@Override
	public void flavor() {
		System.out.println("原味鹽酥雞");
	}
	
}
