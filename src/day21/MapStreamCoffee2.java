package day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toCollection;

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
		
		// 根據size來分組, 每一組內的咖啡透過 price 來排序
		Map<CoffeeSize, TreeSet<Coffee>> sortedCoffees2 = coffees.stream()
				.collect(groupingBy(Coffee::getSize, 
									toCollection(() -> new TreeSet<>(comparingInt(Coffee::getPrice).reversed()))));
		System.out.println(sortedCoffees2);

	}

}
