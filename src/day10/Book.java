package day10;

// Book 物件設計圖
public class Book {
	private String name; // 書名
	private String author; // 作者
	private int kind; // 類型:1-文學類, 2-技術類, 3-小說類
	private int price; // 定價
	// 售價邏輯 
	// 書籍類型:1-文學類 price * 0.7
	// 書籍類型:2-技術類 price * 0.9
	// 書籍類型:3-小說類 price * 1
	private double salePrice; // 售價 
	private int amount = 1; // 數量
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getKind() {
		return kind;
	}
	public void setKind(int kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getSalePrice() {
		return salePrice;
	}
	
	// 自訂設定售價邏輯
	public void setSalePrice() {
		switch (kind) {
			case 1:
				salePrice = price * 0.7;
				break;
			case 2:
				salePrice = price * 0.9;
				break;
			case 3:
				salePrice = price;
				break;
		}
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
