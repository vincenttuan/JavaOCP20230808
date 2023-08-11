package day05;

public class MultiArray8 {

	public static void main(String[] args) {
		// 三人的身高與體重如下
		double[][] values = {
				{170.0, 60.0}, 
				{180.0, 75.5}, 
				{165.0, 55.0}
			};
		
		// 請計算這三位的 BMI
		for(double[] value : values) {
			//System.out.println("身高:" + value[0]);
			//System.out.println("體重:" + value[1]);
			double h = value[0];
			double w = value[1];
			double bmi = w / Math.pow(h/100, 2);
			System.out.println(bmi);
		}
		
	}

}
