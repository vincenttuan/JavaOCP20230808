package day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class MyFile implements AutoCloseable {

	@Override
	public void close() throws IOException {
		System.out.println("MyFile close...");
	}
	
}

public class FileReaderDemo1 {

	public static void main(String[] args) {
		// 透過傳統 File <- FileReader <- BufferedReader 來讀取 sales_data.csv
		// 1. 文件路徑
		String filePath = "src/day26/sales_data.csv";
		
		// 2. 使用 File 來指向檔案位置
		File file = new File(filePath);
		
		// 3. 判斷所指路徑的檔案是否存在
		if(!file.exists()) {
			System.out.printf("%s 檔案不存在\n", filePath);
			return;
		}
		
		try(FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			MyFile m = new MyFile();) {
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
