package lambda3;

import java.util.Date;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CalcTest {

	public static void main(String[] args) {
		// 若沒有 Calc.java 這個介面要如何透過 Lambda 語法實現圓面積,球體積與直徑的計算
		// Function 的使用
		Function<Integer, Double> calcArea = r -> Math.pow(r, 2) * Math.PI;
		System.out.println(calcArea.apply(10));
		
		// Consumer 的使用
		Consumer<String> welcome = name -> System.out.printf("歡迎 %s 蒞臨本公司指導!\n", name);
		welcome.accept("Vincent");
		
		// Predicate 的使用
		Predicate<Integer> scorePass = score -> score >= 60;
		System.out.println(scorePass.test(75));
		System.out.println(scorePass.test(45));
		
		// Supplier 的使用
		Supplier<Date> today = () -> new Date();
		System.out.println(today.get());
		
		Supplier<Integer> luckyNumber = () -> new Random().nextInt(100);
		System.out.println(luckyNumber.get());
		
	}

}
