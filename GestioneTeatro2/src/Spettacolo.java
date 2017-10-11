import java.util.Date;

import Persona.GeneratorePersone;

public class Spettacolo {

	String nome;
	String compagnia;
	//	int numeroAttori;
	long durata;
	
	public Spettacolo(String nome, String compagnia, /*int numeroAttori,*/ long durata) {
		super();
		this.nome = nome;
		this.compagnia = compagnia;
//		this.numeroAttori = numeroAttori;
		this.durata = durata;
	}
	
	public Spettacolo() {
		
		GeneratorePersone app = new GeneratorePersone();
		
		String[] verbi = { "lava l'occhio di", "uccide", "impara da", "si lava con", "fa il birbante con", "fa lo sgambetto a", "infanga", "perde tempo con", "mangia le unghie di", "allaccia le scarpe di", "adora il naso di", "sbottona la camicia di", "ammica a", "fa lezione di java a", "compila le borchie di", "è più basso di", "non è maschio quanto", "spreme e beve i brufoli di", "taglia i peli del naso di", "è molto più bimbominchia di"};
		
		this.nome = GeneratorePersone.nomeCasuale() + " " + verbi[(int)(Math.random()*(verbi.length-1))] + " " + GeneratorePersone.nomeCasuale();
		this.compagnia = "Quelli di " + GeneratorePersone.cognomeCasuale();
//		this.numeroAttori = (int)(Math.random()*100);
		this.durata = 1000*60 *30 + (int)(Math.random()*1000*60 *180);
	}
	
	public String toString() {
		
		return "''' SPETTACOLO '''"
				+ "\nNOME: " + nome
				+ "\nCOMPAGNIA: " + compagnia
//				+ "\nATTORI: " + numeroAttori
				+ "\nDURATA: " + (new Date(durata)).getMinutes() + "'";
				
	}
	
}
