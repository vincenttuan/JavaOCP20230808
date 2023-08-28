package day25;

@FunctionalInterface
public interface MyFuncInterface {
	
	boolean equals(Object obj); // Object 的方法
	String toString(); // Object 的方法
	void foo();
	
	// Java 8 提供 default 方法來做為介面實作
	default void copyright() {
		System.out.println("copyright ..." + getVersion());
	}
	
	// Java 11 提供了可以給 default 方法用的 private 方法
	private double getVersion() {
		return 2.0;
	}
	
	// Java 8 開始提供
	static void print() {
		System.out.println("print");
	}
	
	// 內部 interface
	interface MyInner {
		void bar();
	}
}
