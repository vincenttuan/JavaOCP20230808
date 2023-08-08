package day02;

public class HelloBMIPrint {

	public static void main(String[] args) {
		double bmi = calcBMI(170, 60);
		printBMI(bmi);
		
		printBMI(calcBMI(180, 70));
	}
	
	// 1.設計一個有回傳值的方法來計算 bmi 的值
	public static double calcBMI(double h, double w) {
		double bmi = w / Math.pow(h/100.0, 2);
		return bmi;
	} 
	
	// 2.設計一個無回傳值的方法來印出 bmi 的值
	public static void printBMI(double bmi) {
		System.out.printf("BMI %.2f\n", bmi);
	}

}
