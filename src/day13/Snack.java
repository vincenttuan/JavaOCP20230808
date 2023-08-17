package day13;

// 介面-Snack(小吃)
// 抽象類-FriedChicken(鹽酥雞)
// 具體類-OriginalChicken(原味) $50
// 具體類-SpicyChicken(辣味風味) $55
// 具體類-CheeseChicken(起司風味) $60
public interface Snack { // 小吃
	void flavor(); // 風味
	int getPrice(); // 取得價格
}
