package day03;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = new int[]{100, 90, 80, 70, 60, 50};
		// 1. 透過 Arrays.toString(scores) 可以直接顯示陣列每一個的元素內容
		System.out.println("1.透過 Arrays.toString(scores)");
		System.out.println(Arrays.toString(scores));
		// 2. 透過 for-loop 依序印出元素內容
		System.out.println("2. 透過 for-loop 依序印出元素內容");
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
	}

}
