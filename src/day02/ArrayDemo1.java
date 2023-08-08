package day02;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// 建立考試成績的一維陣列
		int[] scores = new int[] {100, 40, 30, 70, 60};
		// 透過 Arrays.toString(一維陣列變數) 查看陣列內的內容
		System.out.println(Arrays.toString(scores));
		// 改變陣列內某一個維度的內容
		scores[1] = 45;
		System.out.println(Arrays.toString(scores));
		// 陣列長度 length
		System.out.printf("陣列長度 %d\n", scores.length);
		// 陣列最小維度(0)的內容
		System.out.printf("陣列最小維度的內容 %d\n", scores[0]);
		// 陣列最大維度(length - 1)的內容
		System.out.printf("陣列最大維度的內容 %d\n", scores[scores.length - 1]);
	}

}
