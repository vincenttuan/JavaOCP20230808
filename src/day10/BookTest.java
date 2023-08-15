package day10;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		book.setName("Java程式設計");
		book.setAuthor("Helen");
		book.setKind(2); // 2:技術類
		book.setPrice(100);
		book.setSalePrice(); // 設定售價
		book.setAmount(2);
		
		System.out.printf("書名: %s\n", book.getName());
		System.out.printf("作者: %s\n", book.getAuthor());
		System.out.printf("類型: %d\n", book.getKind());
		System.out.printf("定價: %d\n", book.getPrice());
		System.out.printf("售價: %.1f\n", book.getSalePrice());
		System.out.printf("數量: %d\n", book.getAmount());
		
	}

}
