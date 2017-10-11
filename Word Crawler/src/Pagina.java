import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Pagina {
	
	private String url = "";
	private String contenuto = "";
	Document doc;
	
	public Pagina(String url) {
		
		this.url = url;

		try {
			this.doc = Jsoup.connect(url).get();
//			this.contenuto = doc.toString();
			this.contenuto = this.pulisci(doc.text());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Map<String, Integer> getStatistiche() {
		
		String[] arr = this.contenuto.split(" ");

		Map<String, Integer> res = new HashMap<String, Integer>();
		
		for(String s: arr) {
			Integer occorrenze = res.get(s);
			res.put(s, (occorrenze == null) ? 1 : ++occorrenze );
		}		
		
		return res;		
	}
	
	public String[] getLinks() {
		
		Elements links = doc.select("a[href]");
		
		ArrayList<String> res = new ArrayList<String>();
		
		for (Element link : links) {

//			System.out.println(link.attr("abs:href"));
			String l = this.pulisciLink( link.attr("abs:href") );
			
			if( l!= null)
				res.add(l);	
        }
		
		String[] out = new String[res.size()];
		return out;
		
	}
	
	private String pulisciLink(String s) {
		return s;
	}
	
	private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;
    }
    
	
	private String pulisci(String s) {
		return s;
	}

	public String getUrl() {
		return url;
	}

	public String getContenuto() {
		return contenuto;
	}
	
	public String toString() {
		return getContenuto();
	}
	
}
