package day25;

public class Cookie {
	
	private boolean empty = true; // 預設盤子是空的
	
	public synchronized void put(int no) throws InterruptedException { // no: 餅乾號碼
		if(empty == false) {
			wait();
		}
		System.out.printf("主人放第 %d 塊餅乾\n", no);
		empty = false; // 盤子有東西
		notify(); // 叫小狗
	}
	
	public synchronized void eat(int no) throws InterruptedException {
		if(empty == true) {
			wait();
		}
		System.out.printf("小狗吃第 %d 塊餅乾\n", no);
		empty = true; // 盤子清空
		notify(); // 叫主人
	}
	
}
