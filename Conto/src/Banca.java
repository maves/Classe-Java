
public class Banca {
	
	final int MAX_NUM_CONTI = 100;	
	Conto[] contiCorrente;
	
	String nome;
	
	public Banca(String n) {
		nome = n;
	}
	
	public boolean nuovoConto(String n, double sommaIniziale) {
		
		if(isCliente(n)) {
			System.out.println("il Sig. "+ n +" è già cliente.");
			return false;
		}
		
		if(contiCorrente.length <= MAX_NUM_CONTI){
			System.out.println("E' stato raggiunto il massimo dei conti corrente.");
			return false;
		}
		
		contiCorrente[contiCorrente.length] = new Conto(n, sommaIniziale);
		
		return true;
		
		
	}
	
	
	
	
	public boolean isCliente(String nome) {
		
		if( cercaCodiceCliente(nome) >= 0 )
			return true;
		else
			return false;
	}
	
	// codice utente sarà l'indice dell'array contiCorrente
	public int cercaCodiceCliente(String nome) {
		
		
		for(int i= 0; i< contiCorrente.length; i++) {
			
			if(contiCorrente[i].getTitolare().equals(nome))
				return i;
		}
		
		return -1;
		
	}
	
	
}
