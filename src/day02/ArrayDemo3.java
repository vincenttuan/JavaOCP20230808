package day02;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 建立考試成績的一維陣列
		int[] scoresA = new int[] {100, 40, 30, 70, 60}; // A 班成績
		int[] scoresB = new int[] {80, 95, 44, 100, 35, 69}; // B 班成績
		System.out.printf("A班成績 %s\n", Arrays.toString(scoresA));
		System.out.printf("B班成績 %s\n", Arrays.toString(scoresB));
		// 印出 A, B 二班的總分與平均
		int sumA = getSum(scoresA);
		double avgA = getAvg(scoresA);
		int sumB = getSum(scoresB);
		double avgB = getAvg(scoresB);
		
		System.out.printf("A班總分 %d A班平均 %.1f\n", sumA, avgA);
		System.out.printf("B班總分 %d B班平均 %.1f\n", sumB, avgB);
	}
	
	// 1.請寫一個方法能夠得到 int[] 的總分
	public static int getSum(int[] scores) {
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	// 2.請寫一個方法能夠得到 int[] 的平均
	public static double getAvg(int[] scores) {
		int sum = getSum(scores);
		double lens = scores.length;
		double avg = sum / lens;
		return avg;
	}
	
}
