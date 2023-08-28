package day24;

public class ExecJob {

	public static void main(String[] args) {
		// 執行印出奇數與偶數的工作
		// 單工作業模式
		Odd odd = new Odd();
		Even even = new Even();
		
		odd.job();
		even.job();

	}

}
