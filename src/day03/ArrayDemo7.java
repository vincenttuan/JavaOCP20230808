package day03;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo7 {
	public static void main(String[] args) {
		int[] scores = {40, 90, 70, 100, 60};
		
		/*****************************************
		 * 取得最高分, 最低分, 總分, 平均, 個數
		 * 利用 java stream 所提供的統計物件來解題
		 *****************************************/
		
		IntSummaryStatistics stat = Arrays.stream(scores).summaryStatistics();
		
		System.out.printf("最高分 %d 最低分 %d 總分 %d 平均 %.1f 個數 %d",
				stat.getMax(), stat.getMin(), stat.getSum(), stat.getAverage(), stat.getCount());
		
		
	}
}
