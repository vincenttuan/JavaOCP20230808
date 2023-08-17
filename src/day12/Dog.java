package day12;

public class Dog implements Pet {

	@Override
	public void eat() {
		System.out.println("吃飼料");
	}

	@Override
	public void skill() {
		System.out.println("玩飛盤");
	}
	
}
