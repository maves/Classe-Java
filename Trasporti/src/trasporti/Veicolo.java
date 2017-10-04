package trasporti;

import java.util.ArrayList;

import Persona.Persona;
import trasporti.Documentazione.UsoVeicolo;

public abstract class Veicolo {
	
	
	Documentazione doc;
	
	private Persona guidatore;
	private ArrayList<Persona> passeggeri;
	
	private int maxPosti;
	private int maxVelocita;
	private Persona propietario;
	
	
	protected abstract String getTipoVeicolo();
	protected abstract int getPesoTrazione();
	protected abstract int getPesoAbitacolo();
	protected abstract int getNumTrazioni();
	protected abstract int getVelocitaIstantanea();
	protected abstract int getAutonomia();

	public void stampaDescrizione() {
		System.out.println("-------------------------------------------------");
		System.out.println("Propietario: " + getPropietario());
		System.out.println("Tipo Veicolo: " + getTipoVeicolo());
		System.out.println("Numero e peso trazione: " + getNumTrazioni() + " x " + getPesoTrazione()+"kg");
		System.out.println("Peso abitacolo: " + getPesoAbitacolo() +"kg");
		System.out.println();
		System.out.println("Documentazione: ");
		System.out.println("Uso Veicolo: "+ doc.getUsoVeicolo());
		System.out.println("Max Passeggeri: "+ doc.getPostiPasseggero());
		System.out.println("Max Carico: "+ doc.getMaxCarico());
		System.out.println();
		System.out.println("Guidatore: "+ getGuidatore());
		System.out.println("Passeggeri: ");
		stampaElencoPasseggeri();
		
	}
	public Veicolo(Persona propietario, int maxPosti, int maxVelocita, Documentazione doc) {
		
		this.propietario = propietario;
		this.maxPosti = maxPosti;
		this.maxVelocita = maxVelocita;
		this.doc = doc;
		
		this.passeggeri = new ArrayList<>();
	}
	
	public Veicolo(Persona propietario, int maxPosti, int maxVelocita) {
		
		this.propietario = propietario;
		this.maxPosti = maxPosti;
		this.maxVelocita = maxVelocita;
		this.doc = new Documentazione();
		
		this.passeggeri = new ArrayList<>();
	}
	
	
	
	public int maxDistanza() {
		return getVelocitaIstantanea() * getAutonomia();
	}
	
	public int getPeso() {
		return getPesoTrazione()*getNumTrazioni() + getPesoAbitacolo();
	}
	
	
	
	public int getMaxPosti() {
		return maxPosti;
	}

	public void setMaxPosti(int maxPosti) {
		this.maxPosti = maxPosti;
	}

	public int getMaxVelocita() {
		return maxVelocita;
	}

	public void setMaxVelocita(int maxVelocita) {
		this.maxVelocita = maxVelocita;
	}
	public Documentazione getDoc() {
		return doc;
	}
	public void setDoc(Documentazione doc) {
		this.doc = doc;
	}
	public Persona getGuidatore() {
		return guidatore;
	}
	public void setGuidatore(Persona guidatore) {
		this.guidatore = guidatore;
	}
	public ArrayList<Persona> getPasseggeri() {
		return passeggeri;
	}
	
	
	
	public int getNumPasseggeri() {
		return this.passeggeri.size();
	}
	
	
	public void stampaElencoPasseggeri() {
		
		for(Persona p: this.getPasseggeri()) {
			System.out.println(p);
		}
	}
	
	public void aggiungiPasseggeri(Persona[] passeggeri) {
		
		if(this.doc.getUsoVeicolo()==UsoVeicolo.TRASPORTO_MERCI) {
			System.out.println("Il veicolo è adibito al solo trasporto merci.");
			return;
		}
		
		for(Persona p: passeggeri) {
			if(this.getNumPasseggeri() >= this.doc.getPostiPasseggero()) {
				System.out.println("Il veicolo è pieno, "+p+" non può salire.");
			}else {
				this.getPasseggeri().add(p);
			}
		}
		
		
	}
	public Persona getPropietario() {
		return propietario;
	}
	
	
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	


	
	
	
	
}
