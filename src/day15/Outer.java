package day15;

public class Outer {
	int x = 7;
	
	public class Inner {
		int x = 77;
		
		public void callMe() {
			int x = 777;
					
			System.out.println("Hello Inner...");
			System.out.println(x); // 777
			System.out.println(this.x); // 77
			System.out.println(Outer.this.x); // 7
		}
		
	}
	
	public void foo() {
		
		class Bar { // 方法內部類別
			void print() {
				System.out.println("Hello Bar...");
			}
		}
		
		Bar bar = new Bar();
		bar.print();
	}
	
}
