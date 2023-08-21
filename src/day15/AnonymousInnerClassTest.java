package day15;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		Pet pet = new Pet() {
			{
				System.out.println("Pet");
			}
			public void skill() {
				System.out.println("玩飛盤");
			}
			public void eat() {
				System.out.println("吃飼料");
			}
		} ;
		
		Pet pet2 = new Pet() {
			{
				System.out.println("Pet2");
			}
			public void skill() {
				System.out.println("玩毛線");
			}
			public void eat() {
				System.out.println("吃魚");
			}
		} ;
		
		pet.skill();
		pet.eat();
		pet2.skill();
		pet2.eat();

	}

}
