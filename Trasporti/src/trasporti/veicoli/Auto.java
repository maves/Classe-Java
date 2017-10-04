package trasporti.veicoli;

import Persona.Persona;
import trasporti.TrazioneMotore;
import trasporti.Veicolo;
import trasporti.VeicoloTerrestre;

public class Auto extends Veicolo implements VeicoloTerrestre, TrazioneMotore {

	String tipoCarburante;
	
	public Auto(Persona propietario, int maxPosti, int maxVelocita, String tipoCarburante) {
		super(propietario, maxPosti, maxVelocita);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int getPotenza() {
		// TODO Auto-generated method stub
		return 80;
	}

	@Override
	public String getTipoCarburante() {
		// TODO Auto-generated method stub
		return tipoCarburante;
	}

	@Override
	public String getTipoStrada() {
		// TODO Auto-generated method stub
		return "strada asfaltata";
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Auto";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 98;
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 300;
	}

	@Override
	protected int getNumTrazioni() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	protected int getVelocitaIstantanea() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

	@Override
	protected int getAutonomia() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

}
