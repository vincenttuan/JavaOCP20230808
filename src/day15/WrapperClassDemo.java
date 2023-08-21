package day15;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// int -> Integer
		// 取得 int 的最大值
		int max = Integer.MAX_VALUE; // 2147483647
		System.out.printf("int 的最大值: %d\n", max);
		
		String chinese = "100";
		String english = "80";
		System.out.println(chinese + english);
		// 要將字串的100改變成數字的100後再進行運算
		System.out.println(Integer.parseInt(chinese) + Integer.parseInt(english));
		
		// 取得最大的數
		int a = 50;
		int b = 60;
		System.out.println(Integer.max(a, b));
		

	}

}
