package day27;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateSaleRecords {
	public static void main(String[] args) {
		// 修改資料
		// 範例: 根據 id 來修改價格與數量
		String sql = "update salerecords set price=?, quantity=? where id=?";
		
		try(Connection conn = MySQL.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setDouble(1, 99);
			pstmt.setInt(2, 18);
			pstmt.setInt(3, 2);
			
			int rowcount = pstmt.executeUpdate();
			System.out.printf("修改筆數: %d\n", rowcount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
