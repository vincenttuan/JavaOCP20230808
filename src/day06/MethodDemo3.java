package day06;

public class MethodDemo3 {
	public static void main(String[] args) {
		
		int[] array = {100, 80, 70};
		printArray(array);
		printArray(array);
		printArray(array);
		
	}
	
	public static void printArray(int[] array) {
		for(int x : array) {
			System.out.println(x);
		}
	}
	
}
