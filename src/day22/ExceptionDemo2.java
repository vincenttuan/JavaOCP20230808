package day22;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
// 密碼:1234 (數字)
// 1. 輸入密碼 -> 成功(2) -> 失敗(1)
// 2. 輸入年齡 -> 得到幸運數字
public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			login();
			System.out.println("Game Over");
		} catch (InputMismatchException e) {
			System.out.printf("登入錯誤: %s 請重新登入!\n", e.toString());
			System.out.printf("錯誤原因: %s\n", e.getMessage());
			System.out.printf("自訂原因: %s\n", "密碼必須是數字");
			main(args); // 重新呼叫 main()
		}
	}
	
	// 登入
	public static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入四位數密碼:");
		
		int userPwd = sc.nextInt();
		if(userPwd == 1234) {
			System.out.println("登入成功");
			play();
		} else { // 密碼錯誤得失敗
			System.out.println("登入失敗, 請重新登入!");
			login(); // 重新呼叫 login()
		}
		
	}
	
	// 遊戲開始
	public static void play() {
		Scanner sc = new Scanner(System.in);
		System.out.print("遊戲開始!\n請輸入年齡:");
		int age = sc.nextInt();
		int luckyNumber = new Random(age).nextInt(10); // 0~9
		System.out.printf("您的幸運數字: %d\n", luckyNumber);
	}

}
