package day05;

public class MultiArray1 {

	public static void main(String[] args) {
		// 多陣列運算
		int[] scoresA = {100, 90, 80}; // A 班成績
		int[] scoresB = {95, 85, 75};  // B 班成績
		int[] scoresC = {75, 55, 100}; // C 班成績
		
		// 1. 試問 A班+B班+C班 的總分為多少
		int sum = 0;
		for(int i=0;i<scoresA.length;i++) {
			sum += scoresA[i] + scoresB[i] + scoresC[i];
		}
		System.out.println(sum);
		
		// 2. 試問 A班+B班+C班 的平均為多少
		int lens = scoresA.length + scoresB.length + scoresC.length;
		double avg = (double)sum / lens;
		System.out.printf("%.1f\n", avg);
		

	}

}
