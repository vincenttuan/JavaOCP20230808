package day05;

public class MultiArray2 {

	public static void main(String[] args) {
		// 將多個一維陣列結合成一的多維陣列
		int[] scores = {100, 90}; // 一維陣列
		System.out.println(scores);
		
		int[][] allScores = { {100, 90, 80}, {70, 60, 50} }; // 二維陣列
		System.out.println(allScores); // 二維陣列
		System.out.println(allScores[0]); // 一維陣列
		System.out.println(allScores[0][0]); // 值
		System.out.println(allScores[0][1]); // 值
		System.out.println(allScores[0][2]); // 值
		
		System.out.println(allScores[1]); // 一維陣列
		System.out.println(allScores[1][0]); // 值
		System.out.println(allScores[1][1]); // 值
		System.out.println(allScores[1][2]); // 值
	}

}
