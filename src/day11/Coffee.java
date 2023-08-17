package day11;

public abstract class Coffee {
 
	private String name;
	 
	private int price;
	 
	public Coffee() {
	}
	 
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	 
	public abstract void taste(); // 抽象方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	 
}
 
