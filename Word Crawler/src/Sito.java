import java.util.HashMap;
import java.util.Map;

public class Sito {

	Map<String, Integer> parole = new HashMap<String, Integer>();
	Map<String, Boolean> indirizzi = new HashMap<String, Boolean>();
	Map<String, Boolean> blackListIndirizzi = new HashMap<String, Boolean>();
	
	String url = "";
	
	public Sito(String url) {
		this.url = url;
		
	}
	
	
	
}
