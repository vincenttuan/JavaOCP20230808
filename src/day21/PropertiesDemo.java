package day21;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		// Properties 主要用在參數設置使用
		Properties prop = new Properties();
		prop.setProperty("username", "root");
		prop.setProperty("password", "12345678");
		prop.setProperty("dburl", "jdbc:mysql://localhost:3306/web");
		
		for(String key : prop.stringPropertyNames()) {
			System.out.printf("key=%s value=%s\n", key, prop.getProperty(key));
		}
		
		Properties dbProp = new Properties();
		// Properties 取得 config.properties 檔案內容
		try(FileInputStream in = new FileInputStream("src/day21/config.properties")) {
			// 資料載入
			dbProp.load(in);
			
			String username = dbProp.getProperty("db.username");
			String password = dbProp.getProperty("db.password");
			String url = dbProp.getProperty("db.url");
			System.out.println(username);
			System.out.println(password);
			System.out.println(url);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
