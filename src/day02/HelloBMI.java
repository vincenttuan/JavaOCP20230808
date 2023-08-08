package day02;

public class HelloBMI {
	
	public static void main(String[] args) {
		double bmi = calcBMI(170, 60);
		// 可以自行決定要印出資料的樣式(比較有彈性)
		System.out.println(bmi);
		System.out.printf("%.2f\n", bmi);
		
	}
	
	// 建立一個可以計算 bmi 結果並回傳的方法
	// 方法簽章: public static double calcBMI(double h, double w)
	public static double calcBMI(double h, double w) {
		double bmi = w / Math.pow(h/100.0, 2);
		return bmi;
	} 
	
	
	
}
