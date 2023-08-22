package day19;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		// 新增元素
		v.add(100); // index = 0
		v.add(200); // index = 1
		v.add(300); // index = 2
		System.out.println(v);
		// 修改元素
		v.set(1, 500);
		System.out.println(v);
		// 刪除元素
		v.remove(1); // 刪除 index = 1 的元素
		System.out.println(v);
		// 刪除元素
		v.remove(Integer.valueOf(300)); // 刪除內容是 Integer(300) 的元素
		System.out.println(v);
		
		
	}
}
