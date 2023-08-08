package day01;

public class Hello3 {

	public static void main(String[] args) {
		String myName1 = "Jack"; // 區域變數
		String myName2 = "Rose"; // 區域變數
		
		welcome(myName1);
		
		welcome(myName1, myName2);

	}
	
	public static void welcome(String name) {
		System.out.printf("歡迎 %s 蒞臨指導~~\n", name);
	}
	
	public static void welcome(String name1, String name2) {
		System.out.printf("歡迎 %s, %s 蒞臨指導~~\n", name1, name2);
	}
	
}
