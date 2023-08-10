package day03;

import java.util.Arrays;

public class ArrayDemo4 { // begin
	
	public static void main(String[] args) { // main-begin
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// 1.請印出偶數 2.印出所有偶數的總和
		// 使用 for-loop, for-each 與 Stream 的 forEach
		int sum1 = 0; // 所有偶數的總和
		for(int i=0;i<values.length;i++) {
			if(values[i] % 2 == 0) {
				System.out.println(values[i]);
				sum1 += values[i]; // sum1 = sum1 + values[i];
			}
		}
		System.out.printf("總和:%d\n", sum1);
		
		int sum2 = 0;
		for(int x : values) {
			if(x % 2 == 0) {
				System.out.println(x);
				sum2 += x;
			}
		}
		System.out.printf("總和:%d\n", sum2);
		
		Arrays.stream(values)
			  .filter(x -> x % 2 == 0)
			  .forEach(x -> System.out.println(x));
		
		int sum3 = Arrays.stream(values)
						 .filter(x -> x % 2 == 0)
						 .sum();
		System.out.printf("總和:%d\n", sum3);
		
	} // main-end
	
} // end
