package day15;

import java.util.Arrays;
import java.util.Comparator;

// 自動裝箱(auto-boxed)與自動拆箱(auto-unboxed)
// Java 5.0(含)版之後提供
public class AutoBoxedAndAutoUnBoxed {

	public static void main(String[] args) {
		// Java 5.0 之前
		int a = 100;
		Integer b = Integer.valueOf(200); // new Integer(200);
		int sum = a + b.intValue(); // 取得 Integer 物件的 int 內容
		System.out.printf("a=%d, b=%d, sum=%d\n", a, b.intValue(), sum);
		
		// Java 5.0(含) 之後
		int x = 100;
		Integer y = 200; // 編譯器會自動轉成 Integer.valueOf(200), 這個過程叫做:自動裝箱(auto-boxed)
		int total = x + y; // 編譯器針對 y 會自動轉成 y.intValue(), 這個過程叫做:自動拆箱(auto-unboxed)
		System.out.printf("x=%d, y=%d, total=%d\n", x, y, total);
		
		// boxed() 使用範例
		int[] scores = {90, 100, 80};
		// sorted() 自然排序(小->大)
		Arrays.stream(scores).sorted().forEach(System.out::println);
		// sorted() 反排序(大->小)
		Arrays.stream(scores) // int 串流
			  .boxed()  // 進行裝箱變成 Integer 串流 
			  .sorted(Comparator.reverseOrder()) // 已經反序的 Integer 串流
			  //.mapToInt(n -> n.intValue()) // 再轉為 int 串流 (此行可以省略)
			  //.mapToInt(n -> n) // 相當於 mapToInt(n -> n.intValue()) 自動拆箱 (此行可以省略)
			  .mapToInt(Integer::intValue) // 透過方法參考 (此行可以省略)
			  .forEach(System.out::println);
	}

}
