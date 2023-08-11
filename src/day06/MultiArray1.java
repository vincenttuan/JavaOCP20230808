package day06;

import java.util.Arrays;

public class MultiArray1 {

	public static void main(String[] args) {
		int[][] investories = { // 原有庫存
				{1001, 25}, // 商品編號 1001, 庫存量 25
				{1002, 30}, // 商品編號 1002, 庫存量 30
				{1003, 15}  // 商品編號 1003, 庫存量 15
		};
		printInvestory(investories);
		
		
		int productNo = 1001;
		int qty = 10;
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
		printInvestory(investories);
	}
	
	// 印出庫存資料
	public static void printInvestory(int[][] investories) {
		System.out.println("目前庫存資料:");
		for(int[] inv : investories) {
			System.out.println(Arrays.toString(inv));
		}
	}

}
