import java.util.ArrayList;
import java.util.Date;

public class Rappresentazione extends Spettacolo {

	String codice;
	
	Sala sala;
	Date data;
	
	int minPaganti;
	int spettatoriInSala = 0;
	int maxSpettatori;
	int minSpettatori = 3;
	
	double prezzoBase;
	Posto[] postiInVendita; // ordinati per codice
	ArrayList<Posto> postiVenduti;
	int numPostiVenduti = 0;
	
	boolean incorso = false;
	
	
	
	private void inizializzazione() {
		
		creaPostiInVendita();
		postiVenduti = new ArrayList<Posto>(postiInVendita.length);
		
		this.maxSpettatori = sala.numeroPosti;
		this.codice = this.nome + "|" + String.valueOf(this.data.getTime());
		
	}
//	public Rappresentazione(Sala sala, Date data) {
//		super(); 
//		this.sala = sala;
//		this.data = data;
//		this.prezzoBase = 10;
//
//		inizializzazione();
//	}
	
	public Rappresentazione(Spettacolo spettacolo, Sala sala, Date data) {
		super(spettacolo.nome, spettacolo.compagnia, spettacolo.durata); 
		this.sala = sala;
		this.data = data;
		this.prezzoBase = 10;

		inizializzazione();
	}
	
	public Rappresentazione(Spettacolo spettacolo, Sala sala, Date data, int prezzoBase) {
		super(spettacolo.nome, spettacolo.compagnia, spettacolo.durata); 
		this.sala = sala;
		this.data = data;
		this.prezzoBase = prezzoBase;

		inizializzazione();
	}
	public Rappresentazione(String nome, String compagnia, long durata, Sala sala, Date data, int prezzoBase) {
		super(nome, compagnia, durata);
		this.sala = sala;
		this.data = data;
		this.prezzoBase = prezzoBase;

		inizializzazione();
	}
	public void liberaPosto(int codicePosto) {
		
		this.postiInVendita[codicePosto].libero = true;
		numPostiVenduti--;
		
		postiVenduti.remove(postiInVendita[codicePosto]);
		
		
//		for(Posto p: postiVenduti) {
//			if(p.codice == codicePosto) {
//				postiVenduti.remove(p);
//			}
//		}
		
	}
	public Posto occupaPosto(int codicePosto) {
		
		this.postiInVendita[codicePosto].libero = false;
		postiVenduti.add(this.postiInVendita[codicePosto]);
		numPostiVenduti++;
		return this.postiInVendita[codicePosto];
	}
	
	public Posto getPosto(int codicePosto) {
		return postiInVendita[codicePosto];
	}
	
	private void creaPostiInVendita() {
		
		postiInVendita = new Posto[sala.getNumeroPosti()];
		
		int counter = 0;
		
		for (int fila = 0; fila < sala.numFile; fila++) {
			
			double prezzo = prezzoBase + prezzoBase*0.2*fila;
			
			for(int numPosto = 0; numPosto<sala.getNumPostiInFila(fila); numPosto++) {
				
				String codice = this.codice + "|" + fila + "|" + numPosto;
				postiInVendita[counter] = new Posto(fila, numPosto, prezzo, counter);
				counter++;
				
			}
			
		}
		
	}
	
	
}
