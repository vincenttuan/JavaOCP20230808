package day10;

public class IPhone extends Mobile {
	private boolean hasFaceId;
	private int iosVersion; // 10, 11
	
	public boolean isHasFaceId() {
		return hasFaceId;
	}
	public void setHasFaceId(boolean hasFaceId) {
		this.hasFaceId = hasFaceId;
	}
	public int getIosVersion() {
		return iosVersion;
	}
	public void setIosVersion(int iosVersion) {
		this.iosVersion = iosVersion;
	}
	
	
}
