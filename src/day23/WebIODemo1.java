package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class WebIODemo1 {
	static {
        // 忽略 SSL 憑證驗證
        TrustManager[] trustAllCertificates = new TrustManager[]{
            new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
        };

        try {
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCertificates, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void main(String[] args) {
		// 1. 建立 http 網路連線位置(網址)
		String date = "20230824";
		String urlString = "https://www.twse.com.tw/exchangeReport/BWIBBU_d?response=csv&date=" + date + "&selectType=ALL";
		try {
			// 2. 建立 URL 物件
			URL url = new URL(urlString);
			// 3. 建立 URL 連線
			URLConnection conn = url.openConnection();
			// 4. 利用 BufferedReader 讀取網路串流資料
			try(InputStreamReader isr = new InputStreamReader(conn.getInputStream(), Charset.forName("Big5"));	
				BufferedReader reader = new BufferedReader(isr);) {
				
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
