package day24;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

// 設計一個具有回傳樂透號碼的 Callable
// 樂透號碼: 1~39取5個不重複的數字 (樂透539)
public class Lotto implements Callable<Set<Integer>> {
	private Random random = new Random();
	@Override
	public Set<Integer> call() throws Exception {
		Set<Integer> nums = new LinkedHashSet<>();
		while (nums.size() < 5) {
			nums.add(random.nextInt(39) + 1);
		}
		return nums;
	}

}
