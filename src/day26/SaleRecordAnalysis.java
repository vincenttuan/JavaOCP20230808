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
	}

}
