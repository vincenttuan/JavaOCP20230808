package day20;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
	public static void main(String[] args) {
		// 每一個員工與薪資的關係
		// {John=50000, Mary=60000, Steve=55000, Anna=57000}
		// 每一個員工與薪資上調比例的關係
		// {John=0.10, Mary=0.07, Steve=0.04, Anna=0.06}
		// 請利用 Map 計算每一個員工調整後的薪資
		// 調整後的薪資要放在一個 Map 集合中
		
		// 1.員工名稱和他們的基本薪資
        Map<String, Integer> salaries = new HashMap<>() {{
            put("John", 50000);
            put("Mary", 60000);
            put("Steve", 55000);
            put("Anna", 57000);
        }};
        
        // 2.每位員工的薪資調整比例
		Map<String, Double> raises = new HashMap<>();
		raises.put("John", 0.10);
		raises.put("Mary", 0.07);
		raises.put("Steve", 0.04);
		raises.put("Anna", 0.06);
		
		// 3. 計算並存放調整後的薪資
		Map<String, Integer> result = new HashMap<>();
		for(String employeeName : salaries.keySet()) {
			int salary = salaries.get(employeeName);
			double raise = raises.get(employeeName);
			int adjectedSalary = (int)(salary * (1+raise));
			// 將調正後的薪資放入新集合中
			result.put(employeeName, adjectedSalary);
		}
		
		System.out.println(result);
        
	}
}
