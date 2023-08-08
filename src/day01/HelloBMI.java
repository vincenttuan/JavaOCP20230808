package day01;

public class HelloBMI {

	public static void main(String[] args) {
		calcBMIAndPrint(170, 60.0);
		
		double height = 180, weight = 75.5;
		calcBMIAndPrint(height, weight);
		
		
		calcBMIAndPrint(1700, -60.0);
		
	}
	
	// 請設計一個方法可以計算並印出BMI的資料
	// 方法簽章定義: public static void calcBMIAndPrint(double h, double w)
	// 方法執行結果範例: 身高: 170.0 體重: 60.0 BMI 20.76
	public static void calcBMIAndPrint(double h, double w) {
		// 檢查 h, w 是否合理?
		if(h < 50 || h > 400 || w < 10 || w > 1000) {
			System.out.printf("身高: %.1f 體重: %.1f 資料無法計算, 請重新輸入\n", h, w);
			return;
		}
		
		//double bmi = w / ((h/100)*(h/100));
		double bmi = w / Math.pow(h/100.0, 2);
		System.out.printf("身高: %.1f 體重: %.1f BMI %.1f\n", h, w, bmi);
	}	

}
