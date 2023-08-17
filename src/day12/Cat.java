package day12;

public class Cat implements Pet {

	@Override
	public void eat() {
		System.out.println("吃飼料");
	}

	@Override
	public void skill() {
		System.out.println("玩毛線");
	}

}
