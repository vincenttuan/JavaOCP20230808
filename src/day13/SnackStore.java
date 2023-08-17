package day13;

public class SnackStore {

	public static void main(String[] args) {
		FriedChicken original = new OriginalChicken(50);
		original.flavor();
		System.out.printf("$%d\n", original.getPrice());
		
		Tofu pageTofu = new PageTofu();
		pageTofu.flavor();
		System.out.printf("$%d\n", pageTofu.getPrice());
		
		Snack[] snacks = {original, pageTofu};
		for(Snack snack : snacks) {
			snack.flavor();
			System.out.printf("$%d\n", snack.getPrice());
		}
	}

}
