import java.util.ArrayList;

public class Persona {
	
	String nome;
	String cognome;
	String datadinascita;
	
	ArrayList<Professione> professioni;
	
	public Persona(String nome, String cognome, String datadinascita) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.datadinascita = datadinascita;
		
		professioni = new ArrayList<Professione>();
	}	
	
	
	
	public void addProfessione(Professione p) {
		
		professioni.add(p);
	}
	
	Professione getProfessione(String nomeProfessione) {
		
		for(Professione el: professioni) {
			
			if(el.nomeProfessione.equals(nomeProfessione)) {
				return el;
			}
		}
		
		return null;
	}
	
	public void azione(String professione, String azione, String argomento) {
		
		String out = this.nome + " ";
		
		Professione p = getProfessione(professione);
		if( p != null ) {
			
//			System.out.println( p.getClass().toString() );
			p.getClass().getConstructors().length
			
			
			
		}else {
			System.out.println(out + " ha qualche problema.");
		}
	}
	
	
	
	
	public String toString() {
		return this.nome + " " + this.cognome;
	}
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDatadinascita() {
		return datadinascita;
	}

	public void setDatadinascita(String datadinascita) {
		this.datadinascita = datadinascita;
	}

	
}
