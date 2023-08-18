package stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import static java.lang.System.out;

public class StreamDemo2 {

	public static void main(String[] args) {
		// 傳統陣列
		int[] scores = {100, 42, 83, 70, -30, 55, 203};
		// 合法分數範圍是 0~100
		IntPredicate legalScore = x -> x >= 0 && x <= 100;
		IntPredicate passScore = x -> x >= 60;
		// 1. 請利用 Stream 語法印出合法的分數
		out.println("1. 請利用 Stream 語法印出合法的分數");
		//Arrays.stream(scores).filter(score -> score >= 0 && score <= 100).forEach(out::println);
		Arrays.stream(scores).filter(legalScore).forEach(out::println);
		
		// 2. 請利用 Stream 語法印出合法的及格分數
		out.println("2. 請利用 Stream 語法印出合法的及格分數");
		//Arrays.stream(scores).filter(score -> score >= 60 && score <= 100).forEach(out::println);
		Arrays.stream(scores)
			  .filter(legalScore)
			  .filter(passScore)
			  .forEach(out::println);
		
		// 3. 請計算(合法)平均
		out.println("3. 請計算(合法)平均");
		double avg = Arrays.stream(scores).filter(legalScore).average().getAsDouble();
		out.println(avg);
		
		OptionalDouble optAvg = Arrays.stream(scores).filter(legalScore).average();
		if(optAvg.isPresent()) {
			out.println(optAvg.getAsDouble());
		} else {
			out.println("無平均分數");
		}
		
		// 4. 請計算(合法)總分
		
		
	}

}
