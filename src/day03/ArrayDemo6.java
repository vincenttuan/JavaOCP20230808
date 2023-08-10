package day03;

import java.util.Arrays;

public class ArrayDemo6 {

	public static void main(String[] args) {
		int[] scores = {40, 90, 70, 100, 60};
		// 取得最高分, 最低分, 總分, 平均, 個數
		int maxScore = Arrays.stream(scores).max().getAsInt(); // 最高分
		int minScore = Arrays.stream(scores).min().getAsInt(); // 最低分
		int sum      = Arrays.stream(scores).sum(); // 總分
		double avg   = Arrays.stream(scores).average().getAsDouble(); // 平均
		long count   = Arrays.stream(scores).count(); // 個數
		
		System.out.printf("最高分 %d, 最低分 %d, 總分 %d, 平均 %.1f, 個數 %d\n",
				maxScore, minScore, sum, avg, count);
		
	}

}
