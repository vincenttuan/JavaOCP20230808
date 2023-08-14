package day08;

public class CakeTest {

	public static void main(String[] args) {
		Cake chocolate = new Cake();
		chocolate.setName("巧克力蛋糕");
		chocolate.setPrice(50);
		chocolate.setSweetness(70.5);
		chocolate.display();
		
		Cake cheese = new Cake("起司蛋糕", 70, 90.5);
		cheese.display();
	}

}
