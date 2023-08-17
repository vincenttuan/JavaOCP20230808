package day12;

// 介面就是一種完全的抽象類
public interface Pet {
	// final 變數一定要給初始值
	String companyName = "Hello寵物園"; // 一定會加上 public static final 修飾字
	void eat(); // 一定會加上 public abstract 修飾字
	void skill(); // 一定會加上 public abstract 修飾字
}
