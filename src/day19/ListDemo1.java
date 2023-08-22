package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {
	public static void main(String[] args) {
		// ArrayList 動態陣列
		// 當前的容量不足以容納新元素時, 他將分配到一個更大的數組, 並將之前的所有元素複製到新的數組當中
		// 優勢:新增元素快
		// 劣勢:中間插入元素, 刪除慢
		List<Integer> scores = new ArrayList<>();
		scores.add(100);
		scores.add(90);
		scores.add(100);
		scores.add(85);
		scores.add(45);
		System.out.println(scores.size());
		System.out.println(scores);
		System.out.println(scores.get(1));
		
		// 走訪器: for-loop, for-each, Iterator, ListIterator
		ListIterator<Integer> iter = scores.listIterator();
		// 往後(右)尋訪
		while (iter.hasNext()) {
			int index = iter.nextIndex();
			Integer score = iter.next();
			System.out.printf("index: %d score: %d\n", index, score);
		}
		// 往前(左)尋訪
		while (iter.hasPrevious()) {
			int index = iter.previousIndex();
			Integer score = iter.previous();
			System.out.printf("index: %d score: %d\n", index, score);
		}
		
	}
}
