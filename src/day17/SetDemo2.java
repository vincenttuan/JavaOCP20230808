package day17;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		//Set<String> subjects = new LinkedHashSet<String>(); // Java 5.0 開始使用泛型<>來限制元素的資料型別
		Set<String> subjects = new LinkedHashSet<>(); // Java 7.0 開始使用泛型<>來自動推斷元素的資料型別
		subjects.add("Math");
		subjects.add("Chinese");
		subjects.add("English");
		subjects.add(null);
		
		System.out.println(subjects);
		
		for(String data : subjects) {
			System.out.println(data);
		}
	}

}
