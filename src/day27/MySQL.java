package day27;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQL {
	private static Connection conn;
	
	static {
		try {
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
