package trasporti.veicoli;

import Persona.Persona;
import trasporti.TrazioneMotore;
import trasporti.Veicolo;
import trasporti.VeicoloAcquatico;

public class Yatch extends Veicolo implements VeicoloAcquatico, TrazioneMotore {

	public Yatch(Persona propietario, int maxPosti, int maxVelocita) {
		super(propietario, maxPosti, maxVelocita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getPotenza() {
		// TODO Auto-generated method stub
		return 4570;
	}

	@Override
	public String getTipoCarburante() {
		// TODO Auto-generated method stub
		return "Diesel";
	}

	@Override
	public String getTipoAcqua() {
		// TODO Auto-generated method stub
		return "oceano, mari e fiumi";
	}

	@Override
	public int getProfonditaMinima() {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Barca di lusso";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 3450;
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 340;
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
