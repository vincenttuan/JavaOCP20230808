package day13;

public class PageTofu extends Tofu {
	
	public PageTofu() {
		price += 15; // $ 預設價格 + 15
	}
	
	//@Override
	public void flavor() {
		System.out.println("百頁豆腐風味");
	}

}
