package day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class MapStreamCoffee2 {

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
		// 根據價格來進行排序
		List<Coffee> sortedCoffees = coffees.stream()
				//.sorted(Comparator.comparingInt(Coffee::getPrice))
				.sorted(Comparator.comparingInt(Coffee::getPrice).reversed())
				.collect(toList());
		System.out.println(sortedCoffees);

	}

}
