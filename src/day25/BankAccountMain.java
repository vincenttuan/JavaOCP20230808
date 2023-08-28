package day25;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000);
		
		Runnable withdraw1 = () -> {
			bankAccount.withdraw(500);
		};
		
		Runnable withdraw2 = () -> {
			bankAccount.withdraw(400);
		};
		
		Runnable withdraw3 = () -> {
			bankAccount.withdraw(300);
		};
		
		new Thread(withdraw1).start();
		new Thread(withdraw2).start();
		new Thread(withdraw3).start();
		
	}

}
