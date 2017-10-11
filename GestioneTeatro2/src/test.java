
import Persona.GeneratorePersone;
import Persona.Persona;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Sala sala1 = new Sala("Sala della morte");
		int[] geometriaSala = {10,10,10,8,7,6,5};
		Sala sala2 = new Sala("Sala della Noia", geometriaSala );
		int[] geometriaSala2 = {8,8,8,8,4,3,2,1};
		 
		Sala sala3 = new Sala("Sala ammalata", geometriaSala2);
		
		Sala[] sale = {sala1, sala2, sala3};
		
		Teatro teatro = new Teatro("Teatro brutto", sale);
		
		Spettacolo spettacolo1 = new Spettacolo();
		Spettacolo spettacolo2 = new Spettacolo();
		Spettacolo spettacolo3 = new Spettacolo();
		Spettacolo spettacoloDiFabio = new Spettacolo("L'essere Maschio secondo Fabio",
												"Compagnia degli stronzi", 2*60*1000);
		
		teatro.nuovaRappresentazione(spettacolo1, "Sala della morte", "12/12/2017 21:30");
		teatro.nuovaRappresentazione(spettacolo2, "Sala della morte", "13/12/2017 21:30");
		teatro.nuovaRappresentazione(spettacolo3, "Sala ammalata", "14/12/2017 19:30");
//		teatro.nuovaRappresentazione(spettacoloDiFabio, "Sala della Noia", "17/12/2017 19:30");
		teatro.nuovaRappresentazione(spettacoloDiFabio, "Sala della Noia", "04/10/2017 15:50");
		
		
		teatro.stampaRappresentazioni();
		
		System.out.println("-----------");
		
		Biglietteria biglietteria = new Biglietteria();
		
		Biglietto b0 = biglietteria.compraBiglietto(teatro,
				"L'essere Maschio secondo Fabio", "12/12/2017 21:30", 2, 4);
		
		Biglietto b1 = biglietteria.compraBiglietto(teatro,
				"L'essere Maschio secondo Fabio", "04/10/2017 15:50", 2, 4);
		
 		System.out.println(b1);
		
 		
 		
		Persona persona1 = GeneratorePersone.genera();
		System.out.println(persona1);
		
		Spettatore Spettatore1 = new Spettatore(persona1, b1); 
		
		Persona persona2 = GeneratorePersone.genera();
		Persona persona3 = GeneratorePersone.genera();
		Persona persona4 = GeneratorePersone.genera();
		Persona persona5 = GeneratorePersone.genera();

		System.out.println(persona2 + 
							"\n" + persona3 +
							"\n" + persona4 +
							"\n" + persona5);
		
		System.out.println("----------------");
		// int[] geometriaSala = {10,10,10,8,7,6,5};
		
		Biglietto b2 = biglietteria.compraBiglietto(teatro,
				"L'essere Maschio secondo Fabio", "04/10/2017 15:50", 1, 4);
		Biglietto b3 = biglietteria.compraBiglietto(teatro,
				"L'essere Maschio secondo Fabio", "04/10/2017 15:50", 5, 4);
		Biglietto b4 = biglietteria.compraBiglietto(teatro,
				"L'essere Maschio secondo Fabio", "04/10/2017 15:50", 3, 4);
		Biglietto b5 = biglietteria.compraBiglietto(teatro,
				"L'essere Maschio secondo Fabio", "04/10/2017 15:50", 3, 5);
		
		Spettatore Spettatore2 = new Spettatore(persona1, b2); 
		Spettatore Spettatore3 = new Spettatore(persona1, b3); 
		Spettatore Spettatore4 = new Spettatore(persona1, b4); 
		Spettatore Spettatore5 = new Spettatore(persona1, b5);
		
		Maschera maschera = new Maschera(teatro);
		
		maschera.avvia("L'essere Maschio secondo Fabio", "04/10/2017 15:50");
		
		Spettatore1.riprendiBiglietto(maschera.controllaBiglietto(Spettatore1.daiBiglietto()));
		Spettatore2.riprendiBiglietto(maschera.controllaBiglietto(Spettatore2.daiBiglietto()));
		Spettatore3.riprendiBiglietto(maschera.controllaBiglietto(Spettatore3.daiBiglietto()));
		Spettatore4.riprendiBiglietto(maschera.controllaBiglietto(Spettatore4.daiBiglietto()));
		
		maschera.avvia("L'essere Maschio secondo Fabio", "04/10/2017 15:50");
		
		System.out.println("Sono test.java");
		
	}

}
