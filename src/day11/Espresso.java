package day11;

public class Espresso extends Coffee {

	public Espresso(String name, int price) {
		super(name, price);
	}

	@Override
	public void taste() {
		System.out.printf("%s 味道濃郁, 帶有深培的風味\n", getName());
	}
	
	
}
 
