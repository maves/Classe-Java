import org.json.JSONException;
import org.json.JSONObject;

import utility.TextDownloader;

public class withJason {

	public static void main(String[] args) {
		
//		• http://letus.vfdns.org/java/teatro/teatro.json
//		• http://letus.vfdns.org/java/teatro/spettacoli.json
//		• http://letus.vfdns.org/java/teatro/programmazione.json
//		• http://letus.vfdns.org/java/teatro/venditabiglietti.json
		
		String infoTeatro = TextDownloader.get("http://letus.vfdns.org/java/teatro/teatro.json");
//		System.out.println(prova);
		
		JSONObject jo;
		String nomeTeatro="", telefono="", email="";
		int postiDisponibiliPlatea=0, postiDisponibiliPoltronaVip=0, postiDisponibiliGalleria=0;
		
		
		try {
			
			jo = new JSONObject(infoTeatro);
			
			nomeTeatro = jo.getString("nometeatro");
			telefono = jo.getString("telefono");
			email = jo.getString("email");
			
			JSONObject jo2 = jo.getJSONObject("postidisponibili");
			
			postiDisponibiliPlatea = jo2.getInt("platea");
			postiDisponibiliPoltronaVip = jo2.getInt("poltronavip");
			postiDisponibiliGalleria = jo2.getInt("galleria");
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println(nomeTeatro
		+"\n"+telefono
		+"\n"+email
		+"\n"+postiDisponibiliPlatea
		+"\n"+postiDisponibiliPoltronaVip
		+"\n"+postiDisponibiliGalleria);
	}

}
