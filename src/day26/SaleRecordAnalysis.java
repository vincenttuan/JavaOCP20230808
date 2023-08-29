package day26;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class SaleRecordAnalysis {

	public static void main(String[] args) {
		CSVReader csvReader = CSVReader.getInstance();
		List<SaleRecord> records = csvReader.getSaleRecords();
		
		// 總共有那些商品 ?
		List<String> products = records.stream()
										.map(SaleRecord::getProduct) 
										.distinct() // 去除重複
										.collect(toList());
		System.out.println(products);
		
		// 總共有哪些城市 ?
		List<String> cities = records.stream()
									.map(SaleRecord::getCity)
									.distinct()
									.collect(toList());
		System.out.println(cities);
		
		// 總共有哪些分店 ?
		List<String> branchs = records.stream()
									.map(SaleRecord::getBranch)
									.distinct()
									.collect(toList());
		System.out.println(branchs);
		
		
	}

}
