package day16;

public enum USCurrency {
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	
	// 在 enum 類中預設的建構子權限只能是 private
	// 不寫就是 private
	USCurrency(int value) { 
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
