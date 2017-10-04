import java.util.ArrayList;
import java.util.List;

import Persona.Persona;
import trasporti.Documentazione;
import trasporti.Documentazione.UsoVeicolo;
import trasporti.Veicolo;
import trasporti.veicoli.Auto;
import trasporti.veicoli.Carrozza;

public class Test {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MM.p("test \n\n");
		
		
		Documentazione docCarro = new Documentazione(
				Documentazione.UsoVeicolo.TRASPORTO_MERCI,
				1, 500);
		
		Documentazione docBiga = new Documentazione(
				Documentazione.UsoVeicolo.TRASPORTO_PERSONE,
				1, 0);
		
		
		Persona salvatore = new Persona("Salvatore", "Cagnozzo", "9/12/1950");
		Persona cesare = new Persona("Cesare", "Augusto", "02/11/1945");
		
		Carrozza carro = new Carrozza(salvatore , 1, 8, 20, docCarro);
		Veicolo biga = new Carrozza(cesare, 1, 2, 40);
		
		
		//
		//	Non funziona se .getNumCavalli() (metodo di Carrozza)
		//  è dichiarato protected
		//  perchè?
		
//		((Carrozza) biga).getNumCavalli();
//		carro.getNumCavalli();
	
		
		Persona mario = new Persona("Mario", "Gentile", "4/8/1960");
		Persona giovanni = new Persona("Giovanni", "Brambilla", "14/4/1978");
		Persona francesca = new Persona("Francesca", "Cartaio", "30/3/1990");
		Persona claudia = new Persona("Claudia", "Paniere", "4/8/1961");
		Persona valeria = new Persona("Valeria", "Sebon", "14/6/1985");

		Auto seicento = new Auto(mario, 4, 120, "Benzina");
		
		
		Documentazione docSeicento = new Documentazione(UsoVeicolo.TRASPORTO_PERSONE,3,0);
		
		seicento.setDoc(docSeicento);
		
		seicento.setGuidatore(francesca);
		
		Persona[] pass = { claudia, valeria, giovanni, mario};
		seicento.aggiungiPasseggeri(pass);
		
		
		seicento.stampaDescrizione();
		
		
		
		
		
		
		
		
	}

}
