
public class Persona {
	
	String nome;
	String cognome;
	String datadinascita;
	
	public Persona(String nome, String cognome, String datadinascita) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.datadinascita = datadinascita;
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
