import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Teatro {
	
	/////////////// json
	String telefono;
	String email;
	int postiDisponibiliPlatea;
	int postiDisponibiliPoltronaVip;
	int postiDisponibiliGalleria;
	
	///////////////
	String nome;
	Sala[] sale;
	Spettacolo spettacoli;
	ArrayList<Rappresentazione> rappresentazioni = new ArrayList<Rappresentazione>();
	
	Teatro(String nome, Sala[] sale){
		this.nome = nome;
		this.sale = sale;
	}
	
	public Sala getSala(String n) {
		
		
		for(Sala sala: sale) {
			if(sala.nome.equals(n)) {
				return sala;
			}
		}
		System.out.println("La sala non esiste");
		return null;
	}
	
	Date convertiData(String sdata) {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date d = null;
		try {
			d = df.parse(sdata);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("ERRORE: Hai inserito la data nel formato sbagliato.");
			return null;
		}

		return d;
		
		
		
	}
	
	public void nuovaRappresentazione(Spettacolo spettacolo, String nomeSala, String sdata){
		
		
		Sala sala = getSala(nomeSala);
		if(sala == null) return;
		
		Date data = convertiData(sdata);
		if(data == null) return;
		
		Rappresentazione rappr = new Rappresentazione(spettacolo, sala, data);
//		
		rappresentazioni.add(rappr);
	}
	
	public void nuovaRappresentazione(Spettacolo spettacolo, String nomeSala, String sdata, int prezzoBase){
		
		Sala sala = getSala(nomeSala);
		if(sala != null) return;
		
		Date data = convertiData(sdata);
		if(data == null) return;
		
		Rappresentazione rappr = new Rappresentazione(spettacolo, sala, data, prezzoBase);
		rappresentazioni.add(rappr);
	}
	
	public Rappresentazione trovaRappresentazione(String nomeSpettacolo, String sdata) {
		
		Date data = convertiData(sdata);
		if(data == null) return null;
		
		if(data.after(new Date())) {
			System.out.println("(Teatro) ERRORE: Spettacolo già passato.");
			return null;
		}
		
		for(int i=0; i<rappresentazioni.size(); i++) {
			
			if(rappresentazioni.get(i).nome.equals(nomeSpettacolo)
					&& rappresentazioni.get(i).data.equals(data)) {
				
				return rappresentazioni.get(i);
			}			
		}
		
		System.out.println("Lo spettacolo non esiste! (trovaRappresentazione)1");
		return null;		
	}
	
	public Rappresentazione trovaRappresentazione(String nomeSpettacolo, Date data) {
		if(data.after(new Date())) {
			System.out.println("(Teatro) ERRORE: Spettacolo già passato.");
			return null;
		}
		
//		System.out.println(rappresentazioni.size());
		for(int i=0; i<rappresentazioni.size(); i++) {
			
//			System.out.println(nomeSpettacolo+" "+rappresentazioni.get(i).nome);
			
			if(rappresentazioni.get(i).nome.equals(nomeSpettacolo)
					&& rappresentazioni.get(i).data.equals(data)) {
				
				return rappresentazioni.get(i);
			}			
		}
		
		System.out.println("Lo spettacolo non esiste! (trovaRappresentazione)2");
		return null;		
	}
    
	public Biglietto erogaBiglietto(String nomeSpettacolo, String sdata, int fila, int numPosto) {
		
		Date data = convertiData(sdata);
		if(data==null) return null;
		
		Rappresentazione rappr = trovaRappresentazione(nomeSpettacolo, data);
		if(rappr==null) return null;
		
		int codicePosto = rappr.sala.getCodicePosto(fila, numPosto);
		if(codicePosto == -1) {
			System.out.println("Teatro->erogaBiglietto ERRORE! codicePosto: " + codicePosto);
			return null;
		}
		
		Posto posto = rappr.postiInVendita[codicePosto];
		if(posto.libero) {
			posto = rappr.occupaPosto(codicePosto);		
			return new Biglietto(rappr, posto);
		}
		
		System.out.println("Posto non disponibile!");
		return null;
	}
	
	public void annullaBiglietto(Biglietto biglietto) {
		Rappresentazione rappr = biglietto.rappresentazione;
		rappr.liberaPosto(biglietto.posto.codice);
	}
	
	public void stampaRappresentazioni() {
		
		System.out.println("Spettacoli in programma: " + rappresentazioni.size());
		
		for(Spettacolo s: rappresentazioni)
			System.out.println(s);
	}
	
	
	
	
}
