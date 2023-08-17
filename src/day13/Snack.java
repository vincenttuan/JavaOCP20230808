package day13;

// 介面-Snack(小吃)
// 抽象類-FriedChicken(鹽酥雞)
// 具體類-OriginalChicken(原味) $50
// 具體類-SpicyChicken(辣味風味) $55
// 具體類-CheeseChicken(起司風味) $60

// 抽象類-Tofu(豆腐) 預設價格 $40
// 具體類-FiredTofu(炸豆腐) $ 預設價格 + 10
// 具體類-PageTofu(百頁豆腐) $ 預設價格 + 15

public interface Snack { // 小吃
	void flavor(); // 風味
	int getPrice(); // 取得價格
}
