import Persona.Persona;

public class Spettatore extends Persona{

	Biglietto biglietto;
	
	public Spettatore(Persona p, Biglietto b) {
		
		super(p.getNome(), p.getCognome(), p.getDataDiNascita());
		biglietto = b;
		
	}
	
	public Biglietto daiBiglietto() {
		return biglietto;
	}
	
	public void riprendiBiglietto(Biglietto b) {
		biglietto = b;
	}

}
