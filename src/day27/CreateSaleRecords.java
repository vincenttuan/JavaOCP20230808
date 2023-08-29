package day27;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateSaleRecords {

	public static void main(String[] args) {
		// 新增紀錄
		String sql = "insert into salerecords(date, product, price, quantity, city, branch) value(?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = MySQL.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, "2023-08-29");
			pstmt.setString(2, "珍珠奶茶");
			pstmt.setDouble(3, 45.0);
			pstmt.setInt(4, 12);
			pstmt.setString(5, "桃園");
			pstmt.setString(6, "中華門市");
			
			int rowcount = pstmt.executeUpdate(); // rowcount 異動筆數
			System.out.printf("新增筆數: %d\n", rowcount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
