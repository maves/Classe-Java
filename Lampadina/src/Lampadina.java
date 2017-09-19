
public class Lampadina {
	boolean accesa = false;
	boolean rotta = false;
	int cicli = 0;
	final int VITA_LAMPADINA = 70 + (int)(Math.random()*60);
	
	 
//	void rompi() {
//		
//		if(!rotta) System.out.println("\n> > > C R A C K < < <\n");
//		
//		rotta = true;
//		accesa = false;
//	}
	
	void rappresentazioneGrafica() {
		
		
		if(rotta)	System.out.print("X");
		else if(accesa) System.out.print("O");
		else System.out.print("*");
		
		
	}
	
	void controlloVita() {
		if(++cicli >= VITA_LAMPADINA) {
			
//			if(!rotta) System.out.println("\n> > > C R A C K < < <\n");
			rotta = true;
			accesa = false;
		}
	}
	
	void accendi() {
		
		controlloVita();
		
		
		
		if(!rotta) {
			accesa = true;
			
		}
	}
	
	void spegni() {
		
		controlloVita();
		accesa = false;
	}
	
	void inverti() {
		
		if(accesa)	spegni();
		else accendi();
	}
	
	String info() {
		String res = "La lampadina è ";
		if(accesa && !rotta)
			res += "ACCESA";
		else
			res += "SPENTA";
		
		if(rotta) res += " perché è ROTTA!";
		
		res += " (cicli: " + cicli + ")";
		
		return res;
	}
}
