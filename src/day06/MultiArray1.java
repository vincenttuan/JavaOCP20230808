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
		// 銷售 商品編號 1001 數量 10 個
		System.out.println("銷售 商品編號 1001 數量 10 個");
		investories[0][1] = investories[0][1] - 10;
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
