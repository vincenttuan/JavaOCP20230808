package day05;

public class MultiArray5 {

	public static void main(String[] args) {
		int[][] allScores = {{100, 90, 80}, {70, 60, 50}};
		// 請印出 allScores 裡面所有的值
		// for-each
		// 求總分 = ?
		int sum = 0;
		int count = 0;
		//----------------------------------------------
		for(int[] scores : allScores) { // 分析二維陣列
			for(int x : scores) { // 分析一維陣列
				System.out.println(x);
				sum += x;
				count++;
			}
		}
		//----------------------------------------------
		System.out.printf("%d\n", sum);
		double avg = (double)sum / count;
		System.out.printf("%.1f\n", avg);
	}

}
