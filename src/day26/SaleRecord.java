package day26;

public class SaleRecord {
	// 日期,產品,價格,數量,城市,分店
	private String date;      // 日期
	private String product;   // 產品
	private Double price;     // 價格
	private Integer quantity; // 數量
	private String city;      // 城市
	private String branch;    // 分店
	
	public SaleRecord() {
		
	}

	public SaleRecord(String date, String product, Double price, Integer quantity, String city, String branch) {
		this.date = date;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.city = city;
		this.branch = branch;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "SaleRecord [date=" + date + ", product=" + product + ", price=" + price + ", quantity=" + quantity
				+ ", city=" + city + ", branch=" + branch + "]";
	}
	
	
	
}
