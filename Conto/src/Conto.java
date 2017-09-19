public class Conto {
	
	private double totale;
	private String titolare;

	public Conto(String titolare, double sommaIniziale) {
		this.titolare = titolare;
		this.totale = sommaIniziale;
	}
	
	public void versamento(double somma) {
		totale += somma;
	}

	public boolean prelievo(double somma) {
		if (totale < somma)
			return false;
		totale -= somma;
		return true;
	}

	public double getTotale() {
		return totale;
	}

	public String getTitolare() {
		return titolare;
	}
	
	public String resoconto() {
		return toString();
	}
	
	public String toString() {
		return getTitolare() + ": " + getTotale(); 
	}
	
	
}