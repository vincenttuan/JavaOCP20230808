package day24;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 @FunctionalInterface
 public interface Runnable {
   public abstract void run();
 }
 
 @FunctionalInterface
 public interface Callable<V> {
   V call() throws Exception;
 }

 */

public class ExecJob7 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable r1 = () -> System.out.println("Hello Runnable");
		Callable<String> c1 = () -> "Hello Callable";
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future1 = executorService.submit(r1);
		System.out.println(future1.get()); // null, 因為 Runnable 沒有回傳值
		
		Future<String> future2 = executorService.submit(c1);
		System.out.println(future2.get());
		
	}

}
