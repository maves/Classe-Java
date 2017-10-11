import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class testLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
			System.out.println(doc.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
