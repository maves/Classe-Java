package trasporti.veicoli;

import Persona.Persona;
import trasporti.TrazioneAnimale;
import trasporti.Veicolo;
import trasporti.VeicoloTerrestre;

public class Bicicletta extends Veicolo implements VeicoloTerrestre, TrazioneAnimale {

	public Bicicletta(Persona propietario, int maxPosti, int maxVelocita) {
		super(propietario, maxPosti, maxVelocita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipoAnimale() {
		// TODO Auto-generated method stub
		return "umano";
	}

	@Override
	public String getCibo() {
		// TODO Auto-generated method stub
		return "ristorante";
	}

	@Override
	public int getStanchezza() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

	@Override
	public String getTipoStrada() {
		// TODO Auto-generated method stub
		return "diversi tipi di strada";
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Velocipede";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 20;
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
