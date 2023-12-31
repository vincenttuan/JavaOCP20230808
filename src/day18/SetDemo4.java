package day18;

import java.util.LinkedHashSet;
import java.util.Objects;
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
		
		// 計算總分(不含缺考)
		int sum = 0;
		for(Exam exam : exams) {
			Integer score = exam.getScore();
			if(score != null) {
				//sum += score.intValue();
				sum += score; // auto-unboxed
			}
		}
		System.out.printf("總分: %d\n", sum);
		
		// 計算總分(不含缺考) 利用 java stream
		int sum2 = exams.stream()
						.filter(exam -> exam.getScore() != null)
						//.mapToInt(exam -> exam.getScore().intValue())
						.mapToInt(Exam::getScore)
						.sum();
		System.out.printf("總分: %d\n", sum2);
		
		int sum3 = exams.stream() // Exam stream
						.map(exam -> exam.getScore()) // Integer stream
						//.filter(score -> score != null)  // Integer stream
						.filter(Objects::nonNull)  // Integer stream
						//.mapToInt(score -> score.intValue()) // int stream
						.mapToInt(Integer::intValue) // int stream
						.sum();
		System.out.printf("總分: %d\n", sum3);
		
		// 規納 reduce
		int sum4 = exams.stream()  // Exam stream
						.map(exam -> exam.getScore())  // Integer stream
						.filter(Objects::nonNull)  // Integer stream
						//.reduce(0, (a, b) -> a + b);
						//.reduce(0, (a, b) -> Integer.sum(a, b));
						.reduce(0, Integer::sum);
		System.out.printf("總分: %d\n", sum4);
		
		// 利用 ? :
		int sum5 = exams.stream()
						.mapToInt(exam -> exam.getScore() == null ? 0 : exam.getScore())
						.sum();
		System.out.printf("總分: %d\n", sum5);
	}

}
