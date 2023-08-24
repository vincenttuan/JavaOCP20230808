package day20;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		// Map 是屬於鍵(key)值(value)對(pairs)(key-value pairs)的集合
		// put() 放資料, get() 取資料, size() 集合元素數量
		// keySet() 取得所有的鍵, values() 取得所有的值
		// 鍵與值的組合稱為 - Entry
		// 很多鍵與值的組合稱為 - EntrySet
		// 10 個基本練習
		// 1. 建立一個空的 HashMap
		Map<String, Integer> map = new HashMap<>();
		System.out.println(map);
		// 2. 向 HashMap 添加鍵值對
		map.put("John", 25);
		map.put("Mary", 30);
		System.out.println(map);
		// 3. 查詢 john(鍵) 的年齡(值)
		Integer age = map.get("John");
		System.out.println(age);
	}

}
