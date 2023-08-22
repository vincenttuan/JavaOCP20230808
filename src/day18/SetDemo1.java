package day18;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// 集合的走訪器
		Set<Integer> scores = new LinkedHashSet<>();
		scores.add(100);
		scores.add(80);
		scores.add(null);
		scores.add(90);
		System.out.println(scores.size()); // 集合長度
		System.out.println(scores);

	}

}
