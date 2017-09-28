

public class Studente extends PersonaConGestioneCorsi{
	
	
	public Studente(Persona p) {
		super(p.nome, p.cognome, p.datadinascita);
		
	}
	
	public Studente(String nome, String cognome, String datadinascita) {
		super(nome, cognome, datadinascita);
		
	}



	
}
