import java.util.ArrayList;

public class PersonaConGestioneCorsi extends Persona{
	
	private ArrayList<Corso> corsi;
	
	public PersonaConGestioneCorsi(String nome, String cognome, String data) {
		super(nome, cognome, data);
		corsi = new ArrayList<Corso>();
	}

	public boolean rimuoviCorso(Corso c) {
		return corsi.remove(c);
	}

	public boolean aggiungiCorso(Corso c) {
		return corsi.add(c);
	}


}
