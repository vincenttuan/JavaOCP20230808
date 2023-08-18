package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
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
		out.println("4. 請計算(合法)總分");
		int sum = Arrays.stream(scores).filter(legalScore).sum();
		out.println(sum);
		
		// 5. 請計算(合法)最高分與最低分
		out.println("5. 請計算(合法)最高分與最低分");
		int maxScore = Arrays.stream(scores).filter(legalScore).max().getAsInt();
		int minScore = Arrays.stream(scores).filter(legalScore).min().getAsInt();
		System.out.println(maxScore);
		System.out.println(minScore);
		
		// 6. 請計算(合法)分數個數,總分,平均,最高分與最低分, 可以利用統計物件(IntSummaryStatistics)來達成
		out.println("6. 請計算(合法)分數個數,總分,平均,最高分與最低分");
		IntSummaryStatistics stat = Arrays.stream(scores).filter(legalScore).summaryStatistics();
		out.println(stat);
		out.println("個數:" + stat.getCount());
		out.println("總分:" + stat.getSum());
		out.println("平均:" + stat.getAverage());
		out.println("最高:" + stat.getMax());
		out.println("最低:" + stat.getMin());
		
		// 7. 請排序(合法)分數: 小->大(預設是自然排序)
		out.println("7. 請排序(合法)分數: 小->大");
		Arrays.stream(scores)
			  .filter(legalScore)
			  .sorted()
			  .forEach(out::println);
		
		// 8. 請排序(合法)分數: 大->小
		out.println("8. 請排序(合法)分數: 大->小");
		Arrays.stream(scores)
			  .filter(legalScore)
			  .boxed() // Integer 物件
			  //.sorted((s1, s2) -> s2 - s1)
			  .sorted(Comparator.reverseOrder())
			  .forEach(out::println);
		
		// 9. 對印文字印出 優, 良, 及格, 不及格
		// score >= 90 印出 "優"
		// score >= 80 印出 "良"
		// score >= 60 印出 "及格"
		// score < 60  印出 "不及格"
		// 例如: 100, 42, 83, 70, 55 印出 "優", "不及格", "良", "及格", "不及格"
		out.println("9. 對印文字印出 優, 良, 及格, 不及格");
		Arrays.stream(scores)
			  .filter(legalScore)
			  .mapToObj(score -> {
				  if(score >= 90) return "優";
				  if(score >= 80) return "良";
				  if(score >= 60) return "及格";
				  return "不及格";
			  })
			  .forEach(out::println);
		
		
	}

}
