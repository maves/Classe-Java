import java.util.ArrayList;

public class Biglietteria {

//	ArrayList<Teatro> teatri = new ArrayList<Teatro>();
	
//	public Biglietteria(Teatro teatro) {
//		teatri.add(teatro);		
//	}
//	public void addTeatro(Teatro teatro) {
//		teatri.add(teatro);	
//	}
//	public void removeTeatro(Teatro teatro) {
//		teatri.remove(teatro);	
//	}
//	
	
	public Biglietto compraBiglietto(Teatro teatro, String nomeSpettacolo, String sdata, int fila, int numPosto) {
		return teatro.erogaBiglietto(nomeSpettacolo, sdata, fila, numPosto);
	}
	public double rimborsaBiglietto(Teatro teatro, Biglietto biglietto) {
		teatro.annullaBiglietto(biglietto);
		return biglietto.prezzo;
		
	}
	public void elencoRappresentazioni(Teatro teatro) {
		teatro.stampaRappresentazioni();
	}

}
