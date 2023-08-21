package day15;

/*
 * EStore: 有多種家電商品(商品有品牌與型號)
 * 靜態內部類別: EStore一般資訊,營業時間或歷史
 * 一般內部類別: EStore某個特定商品
 * 方法內部類別: EStore針對需要臨時有促銷活動或折扣
 * */

public class EStore {
	private static final int year = 1990; // 起源: 商店成立的年份
	
	// 定義靜態內部類別: EStore一般資訊,營業時間或歷史
	public static class StoreInfo {
		// 營業時間
		static String workingHours = "9AM - 9PM";
		// 一般資訊
		static void displayInfo() {
			System.out.printf("本商店成立於: %d\n", year);
			System.out.printf("商店營業時間: %s\n", workingHours);
		}
	}
	
	// 一般內部類別: EStore某個特定商品-例如:電視機
	public class Television {
		private String brand; // 電視品牌
		private int price; // 電視價格
		
		public Television(String brand, int price) {
			this.brand = brand;
			this.price = price;
		}
		
		// 顯示電視機商品資料
		public void displayDetials() {
			System.out.printf("電視品牌: %s\n", brand);
			System.out.printf("電視價格: %d\n", price);
		}
	}
	
	// 定義一個周末促銷的方法
	// 裡面包含臨時的折扣(方法內部類別)
	public void weekendSale() {
		class Discount { // 折扣類
			double discountRate = 0.9; // 打九折
			// 計算並顯示打折後的價格
			void applyDiscount(int price) {
				int newPrice = (int)(price * discountRate);
				System.out.printf("折扣後的價格 $%d\n", newPrice);
			}
		}
		// 建立一個電視機商品
		Television tv = new Television("Apple", 2500);
		tv.displayDetials();
		
		// 應用打折
		Discount discount = new Discount();
		discount.applyDiscount(tv.price);
	}
	
}
