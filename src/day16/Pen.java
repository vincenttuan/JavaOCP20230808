package day16;

public class Pen {
	private String color;
	private int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Pen)) {
			return false;
		}
		Pen p2 = (Pen)obj;
		if(color.equals(p2.color) && price == p2.price) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
	
}
