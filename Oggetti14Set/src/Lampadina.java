
public class Lampadina {
	
	boolean stato;
	String colore;
	
	public Lampadina() {
		
		stato = false;
		colore = "verde";
	}
		
	
	public void accendi() {
		stato = true;
	}
	
	public void spegni() {
		stato = false;
	}
	
	public void impostaColore(String c) {
		
		switch(c) {
			case "verde": 
			case "giallo": 
			case "rosso":
				colore = c;
				break;
			default:
				System.out.println("Colore non consentito.");
		}
	}
	
	public void visualizzaStato() {
		
		System.out.print("La lampadina è ");
		
		if(stato == true)
			System.out.println("accesa.");
		else
			System.out.println("spenta.");
		
	}

	
}
