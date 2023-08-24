package day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class MapStream3 {

	public static void main(String[] args) {
		// 學生姓名如下:
		List<String> names = 
				Arrays.asList("王大明", "李曉華", "張三", "李四", "王五", "趙六", "王子麵", "張暖暖", "趙框應", "王靜");
		// 學生姓名請按照姓氏分組
		// 提示: "王大明".charAt(0) 可以得到姓氏
		// 提示: name -> name.charAt(0) 可以得到姓氏
		
		Map<Character, Long> result = names.stream()
				.collect(groupingBy(name -> name.charAt(0), counting()));
		System.out.println(result);
		
		// 按照名字長度分組
		// {3=5, 2=5}
		Map<Integer, Long> result2 = names.stream()
				//.collect(groupingBy(name -> name.length(), counting()));
				.collect(groupingBy(String::length, counting()));
		System.out.println(result2);
		
		// 按照名字長度進行主要分組, 再以姓氏進行次要分組
		Map<Integer, Map<Character, List<String>>> result3 = names.stream()
				.collect(groupingBy(String::length, groupingBy(name->name.charAt(0))));
		System.out.println(result3);
		
		
	}

}
