import java.util.Date;

import Persona.Persona;

public class Maschera extends Persona{

	Teatro teatro;
	public Maschera(Teatro teatro) {
		// TODO Auto-generated constructor stub
		super("Quentin", "Tarantino", "12/12/71");
		this.teatro = teatro;
		
	}
	
	
	public boolean avvia(String nomeSpettacolo, String sdata) {
		
		Rappresentazione rappr = teatro.trovaRappresentazione(nomeSpettacolo, sdata);
		
		System.out.println("Sto per avviare lo spettacolo "+rappr.nome+"..");
		
		if(!rappr.incorso)
		{
			
			
			if(rappr.spettatoriInSala < rappr.minSpettatori ) {
				System.out.println("Lo spettacolo non può iniziare, troppi pochi spettatori.. ");
				return false;
			}else if(rappr.spettatoriInSala > rappr.maxSpettatori) {
				System.out.println("Troppi spettatori in sala, chi non ha il biglietto?");
				return false;
			}
		}else {
			System.out.println("Lo spettacolo è già avviato!");
			return false;
		}
		rappr.incorso = true;
		
		System.out.println("Si alzi il sipario!!!");
		return true;
	}
	
	public boolean convalidaBiglietto(Biglietto b) {
		
		if(!b.convalidato()) {
			b.convalida();
			b.rappresentazione.spettatoriInSala++;
			return true;
		}else {
			System.out.println("Attenzione il biglietto è gia stato usato. Tu non entri!");
			return false;
		}
			
	}
	
	
	@SuppressWarnings("deprecation")
	public Biglietto controllaBiglietto(Biglietto b) {
		
		if(b.rappresentazione.postiVenduti.contains(b)) {
			System.out.println("Hai un biglietto clonato.. Tu non entri!");
			return b;
		}

		// tolleranza ritardo/anticipo 15 minuti
		Date now = new Date();
		Date dataBiglietto = b.dataSpettacolo;
		
		Date diff = new Date(  now.getTime() - dataBiglietto.getTime()   );
		
		if(Math.abs(diff.getTime()) > 15 *60*1000) {
			System.out.println("Tu non entri! Orario sbagliato!");
			return b;
		}
		
		if(convalidaBiglietto(b))
			System.out.println("Ok sei dentro la sala");
		
		return b;
			
		
			
		
		
	}

}
