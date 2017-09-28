package trasporti.veicoli;

import trasporti.TrazioneAnimale;
import trasporti.Veicolo;
import trasporti.VeicoloTerrestre;

public class Carrozza extends Veicolo implements VeicoloTerrestre, TrazioneAnimale {

	private int numCavalli;
	
	public Carrozza(String propietario, int numCavalli, int maxPosti, int maxVelocita) {
		super(propietario, maxPosti, maxVelocita);
		// TODO Auto-generated constructor stub
		this.numCavalli = numCavalli;
	}
	
	protected int getNumCavalli() {
		return numCavalli;
	}

	@Override
	public String getTipoAnimale() {
		// TODO Auto-generated method stub
		return "Cavallo";
	}

	@Override
	public String getCibo() {
		// TODO Auto-generated method stub
		return "Fieno";
	}

	@Override
	public int getStanchezza() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

	@Override
	public String getTipoStrada() {
		// TODO Auto-generated method stub
		return "strade asfaltate e sterrate";
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Carrozza";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 200;
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	protected int getNumTrazioni() {
		// TODO Auto-generated method stub
		return numCavalli;
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
