package lambda;

// 計算球體積
public class CalcVolume implements Calc {

	@Override
	public double apply(int r) {
		double volume = 4/3.0 * Math.PI * Math.pow(r, 3);
		return volume;
	}
	
}
