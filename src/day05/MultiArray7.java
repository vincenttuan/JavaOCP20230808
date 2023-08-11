package day05;

public class MultiArray7 {

	public static void main(String[] args) {
		// 三人的身高與體重如下
		double[][] values = {
								{170.0, 180.0, 165.0}, // 身高
								{60.0, 75.5, 55.0}     // 體重
							};
		// 請計算這三位的 BMI
		for(int i=0;i<values[0].length;i++) {
			//System.out.println("i: " + i);
			//System.out.println("身高:" + values[0][i]);
			//System.out.println("體重:" + values[1][i]);
			double h = values[0][i];
			double w = values[1][i];
			double bmi = w / Math.pow(h/100, 2);
			System.out.println("BMI: " + bmi);
		}

	}

}
