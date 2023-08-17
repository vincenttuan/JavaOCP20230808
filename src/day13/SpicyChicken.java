package day13;

public class SpicyChicken extends FriedChicken {

	public SpicyChicken(int price) {
		super(price);
	}

	@Override
	public void flavor() {
		System.out.println("辣味鹽酥雞");
	}

}
