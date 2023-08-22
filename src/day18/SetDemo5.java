package day18;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {

	public static void main(String[] args) {
		
		Exam e1 = new Exam("John", 100);
		Exam e2 = new Exam("Mary", 45);
		Exam e3 = new Exam("Rose", 85);
		
		// 放在 TreeSet 中的物件必須要實作 Comparable 介面
		Set<Exam> exams = new TreeSet<>();
		exams.add(e1);
		exams.add(e2);
		exams.add(e3);
		
		System.out.println(exams.size());
		System.out.println(exams);

	}

}
