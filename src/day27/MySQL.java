package day27;

import java.sql.Connection;
import java.sql.DriverManager;
/*
 * ZeroDateTimeBehavior=convertToNull: 
 * 此參數定義了當 MySQL 數據返回一個 '0000-00-00' 日期值時應如何處理。MySQL 允許這樣的日期值，但是 Java 的 Date 類型不允許。
 * 設置為 ConvertToNull 時，如果遇到這個值，將會返回null而不是發送異常。
 * 
 * serverTimezone=Asia/Taipei：
 * 此參數定義了客戶端和服務器之間交互的時區。這是確保客戶端和服務器之間正確轉換的時間和日期的方法。
 * 
 * characterEncoding=utf-8：
 * 此參數指定了客戶端和服務器之間的字符編碼方式。UTF-8是一種Unicode編碼，支持多種語言字符，適用於多語言環境。
 * 
 * useUnicode=true：
 * 該參數指定是否使用Unicode字符集，這在多語言環境中非常重要。當與characterEncoding參數結合使用時，可以保證在客戶端和服務器之間正確傳輸並顯示所有的字符。
 * */
public class MySQL {
	private static Connection conn;
	
	static {
		try {
			// JDBC 3.0(含)以前需要寫
			// JDBC 4.0(含)以上不用寫 jar 包中有看到 /META-INF/services/java.sql.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost:3306/demo?zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
			String username = "root";
			String password = "12345678";
			conn = DriverManager.getConnection(dbURL, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
	
}
