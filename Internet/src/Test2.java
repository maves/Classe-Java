import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
//import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Test2 {

	public static void main(String[] args) {
		
		StringBuffer sb;
		
		try {

			CloseableHttpClient httpclient = HttpClients.createDefault();
			// HttpClient request = new DefaultHttpClient();
//			HttpGet get = new HttpGet("http://www.emit.polimi.it");
			HttpGet get = new HttpGet("http://www.armoniaolistica.it");
			HttpResponse response = httpclient.execute(get);
			InputStream is = response.getEntity().getContent();

			BufferedReader r = new BufferedReader(new InputStreamReader(is));
			String s = null;
			sb = new StringBuffer();

			while ((s = r.readLine()) != null) {

				sb.append(s);
			}
			
//			System.out.println(sb);

		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
//		System.out.println("Sono Test2.java");
//		System.out.println("Sono Test2.java");
//		System.out.println("Sono Test2.java");
//		System.out.println("Sono Test2.java");

	}
}
