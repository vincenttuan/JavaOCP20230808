package day22;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
// 密碼:1234 (數字)
// 1. 輸入密碼 -> 成功(2) -> 失敗(1)
// 2. 輸入年齡 -> 得到幸運數字
public class ExceptionDemo4 {

	public static void main(String[] args) {
		login();
		System.out.println("Game Over");
	}
	
	// 登入
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入四位數密碼:");
		
		try {
			int userPwd = sc.nextInt();  // 可能會有 InputMismatchException
			if(userPwd == 1234) {
				System.out.println("登入成功");
				play();
			} else { // 密碼錯誤驗證失敗
				RuntimeException re = new RuntimeException("登入失敗, 請重新登入!");
				throw re;
			}
		} catch(InputMismatchException e1) {
			System.out.printf("錯誤訊息: 輸入格式不正確請重新輸入 %s\n", e1);
			login();
		} catch(RuntimeException e2) {
			System.out.printf("錯誤訊息: %s\n", e2.getMessage());
			login();
		}
	}
	
	// 遊戲開始
	public static void play() {
		Scanner sc = new Scanner(System.in);
		System.out.print("遊戲開始!\n請輸入年齡:");
		try {
			int age = sc.nextInt();
			int luckyNumber = new Random(age).nextInt(10); // 0~9
			System.out.printf("您的幸運數字: %d\n", luckyNumber);
		} catch(InputMismatchException e1) {
			System.out.printf("錯誤訊息: 輸入格式不正確請重新輸入 %s\n", e1);
			play();
		}
	}

}
