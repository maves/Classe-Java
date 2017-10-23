package controller;
import model.GestoreDB;
import model.Url;
import model.Domini;
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
public class Ricercatore {

	public Map<String, Integer> parole = new HashMap<String, Integer>();
	// indirizzi puliti da analizzare
	Map<String, Boolean> indirizzi = new LinkedHashMap<String, Boolean>();

	ArrayList<String> blackListIndirizzi = new ArrayList<String>();

	String url = "";
//	String dominio = "";
	GestoreDB gestoreDb;
	Domini d;
	
	public Ricercatore(String url) {
		// public Sito() {
		
		this.url = url;
		
		//this.dominio = formattaDominio(url);
		this.d = new Domini(formattaDominio(url));
		indirizzi.put(url, false);
		 
		this.gestoreDb = GestoreDB.getIstance();
		
	}

	// indirizzi.put("ca", false);
	// indirizzi.put("cas", true);
	// indirizzi.put("xxxx", true);
	// indirizzi.put("caba", false);
	// indirizzi.put("cabab", false);

	public void start() {

		// this.analizza();

		while (analizza()) {
		}

	}

	public boolean analizza() {

		int indirizziSize = indirizzi.size();

		Iterator<Entry<String, Boolean>> i = indirizzi.entrySet().iterator();

		while (i.hasNext()) {

			Entry<String, Boolean> e = i.next();
			String key = (String) e.getKey();
			boolean val = (boolean) e.getValue();

			// se true già analizzata
			if (val == true) continue;
				
			
			String url = key;
			
			System.out.println("--- Sto per analizzare " + key);

			// Inizializzo pagina
			Pagina pagina = new Pagina(key);
			// prendo risultati pagina
			Map<String, Integer> m = pagina.getStatistiche();
			
			Url u = new Url(url);
			u.salvaParole(m);
			this.d.addUrl(u);
			
			
			gestoreDb.salvaDominio(d);
			
			
			// aggiungo risultati
			m.forEach((k, v) -> parole.merge(k, v, (v1, v2) -> v1 + v2));
			System.out.println("Parole trovate: " + m.size());
			// prendo link
			String[] links = pagina.getLinks();

			// Controllo:
			//
			// 1 - Dominio
			// 2 - Doppioni
			// 3 - Blacklist
			// 4 - Header

			System.out.println("Link estratti: " + links.length);
			int linkScartati = 0;
			int linkAggiunti = 0;
			int c = 0;
			int progress = 1;
			System.out.println("Verifica link estratti:");
			// verifico e aggiungo link a indirizzi
			for (String link : links) {

				// verifico dominio
				if (!isStessoDominio(link)) {
					linkScartati++;
					continue;
				}

				// verifico doppioni
				if (indirizzi.containsKey(link)) {
					linkScartati++;
					continue;
				}

				// verifico se dentro blacklist
				if (blackListIndirizzi.contains(link)) {
					linkScartati++;
					continue;
				}

				// verifica header
				if (this.isHtml(link)) {
					// aggiungo a indirizzi
					this.indirizzi.put(link, false);
					linkAggiunti++;
					// System.out.println("Aggiunto a indirizzi: " + link);
				}

				c++;
				int x = 100 * c / links.length;
				System.out.print("[" + linkAggiunti + "-" + x + "%]");

			}
			System.out.println();
			System.out.println("Link aggiunti: " + (links.length - linkScartati) + "/" + links.length);

			System.out.println("--- Fine analisi " + key);
			e.setValue(true);

			i = indirizzi.entrySet().iterator();

		} // end while

		if (indirizziSize == indirizzi.size())
			return false;
		else
			return true;

	} // end start

	private boolean isHtml(String link) {

		// qui lavoro Ferji
		boolean c = false;
		try {

			URL u = new URL(link);
			URLConnection uc = u.openConnection();
			uc.connect();

			String restituito = uc.getContentType().toString();
			if (restituito.contains("text/html"))
				c = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		// se non è html inserisco dominio in blackListIndirizzi
		if (c == false)
			blackListIndirizzi.add(link);

		// System.out.println("isHtml: " + link + " " + c);

		return c;
	}

	public String formattaDominio(String url) {
		String http = "http://";
		int numSlash = 0;
		String urlRitorno = url;
		for (int i = 0; i < http.length(); i++) {
			if (!(http.charAt(i) == url.charAt(i))) {
				urlRitorno = http + url;
				break;
			}
		}
		for (int i = 0; i < urlRitorno.length(); i++) {
			if (urlRitorno.charAt(i) == '/') {
				numSlash++;
			}

			if (numSlash == 3) {
				urlRitorno = urlRitorno.substring(0, i);
				break;
			}
		}

		urlRitorno = urlRitorno + '/';

		return urlRitorno;
	}

	public boolean isStessoDominio(String url) {

//		System.out.println(url);
		boolean res;
		String dominio = d.getDominio();
		if (url.length() < dominio.length()) {
			res = false;
		} else {
			res = url.substring(0, dominio.length()).equals(dominio);
		}
		
		if (res) {
//			System.out.println(url + " OK stesso dominio");
		} else {
//			System.out.println(url + " NO! altro dominio");
		}

		return res;
	}

}
