package day13;

public class SnackStore {

	public static void main(String[] args) {
		FriedChicken original = new OriginalChicken(50);
		original.flavor();
		System.out.printf("$%d\n", original.getPrice());

	}

}
