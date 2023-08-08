package day02;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 建立考試成績的一維陣列
		int[] scores = new int[] {100, 40, 30, 70, 60};
		// 透過 Arrays.toString(一維陣列變數) 查看陣列內的內容
		System.out.println(Arrays.toString(scores));
		
		// 逐筆印出每一個維度的內容
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		// 計算總分(加總每一個維度的內容)
		System.out.println(scores[0] + scores[1] + scores[2] + scores[3] + scores[4]);
		System.out.println();
		// 逐筆印出每一個維度的內容-使用 forloop
		// 計算總分(加總每一個維度的內容)
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println(sum);
		// 請計算平均 = ?
		int avg = sum / scores.length;
		System.out.println(avg);
	}

}
