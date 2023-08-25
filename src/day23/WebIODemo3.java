package day23;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;

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
			// 5. 印出回應結果
			System.out.println(response.body());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
