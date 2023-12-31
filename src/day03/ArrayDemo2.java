package day03;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 有一個半徑陣列裡面有3個半徑如下
		int[] radius = {10, 25, 45};
		// 請透過 for-loop, for-each, Stream 的 forEach
		// 分別印出這三個半徑的直徑內容
		for(int i=0;i<radius.length;i++) {
			System.out.println(radius[i] * 2);
		}
		
		for(int r : radius) {
			System.out.println(r * 2);
		}
		
		Arrays.stream(radius).forEach(r -> System.out.println(r*2));
		
	}

}
