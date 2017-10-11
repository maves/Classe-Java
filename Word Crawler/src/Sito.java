import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Sito {

	Map<String, Integer> parole = new HashMap<String, Integer>();
	Map<String, Boolean> indirizzi = new HashMap<String, Boolean>();
	Map<String, Boolean> blackListIndirizzi = new HashMap<String, Boolean>();

	String url = "";

//	public Sito(String url) {
	public Sito() {
		this.url = url;

//		indirizzi.put(url, false);
		
		
		indirizzi.put("c", false);
		indirizzi.put("ca", false);
		indirizzi.put("xxxx", true);
		indirizzi.put("caba", false);
		indirizzi.put("cabab", false);
	}

	public void start() {

		Iterator<Entry<String, Boolean>> i = indirizzi.entrySet().iterator();

		while (i.hasNext()) {
			
			Entry e = i.next();
			String  key =   (String) e.getKey();
			boolean val =   (boolean) e.getValue();
			
			
			
			System.out.println(key + " " + val);
			
			
//			String key = i.next().getKey();
//			i.next()
//			System.out.println(key + " " + indirizzi.get(key));
			
			
			
		}
	}

}
