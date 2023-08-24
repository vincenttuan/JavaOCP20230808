package day21;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

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
		// 例如:{摩卡=2, 拿鐵=2, 美式=3}
		Map<CoffeeName, Long> result = coffees.stream()
				//.collect(groupingBy(coffee -> coffee.getName(), counting()));
				.collect(groupingBy(Coffee::getName, counting()));
		System.out.println(result);
		
		// 2. 每一種咖啡請加總小計價格
		// 例如:{拿鐵=220, 摩卡=220, 美式=250}
		Map<CoffeeName, Integer> result2 = coffees.stream()
				.collect(groupingBy(Coffee::getName, summingInt(Coffee::getPrice)));
		System.out.println(result2);
		
		// 3. 請查出每一種尺寸最貴與最便宜的咖啡
		Map<CoffeeSize, Optional<Coffee>> maxCoffee = coffees.stream()
				//.collect(groupingBy(Coffee::getSize, maxBy((c1, c2) -> c1.getPrice() - c2.getPrice())));
				.collect(groupingBy(Coffee::getSize, maxBy((c1, c2) -> c1.getPrice().compareTo(c2.getPrice()))));
		
		System.out.println(maxCoffee);
		System.out.println(maxCoffee.get(CoffeeSize.大杯));
		
		if(maxCoffee.get(CoffeeSize.大杯).isPresent()) {
			Coffee coffee = maxCoffee.get(CoffeeSize.大杯).get();
			System.out.printf("%s 最貴的是 %s $%d\n", coffee.getSize(), coffee.getName(), coffee.getPrice());
		}
	}
}





