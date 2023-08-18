package lambda3;

import java.util.function.Function;

public class CalcTest {

	public static void main(String[] args) {
		// 若沒有 Calc.java 這個介面要如何透過 Lambda 語法實現圓面積,球體積與直徑的計算
		Function<Integer, Double> calcArea = r -> Math.pow(r, 2) * Math.PI;
		System.out.println(calcArea.apply(10));
		

	}

}
