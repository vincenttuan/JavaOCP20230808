package day18;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class SetDemo3 {

	public static void main(String[] args) {
		// TreeSet (支援自然排序 小->大)
		Set<Integer> scores = new TreeSet<>(Arrays.asList(100, 80, 90));
		scores.add(75);
		//scores.add(null); // 不可以放 null
		System.out.println(scores.size());
		System.out.println(scores);
		
		
		// TreeSet (改變成反排序 大 -> 小)
		Comparator<Integer> comparator = (o1, o2) -> o2 - o1;
		Set<Integer> scores2 = new TreeSet<>(comparator);
		scores2.addAll(Arrays.asList(100, 80, 90)); // 利用 addAll 可以放多組元素
		scores2.add(75);
		System.out.println(scores2.size());
		System.out.println(scores2);
		
	}

}
