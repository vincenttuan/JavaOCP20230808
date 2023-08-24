package day21;

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
		

	}

}
