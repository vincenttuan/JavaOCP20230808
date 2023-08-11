package day05;

public class MultiArray3 {
	public static void main(String[] args) {
		
		// 對稱型陣列
		int[][] allScores = {{100, 90, 80}, {70, 60, 50}};
		System.out.println(allScores.length); // 二維陣列的長度
		System.out.println(allScores[0].length); // 一維陣列的長度
		System.out.println(allScores[1].length); // 一維陣列的長度
		
		// 非對稱型陣列
		int[][] allScores2 = {{100, 90, 80}, {85, 75}};
		System.out.println(allScores2.length); // 二維陣列的長度 
		System.out.println(allScores2[0].length); // 一維陣列的長度
		System.out.println(allScores2[1].length); // 一維陣列的長度
	}
}
