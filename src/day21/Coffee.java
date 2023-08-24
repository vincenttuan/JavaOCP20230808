package day21;

enum CoffeeName {
	拿鐵, 摩卡, 美式 
}

enum CoffeeSize {
	大杯, 中杯, 小杯 
}


public class Coffee {
	private CoffeeName name;
	private CoffeeSize size;
	private Integer price;
	
	public Coffee(CoffeeName name, CoffeeSize size, Integer price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public CoffeeName getName() {
		return name;
	}

	public void setName(CoffeeName name) {
		this.name = name;
	}

	public CoffeeSize getSize() {
		return size;
	}

	public void setSize(CoffeeSize size) {
		this.size = size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", size=" + size + ", price=" + price + "]";
	}
	
	
	
}
