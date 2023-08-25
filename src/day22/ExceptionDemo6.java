package day22;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// 優化後的結果
public class ExceptionDemo6 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			try {
				login();
				System.out.println("Game Over!");
				break;
			} catch (LoginException e) {
				//System.out.printf("錯誤訊息: %s\n", e.getMessage());
				e.printErrorMessage(); // 使用 LoginException 的自訂方法
				continue;
			}
		}
		sc.close();
	}
	
	// 讀取整數並處理異常
	public static int readInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			try {
				return sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next(); // 清空錯誤的輸入
				System.out.printf("錯誤訊息: 輸入格式不正確請重新輸入 %s\n", e);
			}
		}
	}
	
	// 登入
	public static void login() throws LoginException {
		int userPwd = readInt("請輸入四位數密碼:");
		if(userPwd == 1234) {
			System.out.println("登入成功");
			play();
		} else {
			// 建立一個自定受檢例外 LoginException
			throw new LoginException("登入失敗請重新登入");
		}
	}
	
	// 遊戲開始
	public static void play() {
		int age = readInt("遊戲開始\n請輸入年齡:");
		int luckyNumber = new Random(age).nextInt(10); // 0~9
		System.out.printf("您的幸運數字: %s\n", luckyNumber);
	}

}
