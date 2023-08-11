package day05;

public class MultiArray6 {
	public static void main(String[] args) {
		int[][] allScores = {{85, 90, 76}, {70, 82}, {65, 67, 100}};
		// 請求總分與平均
		int sum = 0;
		int count = 0;
		//-------------------------------------
		for(int[] scores : allScores) {
			for(int x : scores) {
				//System.out.println(x);
				sum += x;
				count++;
			}
		}
		//-------------------------------------
		double avg = (double)sum / count;
		System.out.printf("總分 %d 平均 %.1f\n", sum, avg);
	}
}
