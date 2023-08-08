package day01;

public class Hello4 {

	public static void main(String[] args) {
		addAndPrint(10, 20);
		
		int x = 30, y = 40;
		addAndPrint(x, y);
	}
	
	// 將資料相加並印出的方法
	public static void addAndPrint(int x, int y) {
		int sum = x + y;
		System.out.printf("%d + %d = %d\n", x, y, sum);
	}

}
