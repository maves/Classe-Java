package trasporti.veicoli;

import trasporti.TrazioneMotore;
import trasporti.Veicolo;
import trasporti.VeicoloAereo;

public class Jet extends Veicolo implements TrazioneMotore, VeicoloAereo {

	
	private int numTurbine;
	
	public Jet(String propietario, int maxPosti, int maxVelocita, int numTurbine) {
		super(propietario, maxPosti, maxVelocita);
		// TODO Auto-generated constructor stub
		this.numTurbine = numTurbine;
	}

	@Override
	public int getAltezza() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

	@Override
	public int getPotenza() {
		// TODO Auto-generated method stub
		return 9990;
	}

	@Override
	public String getTipoCarburante() {
		// TODO Auto-generated method stub
		return "Cherosene";
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Aereo";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 480;
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 5460;
	}

	@Override
	protected int getNumTrazioni() {
		// TODO Auto-generated method stub
		return numTurbine;
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
