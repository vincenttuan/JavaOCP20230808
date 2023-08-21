package day17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		//Set subjects = new HashSet(); // [English, Chinese, Math]
		Set subjects = new LinkedHashSet(); // [Math, Chinese, English]
		//Set subjects = new TreeSet(); // [Chinese, English, Math]
		subjects.add("Math");
		subjects.add("Chinese");
		subjects.add("English");
		subjects.add(100);
		subjects.add(3.14);
		subjects.add(null);
		
		System.out.println(subjects);
		
		for(Object data : subjects) {
			System.out.println(data);
		}
	}

}
