package day03;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = new int[]{100, 90, 80, 70, 60, 50};
		// 1. 透過 Arrays.toString(scores) 可以直接顯示陣列每一個的元素內容
		System.out.println("1.透過 Arrays.toString(scores)");
		System.out.println(Arrays.toString(scores));
		
		// 2. 透過傳統 for-loop 依序印出元素內容
		System.out.println("2. 透過傳統 for-loop 依序印出元素內容");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		// 3. 透過傳統 for-each 依序印出元素內容
		System.out.println("3. 透過傳統 for-each 依序印出元素內容");
		for(int x : scores) {
			System.out.println(x);
		}
		
		// 4. 透過 Java Stream(串流) 的 forEach 依序印出元素內容
		System.out.println("4. 透過 Java Stream(串流) 的 forEach 依序印出元素內容");
		Arrays.stream(scores).forEach(x -> System.out.println(x));
		
		// 5. 透過 Java Stream(串流) 的 forEach 與方法參照 :: 依序印出元素內容
		// 方法參照 :: 的目的就是用更直接/省略綴(多餘的)程式碼的方式來定義 
		System.out.println("5. 透過 Java Stream(串流) 的 forEach 與方法參照 :: 依序印出元素內容");
		Arrays.stream(scores).forEach(System.out::println);
		
	}	

}
