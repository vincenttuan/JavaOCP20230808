package day07;

import java.util.Scanner;

public class MyATM {
	// 請寫一個提款的 ATM
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 可以得到使用者在鍵盤上所輸入的資料
		int sysPin = 1234; // 系統密碼
		int sysBalance = 10000; // 系統帳戶餘額
		
		while (true) {
			// 1.輸入密碼
			System.out.print("請輸入密碼:");
			int userPin = sc.nextInt(); // 得到使用者所輸入的密碼
			// 2.進行密碼比對
			if(userPin != sysPin) {
				System.out.println("密碼錯誤, 請重新輸入");
				continue;
			}
			// 3.輸入提款金額
			System.out.print("請輸入提款金額:");
			int userAmount = sc.nextInt(); // 得到使用者所輸入的提款金額
			// 4.檢查帳戶餘額
			if(userAmount > sysBalance) {
				System.out.println("帳戶餘額不足");
				// 4.1 是否要繼續提款
				System.out.print("是否要繼續提款(1:繼續 0:離開)?");
				int check = sc.nextInt(); // 得到使用者所輸入的是 1 或是 0
				if(check == 1) {
					continue; 
				} else {
					break; // 離開迴圈
				}
			}
			// 5.完成並扣款
			sysBalance = sysBalance - userAmount;
			System.out.printf("提款 $%d 成功, 帳戶餘額 $%d\n", userAmount, sysBalance);
			// 6. 是否繼續提款
			System.out.print("是否要繼續提款(1:繼續 0:離開)?");
			int check = sc.nextInt(); // 得到使用者所輸入的是 1 或是 0
			if(check == 1) {
				continue; 
			} else {
				break; // 離開迴圈
			}
		}
		
		System.out.println("程式結束 !");
	}

}
