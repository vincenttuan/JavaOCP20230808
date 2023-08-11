package day06;

public class MethodDemo6 {

	public static void main(String[] args) {
		int[] array = {100, 80, 70};
		// 請寫一個方法能夠計算並印出總和
		calcSumAndPrint(array);
	}
	
	public static void calcSumAndPrint(int[] array) {
		int sum = 0;
		for(int x : array) {
			sum += x;
		}
		System.out.println(sum);
	}

}
