package day20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// 水果名的集合
		List<String> names = 
				Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		// 每種水果的出現次數
		// {apple=3, banana=2, orange=1, papaya=1}
		Map<String, Integer> result = new HashMap<>();
		
		for(String name : names) {
			// 若 result 是否有包含 name
			if(result.containsKey(name)) {
				// put name 並將原本值的內容 + 1
				result.put(name, result.get(name) + 1);
			} else {
				result.put(name, 1);
			}
		}
		
		System.out.println(result);

	}

}
