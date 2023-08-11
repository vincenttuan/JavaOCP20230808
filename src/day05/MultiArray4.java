package day05;

public class MultiArray4 {
	public static void main(String[] args) {
		int[][] allScores = {{100, 90, 80}, {70, 60, 50}};
		// 請印出 allScores 裡面所有的值
		System.out.println(allScores[0][0]);
		System.out.println(allScores[0][1]);
		System.out.println(allScores[0][2]);
		
		System.out.println(allScores[1][0]);
		System.out.println(allScores[1][1]);
		System.out.println(allScores[1][2]);
		
		// for-loop
		for(int i=0;i<2;i++) {
			for(int k=0;k<3;k++) {
				System.out.println(allScores[i][k]);
			}
		}
		
		for(int i=0;i<allScores.length;i++) {
			for(int k=0;k<allScores[i].length;k++) {
				System.out.println(allScores[i][k]);
			}
		}
		
		
		
	}
}
