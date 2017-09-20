package trasporti.veicoli;

import trasporti.Veicolo;
import trasporti.VeicoloAereo;

public class Aliante extends Veicolo implements VeicoloAereo{

	public Aliante(String propietario, int maxPosti, int maxVelocita) {
		super(propietario, maxPosti, maxVelocita);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Aereo";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getNumTrazioni() {
		// TODO Auto-generated method stub
		return 0;
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

	@Override
	public int getAltezza() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

}
