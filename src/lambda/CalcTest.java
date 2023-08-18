package lambda;

public class CalcTest {

	public static void main(String[] args) {
		Calc calc1 = new CalcArea();
		System.out.println(calc1.apply(10));
		
		Calc calc2 = new CalcDiameter();
		System.out.println(calc2.apply(10));
		
		Calc calc3 = new CalcVolume();
		System.out.println(calc3.apply(10));

	}

}
