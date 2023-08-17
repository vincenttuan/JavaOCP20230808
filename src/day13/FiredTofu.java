package day13;

public class FiredTofu extends Tofu {
	
	public FiredTofu() {
		price += 10; // $ 預設價格 + 10
	}
	
	@Override
	public void flavor() {
		System.out.println("炸豆腐風味");
	}

}
