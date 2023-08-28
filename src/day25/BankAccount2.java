package day25;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 採用 ReentrantLock 來取代 synchronized
public class BankAccount2 {
	private int balance; // 帳戶餘額
	private final Lock lock = new ReentrantLock(); // 創建鎖
	
	public BankAccount2(int intialBalance) {
		this.balance = intialBalance;
	}
	
	// 提款方法
	public void withdraw(int amount) {
		lock.lock(); // 取得鎖
		try {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s 要提款 $%d\n", threadName, amount);
			
			// 判斷帳戶餘額
			if(amount > 0 && amount <= balance) {
				
				for(int i=0;i<=100000000;i++); // 模擬花費時間
				
				System.out.printf("%s 提款 $%d 成功\n", threadName, amount);
				balance -= amount; // 減去餘額
			} else {
				System.out.printf("%s 提款 $%d 失敗\n", threadName, amount);
			}
			
			// 印出目前餘額
			System.out.printf("%s 查看目前餘額 $%d\n", threadName, balance);
		} finally {
			lock.unlock(); // 釋放鎖
		}
	}
	
	// 存款方法
	public void deposit(int amount) {
		lock.lock(); // 取得鎖
		try {
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s 要存款 $%d\n", threadName, amount);
			if(amount > 0) {
				for(int i=0;i<=100000000;i++); // 模擬花費時間
				System.out.printf("%s 存款 $%d 成功\n", threadName, amount);
				balance += amount; // 加上餘額
			}
			// 印出目前餘額
			System.out.printf("%s 查看目前餘額 $%d\n", threadName, balance);
		} finally {
			lock.unlock(); // 釋放鎖
		}
	}
	
}
