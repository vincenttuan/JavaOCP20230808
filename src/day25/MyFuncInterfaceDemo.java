package day25;

public class MyFuncInterfaceDemo {

	public static void main(String[] args) {
		// 實現 foo()
		MyFuncInterface myFuncInterface = new MyFuncInterface() {
			@Override
			public void foo() {
				System.out.println("foo()...");
			}
		};
		myFuncInterface.foo();
		
		// 實現 bar()
		MyFuncInterface.MyInner myInner = new MyFuncInterface.MyInner() {
			@Override
			public void bar() {
				System.out.println("bar()...");
			}
		};
		myInner.bar();

	}

}
