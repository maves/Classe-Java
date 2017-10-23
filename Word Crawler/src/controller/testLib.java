package controller;
import java.io.IOException;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class testLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = null;
		try {
			doc = Jsoup.connect("http://www.pmichaud.com/wiki/Main/SearchWiki").get();
			System.out.println(doc.toString());
		} catch (HttpStatusException e) {
			// TODO Auto-generated catch block
			System.out.println("HttpStatusException");
//			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ciao");
		Elements links = null;
		try{
			links = doc.select("a[href]");
		}catch(NullPointerException e) {
			System.out.println("Bug Jsoup");
		}
	}

}
