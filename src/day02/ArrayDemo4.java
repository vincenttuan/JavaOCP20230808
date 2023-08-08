package day02;

/*
 * 某公司有18位員工，
 * 其中10位在去年投資股票，一年的獲利率如下(單位：%)：
 * 7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
 * 另外8位員工投資買公債一年內獲利率如下(單位：%)
 * 6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
 * 試分別求此公司的
 * 1.員工投資股票與公債的平均獲利率 ?
 * 2.員工投資股票與公債的獲利率變異係數 ?
 * 3.請問哪一種投資(股票或公債)的獲利較集中 ?
 * */
public class ArrayDemo4 {

	public static void main(String[] args) {
		double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double[] bonds  = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};

        double avgStocks = average(stocks);
        double avgBonds = average(bonds);
        System.out.printf("股票平均獲利率: %.1f%%\n", avgStocks);
        System.out.printf("債券平均獲利率: %.1f%%\n", avgBonds);
	}
	
	public static double average(double[] array) {
		double sum = 0, avg = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		return avg;
	}
	
}
