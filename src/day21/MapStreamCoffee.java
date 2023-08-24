package day21;

import java.util.Arrays;
import java.util.List;

public class MapStreamCoffee {
	public static void main(String[] args) {
		List<Coffee> coffees = Arrays.asList(
				new Coffee(CoffeeName.拿鐵, CoffeeSize.大杯, 120),
				new Coffee(CoffeeName.拿鐵, CoffeeSize.中杯, 100),
				new Coffee(CoffeeName.摩卡, CoffeeSize.大杯, 130),
				new Coffee(CoffeeName.摩卡, CoffeeSize.小杯, 90),
				new Coffee(CoffeeName.美式, CoffeeSize.中杯, 80),
				new Coffee(CoffeeName.美式, CoffeeSize.大杯, 100),
				new Coffee(CoffeeName.美式, CoffeeSize.小杯, 70)
		);
		System.out.println(coffees);
		
		// 1. 每一種咖啡各有幾杯
		
	}
}
