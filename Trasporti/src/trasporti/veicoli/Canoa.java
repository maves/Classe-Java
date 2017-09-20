package trasporti.veicoli;

import trasporti.TrazioneAnimale;
import trasporti.Veicolo;
import trasporti.VeicoloAcquatico;

public class Canoa extends Veicolo implements VeicoloAcquatico, TrazioneAnimale {

	public Canoa(String propietario, int maxPosti, int maxVelocita) {
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
		return "supermercato";
	}

	@Override
	public int getStanchezza() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*10);
	}

	@Override
	public String getTipoAcqua() {
		// TODO Auto-generated method stub
		return "lago";
	}

	@Override
	public int getProfonditaMinima() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	protected String getTipoVeicolo() {
		// TODO Auto-generated method stub
		return "Canoa";
	}

	@Override
	protected int getPesoTrazione() {
		// TODO Auto-generated method stub
		return 100*getMaxPosti();
	}

	@Override
	protected int getPesoAbitacolo() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	protected int getNumTrazioni() {
		// TODO Auto-generated method stub
		return getMaxPosti();
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
