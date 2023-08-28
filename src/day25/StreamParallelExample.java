package day25;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 執行緒平行計算

public class StreamParallelExample {

	public static void main(String[] args) {
		//List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> numbers = IntStream.rangeClosed(1, 100_0000)
										 .boxed()
										 .collect(Collectors.toList());
		
		// 計時開始
		long startTime = System.nanoTime();
		
		// 計算 complexCalculation
		// 利用 parallelStream() 平行串流
		long sum = numbers.parallelStream()
					.mapToLong(StreamParallelExample::complexCalculation)
					.sum();
		
		// 計時開始
		long endTime = System.nanoTime();
				
		System.out.println(sum);
		System.out.printf("花費時間: %,d\n", (endTime - startTime));
		
	}
	
	// 增加計算複雜度的方法
    private static long complexCalculation(int num) {
        return IntStream.rangeClosed(1, 100)
                        .mapToLong(i -> i * num)
                        .sum();
    }

}
