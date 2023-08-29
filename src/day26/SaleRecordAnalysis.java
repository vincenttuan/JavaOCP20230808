package day26;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.summingDouble;

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
		
		// 每一個城市擁有那些分店 Map<String, Set<String>>
		Map<String, Set<String>> cityToBranches = null;
		cityToBranches = records.stream()
								.collect(groupingBy(
									SaleRecord::getCity, // 按城市分組	
									mapping(SaleRecord::getBranch, toSet())	
								));
		
		cityToBranches.forEach((k, v) -> System.out.printf("%s: %s\n", k, v));
		
		// 紅茶的總銷售金額
		double totalBlackTeaSales = records.stream()
					.filter(record -> record.getProduct().equals("紅茶")) // 過濾出紅茶的紀錄
					.mapToDouble(record -> record.getPrice() * record.getQuantity()) //將售價與數量相乘
					.sum(); // 將所有結果相加
		System.out.printf("紅茶的總銷售金額: %,.1f\n", totalBlackTeaSales);
		
		System.out.println("------------------------------------------------");
		// 印出每一種商品的總銷售金額
		Map<String, Double> productSales = records.stream()
					.collect(groupingBy(
							SaleRecord::getProduct,
							summingDouble(record -> record.getPrice() * record.getQuantity())
							));
		
		productSales.forEach((k, v) -> System.out.printf("%s 的總銷售金額: %,.1f\n", k, v));
		
	}

}
