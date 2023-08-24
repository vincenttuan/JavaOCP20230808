package day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class MapStream2 {

	public static void main(String[] args) {
		// 按學生成績區間分組
		// 80 以上 "高標"
		// 60 以上 "中標"
		// 60 以下 "低標"
		List<Integer> scores = Arrays.asList(85, 60, 75, 90, 45, 80, 70, 90, 95, 40);
		// 試問高標, 中標, 低標各有多少人 ?
		Map<String, Long> result = scores.stream()
				.collect(groupingBy((score) -> {
					if(score >= 80) return "高標";
					else if(score >= 60) return "中標";
					else return "低標";
				}, counting()));
		
		System.out.println(result);
	}

}
