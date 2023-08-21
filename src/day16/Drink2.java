package day16;

// 飲料基本是 20 元
// 小杯+0元, 中杯+5元, 大杯+10元
public class Drink2 {
	private int price = 20;
	
	public Drink2(Size2 size2) {
		price += size2.getValue();
	}
	
	public int getPrice() {
		return price;
	}
}
