package lambda;

public class CalcTest {

	public static void main(String[] args) {
		// 實現此程式時必須要先建立 CalcArea.java, CalcDiameter.java, CalcVolume.java 才可以使用
		
		Calc calc1 = new CalcArea();
		System.out.println(calc1.apply(10));
		
		Calc calc2 = new CalcDiameter();
		System.out.println(calc2.apply(10));
		
		Calc calc3 = new CalcVolume();
		System.out.println(calc3.apply(10));

	}

}
