package day04;

import java.util.Arrays;

public class StringArray1 {
	public static void main(String[] args) {
		String[] names = {"Vincent", "Anita", "Helen", "Jack", "Jo", "Rose", "Bob"};
		// 直接印出陣列內容 Arrays.toString(names)
		System.out.println(Arrays.toString(names));
		// 請印出每一個名字的長度
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i].length());
		}
		
		for(String x : names) {
			System.out.println(x.length());
		}
	}
}
