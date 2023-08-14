package day07;

import java.util.Scanner;

public class MyATM3 {
	public static Scanner sc = new Scanner(System.in);
	public static int sysPin = 1234;
	public static int sysBalance = 10000;
			
	public static void main(String[] args) {
		checkPin();
	}
	
	// 密碼驗證
	public static void checkPin() {
		System.out.print("請輸入密碼:");
		int userPin = sc.nextInt();
		if(userPin != sysPin) { // 密碼比對不正確
			System.out.println("密碼錯誤, 請重新輸入~");
			checkPin(); // 重複執行密碼驗證
		} else { // 密碼比對正確
			showMenu(); // 顯示主畫面選單
		}
	}
	
	// 顯示主畫面選單
	public static void showMenu() {
		while(true) {
			System.out.print("主選單操作:\n1.查詢餘額\n2.提款\n3.存款\n4.退出\n==> ");
			int itemId = sc.nextInt();
			switch (itemId) {
				case 1: // 查詢餘額
					checkBalance();
					break;
				case 2: // 提款 (withdrawAmount)
					withdraw();
					break;	
				case 3: // 存款 (depositAmount)
					deposit();
					break;
				case 4: // 退出(退出迴圈)
					quit();
					break;
				default: // 輸入錯誤
					System.out.println("輸入錯誤請重新輸入(輸入的資料必須是1~4)");
					continue;
			}
		}
	}
	
	// 餘額查詢
	public static void checkBalance() {
		System.out.printf("目前帳戶餘額 $%d\n", sysBalance);
	}
	
	// 提款
	public static void withdraw() {
		System.out.print("請輸入提款金額:");
		int withdrawAmount = sc.nextInt();
		if(withdrawAmount > sysBalance) {
			System.out.println("餘額不足");
			return; // 方法到此結束
		}
		sysBalance -= withdrawAmount; // 變更帳戶餘額
		System.out.printf("已提款 $%d 成功, 帳戶餘額 $%d\n", withdrawAmount, sysBalance);
	}
	
	// 存款
	public static void deposit() {
		
	}
	
	// 離開系統
	public static void quit() {
		
	}
	
}
