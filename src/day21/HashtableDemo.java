package day21;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		// Thread-safe 的 Map
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("John", 100);
		ht.put("Mary", 80);
		ht.put("Jack", 50);
		ht.put("Rose", 90);
		System.out.println(ht);
		
		// Hashtable 有自己的走訪器(此走訪器無移除元素功能)
		Enumeration<Integer> e = ht.elements();
		while (e.hasMoreElements()) {
			Integer score = e.nextElement();
			System.out.println(score);
		}
	}

}
