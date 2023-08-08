package day01;

import static day01.Hello5.calcAndPrint;

public class Hello6 {

	public static void main(String[] args) {
		// 想要計算 +,-,*,/
		// 借用 Hello5 已經寫好的方法, 如下所示: 
		// public static void calcAndPrint(int x, int y, char operate)
		// 來用
		
		Hello5.calcAndPrint(10, 20, '+');
		
		calcAndPrint(10, 20, '+');
		
	}

}
