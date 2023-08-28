package day25;

public class BankAccount {
	private double balance; // 帳戶餘額
	
	public BankAccount(double intialBalance) {
		this.balance = intialBalance;
	}
	
	// 提款方法
	public void withdraw(double amount) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s 要提款 $%d\n", threadName, amount);
		
		// 判斷帳戶餘額
		if(amount > 0 && amount <= balance) {
			System.out.printf("%s 提款 $%d 成功\n", threadName, amount);
			balance =- amount; // 減去餘額
		} else {
			System.out.printf("%s 提款 $%d 失敗\n", threadName, amount);
		}
	}
	
}
