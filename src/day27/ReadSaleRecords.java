package day27;

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
		
		
		
	}
}
