import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//https://www.youtube.com/watch?v=ZK20jVt7XEc
public class Sito {

	public Map<String, Integer> parole = new HashMap<String, Integer>();
	// indirizzi puliti da analizzare
	Map<String, Boolean> indirizzi = new LinkedHashMap<String, Boolean>();

	ArrayList<String> blackListIndirizzi = new ArrayList<String>();

	String url = "";

	public Sito(String url) {
//	public Sito() {
		this.url = url;
		

		indirizzi.put(url, false);
	}	
		
//		indirizzi.put("ca", false);
//		indirizzi.put("cas", true);
//		indirizzi.put("xxxx", true);
//		indirizzi.put("caba", false);
//		indirizzi.put("cabab", false);


	public void start() {

		Iterator<Entry<String, Boolean>> i = indirizzi.entrySet().iterator();

		while (i.hasNext()) {
			
			Entry e = i.next();
			String  key =   (String) e.getKey();
			boolean val =   (boolean) e.getValue();
			System.out.println(key + " " + val);
			
			// se true già analizzata
			if(val == true) continue;
			
			// Inizializzo pagina
			Pagina pagina = new Pagina(key);
			// prendo risultati pagina
			Map<String, Integer> m = pagina.getStatistiche();
			// aggiungo risultati
			m.forEach((k, v) -> parole.merge(k, v, (v1, v2) -> v1 + v2));
			// prendo link
			String[] links = pagina.getLinks();
			
			
			// da rivedere logica dialogo con pagina e blacklist
			// mmmm no! Pagina mi da tutti i links del dominio e qui controllo
			// 1 - Doppioni
			// 2 - Blacklist
			// 3 - Header			
			
			
			// verifico e aggiungo link a indirizzi
			for(String link: links) {
				// verifico doppioni
				if(indirizzi.containsKey(link))
					continue;
				// verifico se dentro blacklist
				if(blackListIndirizzi.contains(link))
					continue;
				// verifica header
				if(this.isHtml(link)) {
					// aggiungo a indirizzi
					this.indirizzi.put(link, false);
				}
			}
			
		} // end while
		
	
	} // end start
	
	private boolean isHtml(String link) {
		// qui lavoro Ferji
		boolean c=false;
		try {
			
			URL u = new URL(link);
			URLConnection uc = u.openConnection();
			uc.connect();
			
			String restituito = uc.getContentType().toString();
			if (restituito.contains("text/html"))
				c=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// se non è html inserisco dominio in blackListIndirizzi
		blackListIndirizzi.add(link);
		
		
		
		return c;
	}

}
