import utility.TextDownloader;

public class withJason {

	public static void main(String[] args) {
		
//		• http://letus.vfdns.org/java/teatro/teatro.json
//		• http://letus.vfdns.org/java/teatro/spettacoli.json
//		• http://letus.vfdns.org/java/teatro/programmazione.json
//		• http://letus.vfdns.org/java/teatro/venditabiglietti.json
		
		String prova = TextDownloader.get("http://letus.vfdns.org/java/teatro/teatro.json");
		System.out.println(prova);
		
	}

}
