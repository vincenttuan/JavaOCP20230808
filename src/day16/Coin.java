package day16;

public class Coin {

	public static void main(String[] args) {
		USCurrency penny = new USCurrency(1);
		System.out.println(penny.getValue());
		
		USCurrency nickle = new USCurrency(5);
		System.out.println(nickle.getValue());
		
	}

}
