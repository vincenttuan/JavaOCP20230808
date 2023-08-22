package day19;

import java.util.LinkedList;
import java.util.Queue;

public class ListDemo2 {
	public static void main(String[] args) {
		// Queue 佇列(排隊, 先進先出)
		Queue<String> customerQueue = new LinkedList<>();
		
		// 3位客戶加入排隊取餐
		// offer() 加入元素, poll() 將元素從對列中移除
		customerQueue.offer("John");
		customerQueue.offer("Mary");
		customerQueue.offer("Steve");
		System.out.printf("目前排隊狀況: %s\n", customerQueue);
		
		// 第一位客戶完成取餐
		String servedCustomer = customerQueue.poll();
		System.out.printf("%s 已經完成取餐\n", servedCustomer);
		System.out.printf("目前排隊狀況: %s\n", customerQueue);
		
		// 有一位新客戶加入排隊
		System.out.println("Lucy 加入排隊");
		customerQueue.offer("Lucy");
		System.out.printf("目前排隊狀況: %s\n", customerQueue);
		
	}
}
