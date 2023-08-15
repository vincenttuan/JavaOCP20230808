package day10;

public class Android extends Mobile {
	private boolean hasSD; // 是否有 SD 卡
	private double androidVersion; // 8.1, 8.2
	
	public Android() {
		
	}
	
	public Android(String name, int storage, int price, boolean hasSD, double androidVersion) {
		setName(name);
		setStorage(storage);
		setPrice(price);
		setHasSD(hasSD);
		setAndroidVersion(androidVersion);
	}
	
	public void display() {
		System.out.printf("機型: %s ", getName());
		System.out.printf("容量: %d G ", getStorage());
		System.out.printf("價格: $%d ", getPrice());
		System.out.printf("SD: %b ", isHasSD());
		System.out.printf("版本: %.1f\n", getAndroidVersion());
	}
	
	public boolean isHasSD() {
		return hasSD;
	}
	public void setHasSD(boolean hasSD) {
		this.hasSD = hasSD;
	}
	public double getAndroidVersion() {
		return androidVersion;
	}
	public void setAndroidVersion(double androidVersion) {
		this.androidVersion = androidVersion;
	}
	
}
