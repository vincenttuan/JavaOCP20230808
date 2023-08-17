package day13;

public class SnackStore {

	public static void main(String[] args) {
		FriedChicken original = new OriginalChicken(50);
		original.flavor();
		System.out.printf("$%d\n", original.getPrice());
		
		FriedChicken cheese = new CheeseChicken(60);
		cheese.flavor();
		System.out.printf("$%d\n", cheese.getPrice());
		
		Tofu pageTofu = new PageTofu();
		pageTofu.flavor();
		System.out.printf("$%d\n", pageTofu.getPrice());
		
		Snack[] snacks = {original, cheese, pageTofu}; // 所有小吃
		for(Snack snack : snacks) {
			snack.flavor();
			System.out.printf("$%d\n", snack.getPrice());
		}
		
		FriedChicken[] friedChickens = {original, cheese}; // 限定是鹽酥雞的小吃
		for(FriedChicken friedChicken : friedChickens) {
			friedChicken.flavor();
			System.out.printf("$%d\n", friedChicken.getPrice());
		}
 		
		
	}

}
