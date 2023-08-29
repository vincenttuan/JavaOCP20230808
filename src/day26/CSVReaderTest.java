package day26;

import java.util.List;

public class CSVReaderTest {

	public static void main(String[] args) {
		CSVReader csvReader = new CSVReader();
		List<SaleRecord> records = csvReader.getSaleRecords();
		System.out.println(records.size());
		records.forEach(System.out::println);

	}

}
