package day08;

// 建構飲料物件的主方法
// 建構物件使用 new
public class DrinkTest {

	public static void main(String[] args) {
		// 建立物件
		Drink coca = new Drink();
		Drink tea = new Drink();
		// 設定物件資料(屬性)
		coca.name = "可樂";
		coca.price = 20;
		tea.name = "綠茶";
		tea.price = 10;
		// 呼叫物件方法
		coca.display();
		coca.drink();
		tea.display();
		tea.drink();
	}

}
