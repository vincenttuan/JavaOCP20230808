package lambda;

// 計算直徑
public class CalcDiameter implements Calc {

	@Override
	public double apply(int r) {
		int diameter = 2 * r; 
		return diameter;
	}
	
}
