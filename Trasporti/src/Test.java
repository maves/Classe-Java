import java.util.ArrayList;
import java.util.List;

import trasporti.Veicolo;
import trasporti.veicoli.Carrozza;

public class Test {

	
	enum Colore { Rosso, Giallo, Verde, Blu };
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MM.p("test \n\n");
		
		Carrozza carro = new Carrozza("Salvatore", 1, 8, 20);
		Veicolo biga = new Carrozza("Cesare", 1, 2, 40);
		
		
		//
		//	Non funziona se .getNumCavalli() (metodo di Carrozza)
		//  è dichiarato protected
		//  perchè?
		
//		((Carrozza) biga).getNumCavalli();
//		carro.getNumCavalli();
	

//		System.out.println(  Colore.values().length );
		
		for(Colore s: Colore.values()) {
			System.out.println(s);
			if(s.ordinal() == 1) System.out.println(true);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
