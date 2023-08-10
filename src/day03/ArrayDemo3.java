package day03;

import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
		// 合法的分數是 0~100
		// 請印出合法的及格分數
		int[] scores = new int[]{100, 40, 80, 50, -60, 250, 70};
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i] >= 60 && scores[i] <= 100) {
				System.out.println(scores[i]);
			}
		}
		
		for(int x : scores) {
			if(x >= 60 && x <= 100) {
				System.out.println(x);
			}
		}
		
		Arrays.stream(scores).forEach(x -> {
			
			if(x >= 60 && x <= 100) {
				System.out.println(x);
			}
			
		});
		
	}
}
