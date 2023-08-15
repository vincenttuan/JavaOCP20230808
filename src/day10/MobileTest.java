package day10;

public class MobileTest {

	public static void main(String[] args) {
		Android android = new Android();
		android.setName("Pixel7");
		android.setStorage(64); // 64G
		android.setPrice(15000);
		android.setHasSD(false);
		android.setAndroidVersion(10.1);
		
		IPhone iphone = new IPhone();
		iphone.setName("iPhone15");
		iphone.setStorage(256);
		iphone.setPrice(22000);
		iphone.setHasFaceId(true);
		iphone.setIosVersion(15);
		
		System.out.printf("機型: %s ", android.getName());
		System.out.printf("容量: %d G ", android.getStorage());
		System.out.printf("價格: $%d ", android.getPrice());
		System.out.printf("SD: %b ", android.isHasSD());
		System.out.printf("版本: %.1f\n", android.getAndroidVersion());
		
		System.out.printf("機型: %s ", iphone.getName());
		System.out.printf("容量: %d G ", iphone.getStorage());
		System.out.printf("價格: $%d ", iphone.getPrice());
		System.out.printf("FaceId: %b ", iphone.isHasFaceId());
		System.out.printf("版本: %d\n", iphone.getIosVersion());
		

	}

}
