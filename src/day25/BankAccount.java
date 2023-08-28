package day25;

public class BankAccount {
	private int balance; // 帳戶餘額
	
	public BankAccount(int intialBalance) {
		this.balance = intialBalance;
	}
	
	// 提款方法
	public synchronized void withdraw(int amount) {
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
	}
	
	// 存款方法
	public synchronized void deposit(int amount) {
		String threadName = Thread.currentThread().getName();
		if(amount > 0) {
			for(int i=0;i<=100000000;i++); // 模擬花費時間
			System.out.printf("%s 存款 $%d 成功\n", threadName, amount);
			balance += amount; // 加上餘額
		}
	}
	
}
