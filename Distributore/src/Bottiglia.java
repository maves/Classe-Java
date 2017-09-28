
public class Bottiglia {
	
	final int DIMENSIONE_STANDARD = 500;
	
	private String contenuto;
	private int dimensione;
	private int quantita;
	
	public Bottiglia(String contenuto) {		
		this.contenuto = contenuto;
		this.dimensione = DIMENSIONE_STANDARD;
		this.quantita = dimensione;
	}
	public Bottiglia(String contenuto, int dimensione) {		
		this.contenuto = contenuto;
		this.dimensione = dimensione;
		this.quantita = dimensione;
	}
	public Bottiglia(String contenuto, int dimensione, int quantita ) {		
		this.contenuto = contenuto;
		this.dimensione = dimensione;
		this.quantita = quantita;
	}
	
	public int riempi(int qta) {
		
		if(quantita + qta <= dimensione) {
			quantita += qta;
			return qta;
		}else {
			int app = dimensione-quantita;
			quantita += dimensione-quantita;
			return app;
		}		
	}
	
	public int bevi(int qta) {
		
		if(qta <= dimensione) {
			quantita -= qta;
			return qta;
		}else {
			qta -= dimensione-quantita;
			return dimensione-quantita;
		}		
	}
	
	
	public String getContenuto() {	return contenuto;	}
	public float getQuantita() {	return quantita;	}
	public float getDimensione() {	return dimensione;	}
	
	public String toString() {
		
		return("["+contenuto+" "+quantita+"/"+dimensione+"]");
	}
	

}
