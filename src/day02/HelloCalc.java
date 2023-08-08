package day02;

public class HelloCalc {

	public static void main(String[] args) {
		
		int result = add(10, 20);
		System.out.println(result);
	}
	
	// 建立一個 add() 加法的方法
	public static int add(int x, int y) {
		int result = x + y;
		return result;
	}

}
