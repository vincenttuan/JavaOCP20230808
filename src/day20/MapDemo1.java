package day20;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static java.util.Map.Entry;

import java.util.Collection;

public class MapDemo1 {

	public static void main(String[] args) {
		// Map 是屬於鍵(key)值(value)對(pairs)(key-value pairs)的集合
		// put() 放資料, get() 取資料, size() 集合元素數量
		// keySet() 取得所有的鍵, values() 取得所有的值
		// 鍵與值的組合稱為 - Entry
		// 很多鍵與值的組合稱為 - EntrySet
		// 10 個基本練習
		// 1. 建立一個空的 HashMap
		//Map<String, Integer> map = new HashMap<>(); // HashMap 無序
		//Map<String, Integer> map = new LinkedHashMap<>(); // LinkedHashMap 有序
		Map<String, Integer> map = new TreeMap<>(); // TreeMap 按照 key 由小到大排序
		System.out.println(map);
		// 2. 向 HashMap 添加鍵值對
		map.put("John", 25);
		map.put("John", 29); // 若 key 相同則之前的元素會被取代
		map.put("Mary", 30);
		map.put("Jack", 28);
		map.put("Rose", 26);
		System.out.println(map);
		// 3. 查詢 john(鍵) 的年齡(值)
		Integer age = map.get("John");
		System.out.println(age);
		// 4. 檢查某個鍵是否存在於 Map 中
		boolean exists = map.containsKey("John");
		System.out.println(exists);
		// 5. 檢查某個值是否存在於 Map 中
		exists = map.containsValue(30);
		System.out.println(exists);
		// 6. 移除一個鍵值對
		map.remove("Mary"); // 放入 key
		System.out.println(map);
		// 7. 遍歷 Map 並印出所有的鍵和值
		for(Entry<String, Integer> entry  : map.entrySet()) {
			System.out.printf("鍵: %s 值: %d\n", entry.getKey(), entry.getValue());
		}
		// 8. 取得所有鍵 keys
		Set<String> keys = map.keySet();
		System.out.println(keys);
		// 9. 取得所有值 values
		Collection<Integer> values = map.values();
		System.out.println(values);
		// 10. 清空 map
		map.clear();
		// 檢查是否是空的
		boolean isEmpty = map.isEmpty();
		System.out.println(isEmpty);
		System.out.println(map);
	}

}












