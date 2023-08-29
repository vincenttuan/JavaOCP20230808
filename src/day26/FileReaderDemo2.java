package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		// 利用 Java7 所提供的 Files 來讀取檔案
		// 並利用 Path(非阻塞IO) 來指向指定檔案
		// 非阻塞IO:數據在資料沒有完全就緒的情況下仍然被處理。
		// 1. 文件路徑
		String filePath = "src/day26/sales_data.csv";
		
		// 2. 利用 Path 指定檔案
		Path path = Paths.get(filePath);
		
		// 3. 利用 Files 一次讀取所有行
		List<String> lines = Files.readAllLines(path);
		
		lines.forEach(System.out::println);
	}
}
