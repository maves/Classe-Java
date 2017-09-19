import java.util.Scanner;

public class Oggetti {

	public static void main(String[] args) {
		
		Lampadina aulaLamp = new Lampadina();
		aulaLamp.accendi();
		aulaLamp.visualizzaStato();
		aulaLamp.spegni();
		aulaLamp.visualizzaStato();
		
		Lampadina salaLamp = new Lampadina();
		salaLamp.spegni();
		aulaLamp.accendi();
		
		Lampadina bagnoLamp = new Lampadina();
		bagnoLamp.accendi();
		
		System.out.println("Lo stato delle lampadine è: ");
		
		System.out.print("Aula: ");
		aulaLamp.visualizzaStato();
		System.out.print("Sala: ");
		salaLamp.visualizzaStato();
		System.out.print("Bagno: ");
		bagnoLamp.visualizzaStato();
		
		bagnoLamp.impostaColore("rosso");
		aulaLamp.impostaColore("giallo");
		salaLamp.impostaColore("verde");
		
		System.out.println("Inserisci il colore della lampada del bagno.");
		Scanner in = new Scanner(System.in);
		String c = in.nextLine();
		in.close();
		bagnoLamp.impostaColore(c);
	}

}
