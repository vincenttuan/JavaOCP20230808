package stream;

import java.util.stream.IntStream;

public class StreamDemo4 {

	public static void main(String[] args) {
		// 串流迴圈
		IntStream.range(1, 10).forEach(i -> System.out.printf("i = %d\n", i));
		
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.printf("i = %d\n", i));
		
		// 印出 10 個 Java
		IntStream.rangeClosed(1, 10).forEach(i -> System.out.println("Java"));
	}

}
