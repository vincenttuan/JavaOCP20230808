package day15;

public class Foo {
	public Foo() {
		System.out.println("Foo");
	}
	
	public Foo(int x) {
		
		System.out.println("Foo: " + x);
	}
	
	{
		System.out.println("Welcome");
	}
	
	//--------------------------------------
	public static void main(String[] args) {
		new Foo();
		new Foo(10);
	}
}
