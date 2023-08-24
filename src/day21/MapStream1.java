package day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.function.Function.identity;

public class MapStream1 {
	public static void main(String[] args) {
		List<String> fruits = 
				Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papapy");
		
		System.out.println(fruits);
		
		Map<String, Long> result = fruits.stream()
				.collect(groupingBy(name -> name, counting()));
		
		System.out.println(result);
		
		Map<String, Long> result2 = fruits.stream()
				.collect(groupingBy(identity(), counting()));
		System.out.println(result2);
		
	}
}
