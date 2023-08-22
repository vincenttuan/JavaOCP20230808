package day19;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		// Vector 的 size() 與 capacity()
		// 建構子
		// Vector(int initialCapacity, int capacityIncrement)
		Vector<Integer> v = new Vector<>(100, 5);
		System.out.println(v);
		System.out.printf("capacity = %d\n", v.capacity()); // 所有的預備空間
		System.out.printf("size = %d\n", v.size()); // 實際上已用的空間
		
		for(int i=1;i<=100;i++) {
			v.add(new Random().nextInt(100));
		}
		v.add(101);
		
		System.out.println(v);
		System.out.printf("capacity = %d\n", v.capacity()); // 所有的預備空間
		System.out.printf("size = %d\n", v.size()); // 實際上已用的空間
		
		// List 排序
		Collections.sort(v); // 排序
		System.out.println("排序後");
		System.out.println(v);
	}

}
