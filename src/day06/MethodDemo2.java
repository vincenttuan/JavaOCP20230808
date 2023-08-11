package day06;

public class MethodDemo2 {

	public static void main(String[] args) {
		calcBMIAndPrint(170.0, 60.0);
		
		calcBMIAndPrint(180.0, 85.0);
	}
	
	public static void calcBMIAndPrint(double h, double w) {
		System.out.println(h);
		System.out.println(w);
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
	}

}
