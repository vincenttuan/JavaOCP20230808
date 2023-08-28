package day25;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 執行緒平行計算
public class StreamParallelExample {

	public static void main(String[] args) {
		//List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numbers = IntStream.rangeClosed(1, 10_0000)
										 .boxed()
										 .collect(Collectors.toList());
		
		// 計時開始
		long startTime = System.nanoTime();
		
		// 計算每個元素平方之後的總和
		// 利用 parallelStream() 平行串流
		int sum = numbers.parallelStream()
						 .mapToInt(num -> (num * num + num * num * num) / 2)
                		 .sum();
		
		// 計時開始
		long endTime = System.nanoTime();
				
		System.out.println(sum);
		System.out.printf("花費時間: %,d\n", (endTime - startTime));
		

	}

}
