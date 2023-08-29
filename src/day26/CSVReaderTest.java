package day26;

import java.util.List;

public class CSVReaderTest {

	public static void main(String[] args) {
		CSVReader csvReader = CSVReader.getInstance();
		
		// 資料讀取
		List<SaleRecord> records = csvReader.getSaleRecords();
		System.out.println(records.size());
		//records.forEach(System.out::println);
		
		SaleRecord saleRecord = new SaleRecord();
		saleRecord.setDate("2023-08-29");
		saleRecord.setProduct("綠茶");
		saleRecord.setPrice(32.0);
		saleRecord.setQuantity(28);
		saleRecord.setCity("台北");
		saleRecord.setBranch("信義分店");
		// 資料寫入
		csvReader.writeSaleRecord(saleRecord);
		
		System.out.println(records.size());
	}

}
