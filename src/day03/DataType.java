package day03;

public class DataType {

	public static void main(String[] args) {
		// 基本資料型別
		char c1 = 'A';
		char c2 = 'A';
		// 利用 == 可以比較 c1 與 c2 在記憶體 stack 的內容是否相等
		System.out.printf("c1 = %c\n", c1);
		System.out.printf("c2 = %c\n", c2);
		System.out.printf("c1 == c2 ? %b\n", (c1 == c2));

	}

}
