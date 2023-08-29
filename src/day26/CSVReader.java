package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CSVReader {
	// CopyOnWriteArrayList 可以支援多執行緒(操作上不需要鎖,所以效率高)
	private List<SaleRecord> records = new CopyOnWriteArrayList<>();
	
	public List<SaleRecord> getSaleRecords() {
		if(records.size() == 0) {
			readSaleRecordFromFile();
		}
		return records;
	}
	
	// 讀取檔案內容
	private void readSaleRecordFromFile() {
		String filePath = "sales_data.csv";
		Path path = Paths.get(filePath);
		try {
			List<String> lines = Files.readAllLines(path);
			// 利用 for 將資料逐筆寫入到 SalesRecord 中
			for(int i=1;i<lines.size();i++) {
				// 2023-01-01,紅茶,30,50,台北,信義分店
				String[] array = lines.get(i).split(",");
				SaleRecord saleRecord = new SaleRecord();
				saleRecord.setDate(array[0]);
				saleRecord.setProduct(array[1]);
				saleRecord.setPrice(Double.parseDouble(array[2]));
				saleRecord.setQuantity(Integer.parseInt(array[3]));
				saleRecord.setCity(array[4]);
				saleRecord.setBranch(array[5]);
				// 注入到 records 集合中
				records.add(saleRecord);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
