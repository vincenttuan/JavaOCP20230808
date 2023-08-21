package day15;

public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		Pet pet = new Pet() {
			
			public void skill() {
				System.out.println("玩飛盤");
			}
			
			public void eat() {
				System.out.println("吃飼料");
			}
			
		} ;
		
		pet.skill();
		pet.eat();

	}

}
