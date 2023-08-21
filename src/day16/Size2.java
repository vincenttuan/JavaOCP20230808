package day16;

public enum Size2 {
	大(10), 中(5), 小(0);
	
	private int value;
	
	private Size2(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
