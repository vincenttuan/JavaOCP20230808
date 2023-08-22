package day18;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {

	public static void main(String[] args) {
		// 複合元素
		Exam e1 = new Exam("John", 100);
		Exam e2 = new Exam("Mary", 45);
		Exam e3 = new Exam("Jack", null);
		Exam e4 = new Exam("Rose", 85);
		Exam e5 = new Exam("Jean", 75);
		Exam e6 = new Exam("Jean", 75);
		
		Set<Exam> exams = new LinkedHashSet<>();
		exams.add(e1);
		exams.add(e2);
		exams.add(e3);
		exams.add(e4);
		exams.add(e5);
		exams.add(e6);
		
		System.out.println(exams.size());
		System.out.println(exams);
	}

}
