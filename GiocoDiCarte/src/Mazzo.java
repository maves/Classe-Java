

import java.util.ArrayList;
import java.util.Collections;

public class Mazzo {
	
	public enum NapoletanoSemi{ SPADE, ORI, BASTONI, COPPE}
	

	ArrayList<Carta> carte;
	
	Mazzo(){
		this.carte = new ArrayList<>();
	}
	
	Mazzo(ArrayList<Carta> carte){
		this.carte = carte;
	}
	
	Mazzo(String tipoMazzo){
		this.carte = new ArrayList<>();
		
		switch(tipoMazzo) {
			case "Napoletano":
				
				for(NapoletanoSemi seme: NapoletanoSemi.values()){
					for(int val = 1; val<=10; val++) {
						carte.add(new Carta(val, seme.ordinal()));
					}
				}
				
				
				break;
		
		
		}
	}
	
	public void add() {
		
	}
	
	public void mischia() {
		Collections.shuffle(carte);
	}
	
	public String toString() {
		String o="";
		for(Carta c: carte) {
			o+= c;
		}
		return o;
	}
	
}
