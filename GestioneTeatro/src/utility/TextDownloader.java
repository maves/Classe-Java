package utility;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class TextDownloader {

	private static TextDownloader istance;

	protected TextDownloader() {

	}

	public static TextDownloader getIstance() {
		if (istance == null)
			istance = new TextDownloader();

		return istance;
	}

	public static String get(String url) {

		StringBuffer sb = new StringBuffer();;
		
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();

			HttpGet get = new HttpGet(url);
			HttpResponse response = httpclient.execute(get);
			InputStream is = response.getEntity().getContent();

			BufferedReader r = new BufferedReader(new InputStreamReader(is));
			String s = null;
			

			while ((s = r.readLine()) != null) {
				sb.append(s);
			}
		} catch (Exception e) {
			System.out.println("Errore: " + e.getMessage());
		}

		return sb.toString();
	}

}
