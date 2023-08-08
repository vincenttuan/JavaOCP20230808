package day01;

public class Hello5 {

	public static void main(String[] args) {
		calcAndPrint(10, 20, '+');
		calcAndPrint(-10, 50, '*');
		calcAndPrint(3, 9, '%');
	}
	
	// 設計一個可以支援 + - * / 的方法
	// x, y 呼叫端傳入的數值(int)
	// operate 呼叫端傳入的字元(char), 該 operate 必須是 '+', '-', '*', '/'
	public static void calcAndPrint(int x, int y, char operate) {
		int result = 0; // 建立一個區域變數(預設=0)
		switch (operate) {
			case '+':
				result = x + y;
				break;
			case '-':
				result = x - y;
				break;
			case '*':
				result = x * y;
				break;
			case '/':
				result = x / y;
				break;
			default:
				System.out.printf("operate %c 不支援\n", operate);
				return; // 該方法到此結束(停止方法)
		}
		System.out.printf("result = %d\n", result);
	}

}
