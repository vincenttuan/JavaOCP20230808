package day20;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.Entry;

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
	}

}
