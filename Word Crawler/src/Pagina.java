import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Pagina {   //hdchdhdhddhdhh
	
	private String urlDominio = "";
	private String url = "";
	private String contenuto = "";
	Document doc;
	
	public Pagina(String url) {
		// ciao gghhghhghh
		this.url = url;
		
		

		try {
			this.doc = Jsoup.connect(url).get();
//			this.contenuto = doc.toString();
			this.contenuto = this.pulisci(doc.text());
			
		}catch(HttpStatusException e) {
			
			System.out.println("Errore 404: salto pagina..");
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Map<String, Integer> getStatistiche() {
		
		String[] arr = this.contenuto.split(" ");

		Map<String, Integer> res = new HashMap<String, Integer>();
		
		for(String s: arr) {
			if(s=="") continue;
			Integer occorrenze = res.get(s);
			res.put(s, (occorrenze == null) ? 1 : ++occorrenze );
		}		
		
		return res;		
	}
	
	public String[] getLinks() {
		
		Elements links = null;
		try{
			links = doc.select("a[href]");
		}catch(NullPointerException e) {
			System.out.println("Bug Jsoup !!!!!");
			String[] vuoto = new String[0];
			return vuoto;
		}
		
		ArrayList<String> res = new ArrayList<String>();
		
		for (Element link : links) {

//			System.out.println(link.attr("abs:href"));
			String l = this.pulisciLink( link.attr("abs:href") );
			
			if( l!= null)
				res.add(l);	
        }
		
		String[] out = new String[res.size()];
		return res.toArray(out);
		
	}
	
	private String pulisciLink(String s) {
	//controllo, se supera il controllo ritorna la stringa altrimenti
		//null//
		// non serve più perchè ci pensa già classe ricercatore
		
		
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
    
	
    public String pulisci(String s) {
    	
    	
  		/*boolean contieneChiocciola;
  		for (int i = 0; i < s.length(); i++) {
  			if (s.charAt(i)=='@') {
  				contieneChiocciola = true;
  			}
  		}*/
  		//vocali.contains(lettera)

  		StringBuffer risultato = new StringBuffer();
  		
  		for (int i = 0; i < s.length(); i++) {
  			if (((s.charAt(i) >= 48 ) && (s.charAt(i) <= 57))  || 	//numeri
  				((s.charAt(i) >= 65) && (s.charAt(i) <= 90))   ||  	//lettere maiuscole
  				((s.charAt(i) >= 97) && (s.charAt(i) <= 122))  ||   //lettere minuscole
  				((s.charAt(i) >= 192) && (s.charAt(i) <= 246)) ||	//accentate 1
  				((s.charAt(i) >= 249) && (s.charAt(i) <= 255))) {	//accentate 2
  				risultato.append(s.charAt(i));
  			}else {
  				risultato.append(" ");
  			}
  			
  		}
  		return risultato.toString();
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
