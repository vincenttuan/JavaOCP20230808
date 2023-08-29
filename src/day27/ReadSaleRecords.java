package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 從 MySQL 資料庫(demo)中讀取資料表(salerecords)中的資訊 
public class ReadSaleRecords {
	public static void main(String[] args) throws ClassNotFoundException {
		// 1. 驅動程式註冊-使用 Class.forName()
		// JDBC 3.0(含)以前需要寫
		// JDBC 4.0(含)以上不用寫 jar 包中有看到 /META-INF/services/java.sql.Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/demo?zeroDateTimeBehavior=convertToNull&serverTimezone=Asia/Taipei&characterEncoding=utf-8&useUnicode=true";
		String username = "root";
		String password = "12345678";
		
		// 2. 建立連線
		String sql = "select id, date, product, price, quantity, city, branch from salerecords";
		try(Connection conn = DriverManager.getConnection(dbURL, username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			System.out.println(conn.isClosed()?"連線已關閉":"連線成功");
			
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String date = rs.getString("date");
				String product = rs.getString("product");
				Double price = rs.getDouble("price");
				Integer quantity = rs.getInt("quantity");
				String city = rs.getString("city");
				String branch = rs.getString("branch");
				
				System.out.printf("%s %s %s %s %s %s %s\n", id, date, product, price, quantity, city, branch);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
