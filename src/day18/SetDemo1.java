package day18;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// 集合的走訪器
		Set<Integer> scores = new LinkedHashSet<>();
		scores.add(100); // 100 不是 int 而是 Integer.valueOf(100)
		scores.add(Integer.valueOf(80));
		scores.add(null);
		scores.add(90);
		System.out.println(scores.size()); // 集合長度
		System.out.println(scores);
		
		// 集合的走訪器: for-each (只能讀取元素)
		for(Integer score : scores) {
			System.out.println(score);
		}
		
		System.out.println("------------------------------");
		
		// 集合走訪器: Iterator
		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			Integer score = iter.next();
			System.out.println(score);
			if(score == null) {
				iter.remove();
				System.out.println("移除元素: " + score);
			}
		}
		System.out.println(scores.size());
		System.out.println(scores);
		
	}

}
