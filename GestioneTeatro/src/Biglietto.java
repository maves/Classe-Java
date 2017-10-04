import java.text.SimpleDateFormat;
import java.util.Date;

public class Biglietto {

	Rappresentazione rappresentazione;	
	Posto posto;
	int fila;
	int numero;
	double prezzo;
	boolean convalidato = false;
	Date dataSpettacolo;
	
	public Biglietto(Rappresentazione rappresentazioneSpettacolo, Posto posto) {
		super();
		this.rappresentazione = rappresentazioneSpettacolo;
		this.fila = posto.fila;
		this.numero = posto.numero;
		this.prezzo = posto.prezzo;
		this.posto = posto;
		this.dataSpettacolo = rappresentazioneSpettacolo.data;
	}
	
	void convalida() {
		convalidato = true;
	}
	
	boolean convalidato() {
		return this.convalidato;
	}
	
	public String getNomeSpettacolo() {
		
		return rappresentazione.nome;
	}
	
	public String getDate() {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		return df.format(rappresentazione.data);
//		return rappresentazioneSpettacolo.data.toString();
	}
	public String toString() {
		
		return "''' Biglietto '''" +
		"\n Spettacolo: " + rappresentazione.nome +
		"\n Data: " + getDate() + " Sala: " + rappresentazione.sala.nome +
		"\n Fila: " + fila + " Numero: " + numero + " Prezzo: " + prezzo + " €";
		
		
	}

}
