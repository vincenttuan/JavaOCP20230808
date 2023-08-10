package day04;

public class StringArray3 {
	public static void main(String[] args) {
		// apple 買了 10 個
		// banana 買了 20 個
		// orange 買了 30 個
		// apple 買了 40 個
		String[] fruits  = {"apple", "banana", "orange", "apple"};
		int[]    amounts = {10, 20, 30, 40};
		
		// 問總共買了幾個 apple ?
		int appleAmount = 0; // 蘋果累加的數量
		for(int i=0;i<fruits.length;i++) {
			
			if(fruits[i].equals("apple")) {
				appleAmount += amounts[i];
			}
			
		}
		
		System.out.println(appleAmount);
	}
}
