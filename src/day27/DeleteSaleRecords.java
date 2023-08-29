package day27;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteSaleRecords {
	public static void main(String[] args) {
		// 刪除資料
		// 範例: 根據 id 來刪除
		String sql = "delete from salerecords where id=?";
		
		try(Connection conn = MySQL.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, 3);
			
			int rowcount = pstmt.executeUpdate();
			System.out.printf("刪除筆數: %d\n", rowcount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
