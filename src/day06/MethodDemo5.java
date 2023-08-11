package day06;

public class MethodDemo5 {
	public static void main(String[] args) {
		int[] array = {100, 80, 70};
		update(array);
		System.out.println(array[0]);
		
	}
	
	public static void update(int[] x) {
		x[0] = 50;
	}
	
}
