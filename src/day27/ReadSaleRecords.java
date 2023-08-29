package day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 從 MySQL 資料庫(demo)中讀取資料表(salerecords)中的資訊 
public class ReadSaleRecords {
	public static void main(String[] args) throws ClassNotFoundException {
		// 建立連線
		String sql = "select id, date, product, price, quantity, city, branch from salerecords";
		try(Connection conn = MySQL.getConnection();
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
