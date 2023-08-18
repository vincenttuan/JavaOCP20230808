package lambda3;

import java.util.Date;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CalcTest {

	public static void main(String[] args) {
		// 若沒有 Calc.java 這個介面要如何透過 Lambda 語法實現圓面積,球體積與直徑的計算
		// Function 的使用
		// public interface Function<T, R>
		//     R apply(T t) 
		Function<Integer, Double> calcArea = r -> Math.pow(r, 2) * Math.PI;
		System.out.println(calcArea.apply(10));
		
		// BIFunction 的使用
		// public interface BiFunction<T,U,R>
		//     R apply(T t, U u)
		BiFunction<Integer, Float, Double> total = (amount, price) -> (double)(amount * price);
		System.out.printf("total = %.1f\n", total.apply(9, 3.5f));
		
		// BinaryOperator 的使用
		// public interface BinaryOperator<T> extends BiFunction<T,T,T>
		//     T apply(T t1, T t2)
		BinaryOperator<Integer> rectArea = (w, h) -> w * h;
		System.out.printf("area = %d\n", rectArea.apply(10, 20));
		
		// UnaryOperator 的使用
		// public interface UnaryOperator<T> extends Function<T,T>
		//     T apply(T t)
		UnaryOperator<Integer> calcDiameter = r -> 2 * r;
		System.out.printf("diameter = %d\n", calcDiameter.apply(15));
		
		
		
		// Consumer 的使用
		Consumer<String> welcome = name -> System.out.printf("歡迎 %s 蒞臨本公司指導!\n", name);
		welcome.accept("Vincent");
		
		// BiConsumer 的使用
		// public interface BiConsumer<T,U> 
		//     void accept(T t, U u)
		BiConsumer<Integer, Double> area = (r, pi) -> System.out.println(r * r * pi);
		area.accept(10, 3.14);
		
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
