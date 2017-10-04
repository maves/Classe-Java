package trasporti;

public class Documentazione {
	
	public enum UsoVeicolo{ 
		TRASPORTO_PERSONE,
		TRASPORTO_MERCI,
		TRASPORTO_MISTO
	}
	
	private UsoVeicolo usoVeicolo;
	

	private int postiPasseggero;
	private int maxCarico;
	


	public Documentazione(UsoVeicolo usoVeicolo, int postiPasseggero, int maxCarico) {
		super();
		this.usoVeicolo = usoVeicolo;
		this.postiPasseggero = postiPasseggero;
		this.maxCarico = maxCarico;
	}
	public Documentazione() {
		super();
		this.usoVeicolo = UsoVeicolo.TRASPORTO_PERSONE;
		this.postiPasseggero = 4;
		this.maxCarico = 0;
	}
	

	public UsoVeicolo getUsoVeicolo() {
		return usoVeicolo;
	}



	public void setUsoVeicolo(UsoVeicolo usoVeicolo) {
		this.usoVeicolo = usoVeicolo;
	}



	public int getPostiPasseggero() {
		return postiPasseggero;
	}



	public void setPostiPasseggero(int postiPasseggero) {
		this.postiPasseggero = postiPasseggero;
	}



	public int getMaxCarico() {
		return maxCarico;
	}



	public void setMaxCarico(int maxCarico) {
		this.maxCarico = maxCarico;
	}


}
