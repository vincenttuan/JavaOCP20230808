package lambda2;

public class CalcTest {

	public static void main(String[] args) {
		// 透過 Lambda 實現此程式時 "不" 須要先建立 CalcArea.java, CalcDiameter.java, CalcVolume.java 就可以使用
		// 簡化程式碼, 減少冗餘
		
		// Lambda for Circle Area
		Calc calcArea = (int r) -> Math.PI * Math.pow(r, 2);
		System.out.println(calcArea.apply(10));
		
		// Lambda for Diameter
		Calc calcDiameter = r -> 2 * r;
		System.out.println(calcDiameter.apply(10));
		
		// Lambda for Volume
		Calc calcVolume = (int r) -> {
			double volume = (4.0/3) * Math.PI * Math.pow(r, 3);
			return volume;
		};
	}

}
