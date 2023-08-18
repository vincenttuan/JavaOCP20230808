package lambda;

// 計算圓面積
public class CalcArea implements Calc {

	@Override
	public double apply(int r) {
		double area = Math.PI * Math.pow(r, 2);
		return area;
	}

}
