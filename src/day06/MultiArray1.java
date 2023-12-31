package day06;

import java.util.Arrays;

public class MultiArray1 {

	public static void main(String[] args) {
		int[][] investories = { // 原有庫存
				{1001, 25}, // 商品編號 1001, 庫存量 25
				{1002, 30}, // 商品編號 1002, 庫存量 30
				{1003, 15}  // 商品編號 1003, 庫存量 15
		};
		// 列印庫存
		printInvestory(investories);
		
		// 進行銷售 -----------------------------------------------------
		sales(investories, 1001, 10);
		sales(investories, 1002, 5);
		sales(investories, 1001, 2);
		sales(investories, 1003, 14);
		// ------------------------------------------------------------
		
		// 列印庫存
		printInvestory(investories);
	}
	
	// 銷售
	public static void sales(int[][] investories, int productNo, int qty) {
		System.out.printf("銷售 商品編號 %d 數量 %d 個\n", productNo, qty);
		int idx = 0;
		switch (productNo) {
			case 1001:
				idx = 0;
				break;
			case 1002:
				idx = 1;
				break;
			case 1003:
				idx = 2;
				break;
		}
		investories[idx][1] = investories[idx][1] - qty;
	}
	
	// 印出庫存資料
	public static void printInvestory(int[][] investories) {
		System.out.println("目前庫存資料:");
		for(int[] inv : investories) {
			System.out.println(Arrays.toString(inv));
		}
	}

}
