import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class testPagina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "";
//		url = "http://letus.vfdns.org/java/teatro/teatro.json";
		
		// simple html
//		url = "http://www.simplehtmlguide.com/examples/basics.html";
		
		
//		url = "https://it.wikipedia.org/wiki/Speciale:PaginaCasuale";
		url = "http://www.pmichaud.com/toast/";
		
		Pagina pagina = new Pagina(url);
		
//		System.out.println(url);
//		System.out.println(p);
		
		Map<String, Integer> m = pagina.getStatistiche();
		
//		System.out.println(m);
		
//		Iterator<Entry<String, Integer>> i = m.entrySet().iterator(); 
//		while(i.hasNext()){
//		    String key = i.next().getKey();
//		    System.out.println(key+" "+m.get(key));
//		}
		
		String[] links = pagina.getLinks();
		
		for(String s: links) {
			System.out.println(s);
		}

	}

}
