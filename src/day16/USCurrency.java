package day16;

public enum USCurrency {
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	
	private USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
