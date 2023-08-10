package day03;

public class DataType {

	public static void main(String[] args) {
		// 基本資料型別: 例如 char
		char c1 = 'A';
		char c2 = 'A';
		// 利用 == 可以比較 c1 與 c2 在記憶體 stack 的內容是否相等
		System.out.printf("c1 = %c\n", c1);
		System.out.printf("c2 = %c\n", c2);
		System.out.printf("c1 == c2 ? %b\n", (c1 == c2));
		
		// 參考資料型別: 例如 String
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.printf("s1 = %s\n", s1);
		System.out.printf("s2 = %s\n", s2);
		System.out.printf("s1 == s2 ? %b\n", (s1 == s2));
		System.out.printf("s1.equals(s2) ? %b\n", s1.equals(s2));
	}

}
