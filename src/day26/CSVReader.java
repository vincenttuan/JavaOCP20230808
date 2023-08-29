package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// CSVReader 設計為單例模式(SingleTon)
public class CSVReader {
	// -- 單利模式下要寫的程序與方法 -----------------------------------
	private static CSVReader _instance = new CSVReader();
	
	public static CSVReader getInstance() {
		return _instance;
	}
	
	private CSVReader() {
		
	}
	// -----------------------------------------------------------
	
	// CopyOnWriteArrayList 可以支援多執行緒(操作上不需要鎖,所以效率高)
	private List<SaleRecord> records = new CopyOnWriteArrayList<>();
	private String filePath = "src/day26/sales_data.csv";
	private Path path = Paths.get(filePath);
	
	public List<SaleRecord> getSaleRecords() {
		if(records.size() == 0) {
			readSaleRecordFromFile();
		}
		return records;
	}
	
	public void writeSaleRecord(SaleRecord saleRecord) {
		writeSaleRecordToFile(saleRecord);
	}
	
	// 寫入檔案內容
	private void writeSaleRecordToFile(SaleRecord saleRecord) {
		try {
			// 將 SaleRecord 物件轉成 CSV 格式
			String line = "%s,%s,%s,%s,%s,%s";
			line = String.format(line, 
					saleRecord.getDate(),
					saleRecord.getProduct(),
					saleRecord.getPrice(),
					saleRecord.getQuantity(),
					saleRecord.getCity(),
					saleRecord.getBranch());
			
			// 將 line 字串放到寫入文件的末尾
			Files.write(path, (line + "\n").getBytes("utf-8"), StandardOpenOption.APPEND);
			// 加入成功之後也順便將 records 新增
			records.add(saleRecord);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 讀取檔案內容
	private void readSaleRecordFromFile() {
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
