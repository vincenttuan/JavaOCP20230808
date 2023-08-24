package day20;

import java.util.HashMap;
import java.util.Map;
import static java.util.Map.Entry;

public class MapDemo5 {
	/*
	 * 你和你的室友每個月都會花費在一些共同的開銷，如電費、網費、租金等。
	 * 你們決定分攤這些開銷，但是每個人可能在不同的時間支付不同的費用。
	 * 為了追踪每人所支付的總金額和每項費用的總金額，你們決定使用 Map 來記錄。
	 * */
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>() {{
			put("租金", 3000);
			put("電費", 500);
		}};
		
		Map<String, Integer> map2 = new HashMap<>() {{
			put("租金", 3000);
			put("網費", 1000);
			put("電費", 400);
		}};
		
		// 將 map1 與 map2 合併(merge)
		// 例如: {租金=6000, 網費=1000, 電費=900}
		for(Entry<String, Integer> entry : map2.entrySet()) {
			//map1.merge(entry.getKey(), entry.getValue(), (a, b) -> a + b);
			map1.merge(entry.getKey(), entry.getValue(), Integer::sum);
		}
		System.out.println(map1);

	}

}
