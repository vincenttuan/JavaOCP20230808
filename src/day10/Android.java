package day10;

public class Android extends Mobile {
	private boolean hasSD; // 是否有 SD 卡
	private double androidVersion; // 8.1, 8.2
	
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
