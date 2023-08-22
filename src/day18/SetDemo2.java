package day18;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.OptionalDouble;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set<Integer> scores = new LinkedHashSet<>(Arrays.asList(100, 40, 70, 60, 50, null));
		scores.add(85);
		System.out.println(scores.size());
		System.out.println(scores);
		
		// 計算及格的平均分數 = ?
		// 就是計算 100, 70, 60, 85 的平均
		OptionalDouble optAvg = scores.stream() // Integer stream
									  .filter(score -> score != null)
									  .filter(score -> score >= 60)
									  .mapToInt(Integer::intValue)  // 要從 Integer stream 轉 int stream
									  .average();
		if(optAvg.isPresent()) { // 是否有平均可以呈現
			System.out.println(optAvg.getAsDouble());
		} else {
			System.out.println("無及格的平均分數");
		}
		
	}
}
