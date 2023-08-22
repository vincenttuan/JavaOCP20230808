package day18;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
		/*
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
		*/
		
		// 使用 Java Stream 來移除 null 元素
		Set<Integer> newScores = scores.stream()
									   .filter(score -> score != null)  // 過濾出非 null 的元素
									   .collect(Collectors.toSet());    // 將符合的元素重新收集並建立一個新的集合來存放(預設是 HashSet)
		System.out.println(newScores.size());
		System.out.println(newScores);
		
		// 由於 Collectors.toSet() 預設是 HashSet
		// 若要改為 LinkedHashSet 則必須要透過 Collectors.toCollection(LinkedHashSet::new)
		Set<Integer> newScores2 = scores.stream()
				   						.filter(score -> score != null)  // 過濾出非 null 的元素
				   						//.collect(Collectors.toCollection(() -> new LinkedHashSet<>())); // 將符合的元素重新收集並建立一個新的集合來存放
										.collect(Collectors.toCollection(LinkedHashSet::new)); // 將符合的元素重新收集並建立一個新的集合來存放
		System.out.println(newScores2.size());
		System.out.println(newScores2);

	}

}
