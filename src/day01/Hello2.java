package day01;

public class Hello2 {

	public static void main(String[] args) { // 主類別方法
		printJava();
		printJava();
		printPython();
	}
	
	public static void printJava() { // 自訂類別方法 1
		System.out.println("Java 8");
		System.out.println("Java 11");
		System.out.println("Java 17");
	}
	
	public static void printPython() { // 自訂類別方法 2
		System.out.println("Python 2.6");
		System.out.println("Python 3.9");
	}

}
