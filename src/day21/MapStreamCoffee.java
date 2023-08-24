package day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

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
		// 例如：{摩卡=2, 拿鐵=2, 美式=3}
		Map<CoffeeName, Long> result = coffees.stream()
				//.collect(groupingBy(coffee -> coffee.getName(), counting()));
				.collect(groupingBy(Coffee::getName, counting()));
		System.out.println(result);
		
		// 2. 每一種咖啡請加總小計價格
		
		
	}
}
