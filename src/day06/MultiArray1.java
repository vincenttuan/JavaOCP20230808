package day06;

import java.util.Arrays;

public class MultiArray1 {

	public static void main(String[] args) {
		int[][] investories = { // 原有庫存
				{1001, 25}, // 商品編號 1001, 庫存量 25
				{1002, 30}, // 商品編號 1002, 庫存量 30
				{1003, 15}  // 商品編號 1003, 庫存量 15
		};
		
		int[][] sales = { // 銷售狀況
				{1001, 10}, // 商品編號 1001, 銷售量 25 
				{1002, 5},  // 商品編號 1002, 銷售量 5 
				{1001, 8}   // 商品編號 1001, 銷售量 8
		};
		
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
