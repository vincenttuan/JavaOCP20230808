package day27;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import day26.CSVReader;
import day26.SaleRecord;

public class BatchCreateSaleRecords {

	public static void main(String[] args) {
		// 多筆/批次新增
		// 將 day26/sales_data.csv 資料匯入到 mysql 的 salerecords 資料表中
		List<SaleRecord> records = CSVReader.getInstance().getSaleRecords();
		System.out.printf("本次預備匯入筆數: %d\n", records.size());
		
		String sql = "insert into salerecords(date, product, price, quantity, city, branch) value(?, ?, ?, ?, ?, ?)";
		
		try(Connection conn = MySQL.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.clearBatch(); // 很重要
			
			for(SaleRecord record : records) {
				
				pstmt.setString(1, record.getDate());
				pstmt.setString(2, record.getProduct());
				pstmt.setDouble(3, record.getPrice());
				pstmt.setInt(4, record.getQuantity());
				pstmt.setString(5, record.getCity());
				pstmt.setString(6, record.getBranch());
				
				pstmt.addBatch(); // 加入到批次柱列中
			}
			
			// 執行批次處理
			int[] rowcounts = pstmt.executeBatch();
			// 計算異動筆數的總和
			int totalCount = Arrays.stream(rowcounts).sum();
			System.out.printf("本次成功匯入筆數: %d\n", totalCount);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
