package day04;

public class StringArray2 {
	public static void main(String[] args) {
		String[] names = {"Vincent", "Anita", "Helen", "Jack", "Jo", "Rose", "Bob"};
		// 請問平均有幾個字 ? 最長與最短的名字各為何 ?
		int sum = 0; // 總共有幾個字
		String longestName = names[0];  // 假設最長的名字是第一個人名
		String shortestName = names[0]; // 假設最短的名字是第一個人名
		
		for(int i=0;i<names.length;i++) {
			// 累加所有名字的長度
			sum += names[i].length();
			
			// 比較 names[i] 的長度是否 > longestName 的長度
			if(names[i].length() > longestName.length()) {
				longestName = names[i];
			}
			
			// 比較 names[i] 的長度是否 < shortestName 的長度
			if(names[i].length() < shortestName.length()) {
				shortestName = names[i];
			}
			
		}
		
		System.out.printf("平均字數: %.1f\n", (double)sum / names.length);
		System.out.printf("最長的名字: %s\n", longestName);
		System.out.printf("最短的名字: %s\n", shortestName);
		
	}
}
