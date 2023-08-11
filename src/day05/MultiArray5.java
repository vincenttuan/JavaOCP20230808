package day05;

public class MultiArray5 {

	public static void main(String[] args) {
		int[][] allScores = {{100, 90, 80}, {70, 60, 50}};
		// 請印出 allScores 裡面所有的值
		// for-each
		// 求總分 = ?
		int sum = 0;
		for(int[] scores :allScores) {
			for(int x : scores) {
				System.out.println(x);
				sum += x;
			}
		}
		System.out.println(sum);
	}

}
