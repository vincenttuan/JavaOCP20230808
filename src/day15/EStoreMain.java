package day15;

public class EStoreMain {

	public static void main(String[] args) {
		EStore eStore = new EStore();
		// 顯示商店基本資訊 I
		EStore.StoreInfo.displayInfo();
		// 顯示商店基本資訊 II
		EStore.StoreInfo storeInfo = new EStore.StoreInfo();
		storeInfo.displayInfo();
		System.out.println("----------------------------");
		// 電視商品資訊
		EStore.Television tv = eStore.new Television("大同", 1500);
		tv.displayDetials();
		System.out.println("----------------------------");
		// 周末特價電視商品
		eStore.weekendSale();
	}

}
