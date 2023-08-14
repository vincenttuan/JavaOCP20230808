package day08;

//建構飲料物件的主方法
//建構物件使用 new
public class DrinkTest2 {

	public static void main(String[] args) {
		Drink coca = new Drink();
		coca.name = "可樂";
		coca.price = 20;
		
		Drink tea = new Drink("綠茶", 10);
		
		
	}

}
