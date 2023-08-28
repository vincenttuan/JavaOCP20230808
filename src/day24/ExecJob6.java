package day24;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecJob6 {

	public static void main(String[] args) {
		// 1. 建立一個 Callable 物件
		Callable<Set<Integer>> lotto1 = new Lotto();
		Callable<Set<Integer>> lotto2 = new Lotto();
		
		// 2. 建立一條單執行緒(可以重複使用)
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		// 3. 任務提交
		Future<Set<Integer>> futute1 = executorService.submit(lotto1);
		Future<Set<Integer>> futute2 = executorService.submit(lotto2);
		
		// 4. 取得回傳結果
		try {
			Set<Integer> result1 = futute1.get();
			System.out.println(result1);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		try {
			Set<Integer> result2 = futute2.get();
			System.out.println(result2);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
	}

}

