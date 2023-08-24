package day20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		// 學生成績的集合
		List<Integer> scores = 
				Arrays.asList(85, 90, 75, 90, 80, 85, 70, 90, 80);
		// 每一個成績的學生數量
		// 例如: {70=1, 75=1, 80=2, 85=3, 90=3}
		Map<Integer, Integer> result = new HashMap<>();
		
		for(Integer score : scores) {
			if(result.containsKey(score)) {
				result.put(score, result.get(score) + 1);
			} else {
				result.put(score, 1);
			}
		}
		System.out.println(result);
		System.out.println(result.get(90));
	}

}
