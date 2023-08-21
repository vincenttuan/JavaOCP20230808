package day16;

// 飲料基本是 20 元
// 小杯+0元, 中杯+5元, 大杯+10元
public class Drink {
	private int price = 20;
	
	public Drink(Size size) {
		switch (size) {
			case 小:
				price += 0;
				break;
			case 中:
				price += 5;
				break;
			case 大:
				price += 10;
				break;	
		}
	}
	
	public int getPrice() {
		return price;
	}
}
