package day03;

import java.util.Arrays;

public class ArrayDemo5 {
	public static void main(String[] args) {
		int[] scores = {40, 90, 70, 100, 60};
		// 請印出最高分 = ?
		int maxScore = 0; // 最高分
		for(int i=0;i<scores.length;i++) {
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		System.out.printf("最高分 = %d\n", maxScore);
		
		int maxScore2 = Arrays.stream(scores).max().getAsInt();
		System.out.printf("最高分 = %d\n", maxScore2);
	}
}
