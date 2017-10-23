package controller;
import java.util.Map;

public class PageResponse {
	
	String url;
	Map<String, Integer> mappa;
	
	public PageResponse(String url, Map<String, Integer> mappa) {
		this.url = url;
		this.mappa = mappa;
	}
}
