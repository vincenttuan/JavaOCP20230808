package day15;

public class InnerClassDemo {

	public static void main(String[] args) {
		// 1. 建立 Outer 物件
		Outer outer = new Outer();
		// 2. 透過 outer 建立 Inner 物件
		Outer.Inner inner = outer.new Inner();
		// 3. 使用 inner 所提供的資源
		inner.callMe();
		
		// 簡便寫法
		new Outer().new Inner().callMe();
		
		outer.foo(); // 調用 foo() 方法
		
		// 調用靜態內部類類別
		Outer.SInner sinner = new Outer.SInner();
		sinner.callMe();
	}

}
