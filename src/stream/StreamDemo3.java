package stream;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

import static java.lang.System.out;

public class StreamDemo3 {

	public static void main(String[] args) {
		// 傳統陣列 (車速)
		int[] speeds = {100, 42, 83, 70, -30, 55, 203};
		// 限速是 70 公里, 每超過一公里罰款 100 元, 請印出每台車的罰款金額, 若無罰款則顯示 0
		int limitSpeed = 70;
		int fine = 100;
		
		Arrays.stream(speeds)
			  .map(speed -> speed < 0 ? 0 : speed)  // 將負值轉 0
			  //.peek(out::println)
			  .map(speed -> speed - limitSpeed > 0 ? speed - limitSpeed : 0)  // 得到每台車超速幾公里
			  .map(speeding -> speeding * fine) // 計算罰款
			  .forEach(out::println);
		
		Arrays.stream(speeds)
			  .map(speed -> Math.max(0, speed - limitSpeed) * fine)
			  .forEach(out::println);
		
		IntUnaryOperator fineMap = speed -> Math.max(0, speed - limitSpeed) * fine;
		// 超過 15 公里內不罰
		IntUnaryOperator fineMap2 = speed -> Math.max(0, (speed-15) - limitSpeed) * fine;
		
		Arrays.stream(speeds)
		  	.map(fineMap2)
		  	.forEach(out::println);
	
	}

}
