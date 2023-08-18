package stream;

import java.util.Arrays;

// Stream 串流
public class StreamDemo1 {

	public static void main(String[] args) {
		// 傳統陣列
		int[] scores = {100, 40, 80, 70, 55};
		// 進行串流轉換並透過終點流 forEach 將每一個元素印出
		Arrays.stream(scores)  // 將 int[] 轉換為 IntStream
			  .forEach(score -> System.out.println(score));
		
		// 進行串流轉換並透過終點流 forEach 將每一個元素(及格的)印出
		Arrays.stream(scores)
			  .forEach(score -> {
				  if(score >= 60) {
					  System.out.println(score);
				  }
			  });
		
		// 進行串流轉換並先將元素透過中間流filter來過濾出及格的元素, 最後透過終點流 forEach 將每一個元素印出
		Arrays.stream(scores)  // 1.進行串流轉換
			  .filter(score -> score >= 60)  // 2.透過中間流filter來過濾出及格的元素
			  .forEach(score -> System.out.println(score));  // 3.終點流 forEach 將每一個元素印出 
		
		
	}

}
