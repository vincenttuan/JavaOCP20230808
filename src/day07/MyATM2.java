package day07;

import java.util.Scanner;

public class MyATM2 {
	// ATM 功能
	// 選擇操作: 1.查詢餘額 2.提款 3.存款 4.退出
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		Scanner sc = new Scanner(System.in);
		int sysPin = 1234;
		int sysBalance = 10000;
		
		// 1. 密碼判斷
		System.out.print("請輸入密碼:");
		int userPin = sc.nextInt();
		if(userPin != sysPin) {
			start(); // start() 再執行一次 (遞迴)
		}
		
		// 2. 主畫面選單
		loop: // 迴圈的名字
		while(true) {
			System.out.print("主選單操作:\n1.查詢餘額\n2.提款\n3.存款\n4.退出\n==> ");
			int itemId = sc.nextInt();
			switch (itemId) {
				case 1: // 查詢餘額
					System.out.printf("目前餘額 $%d\n", sysBalance);
					break;
				case 2: // 提款 (withdrawAmount)
					System.out.print("請輸入提款金額:");
					int withdrawAmount = sc.nextInt();
					if(withdrawAmount > sysBalance) {
						System.out.println("餘額不足");
						continue;
					}
					sysBalance -= withdrawAmount; // 變更帳戶餘額
					System.out.printf("已提款 $%d 成功, 帳戶餘額 $%d\n", withdrawAmount, sysBalance);
					break;	
				case 3: // 存款 (depositAmount)
					
					
					
					break;
				case 4: // 退出(退出迴圈)
					System.out.println("感謝使用, 再見");
					break loop; // 跳出指定迴圈
				default: // 輸入錯誤
					System.out.println("輸入錯誤請重新輸入(輸入的資料必須是1~4)");
					continue;
			}
		}
		
	}

}
