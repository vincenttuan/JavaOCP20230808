package day23;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;

public class WebIODemo3 {
	// 利用 Java 11 提供的網路 API 套件 HttpClient 與 HttpRequest 來訪問指定 URL
	// 市售米抽檢不合格 (編碼 UTF-8)
	public static void main(String[] args) {
		// 1. 建立 http 網路連線位置(網址)
		String urlString = "https://data.moa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
		
		// 2. 建立 HttpClient
		HttpClient client = HttpClient.newHttpClient();
		
		// 3. 建立 HttpRequest Get 請求
		HttpRequest request = HttpRequest.newBuilder()
							.uri(URI.create(urlString))
							.GET() // This is default
							.build();
		
		// 4. 執行請求(request)並接收回應(response)
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(Charset.forName("UTF-8")));
			// 5. 回應結果: 得到 json String
			String jsonString = response.body();
			//System.out.println(jsonString);
			
			// 6. 利用 Gson 將 json 陣列字串轉 BadRice[]
			Gson gson = new Gson();
			BadRice[] badRices = gson.fromJson(jsonString, BadRice[].class);
			System.out.printf("資料筆數: %d\n", badRices.length);
			
			// 7. 進行分析
			//String keyword = "冠軍";
			String keywords[] = {"冠軍", "日本", "池上", "台東" , "壽司"};
			Arrays.stream(badRices)
				  //.filter(badRice -> badRice.get品名().contains(keyword))
				  .filter(badRice -> Arrays.stream(keywords).anyMatch(kw -> badRice.get品名().contains(kw)))
				  .forEach(badRice -> {
					  // 換行符號: \n 或 \r\n
					  System.out.printf("品名: %s 不合格原因: %s\n", badRice.get品名(), badRice.get不合格原因().replaceAll("\n", ""));
				  });
			
			// 8. "冠軍", "日本", "池上", "台東" , "壽司" 各有幾筆不合格 I
			Map<String, Long> keywordCounts = Arrays.stream(badRices)
					.flatMap(badRice -> Arrays.stream(keywords)
											  .filter(kw -> badRice.get品名().contains(kw))
											  .map(kw -> new AbstractMap.SimpleEntry<>(kw, badRice)))
					.collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.counting()));
			
			System.out.println(keywordCounts);
			
			// 9. "冠軍", "日本", "池上", "台東" , "壽司" 各有幾筆不合格 II
			keywordCounts = new HashMap<>();
			for (String keyword : keywords) {
			    long count = Arrays.stream(badRices)
			                       .filter(badRice -> badRice.get品名().contains(keyword))
			                       .count();
			    keywordCounts.put(keyword, count);
			}
			System.out.println(keywordCounts);
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
