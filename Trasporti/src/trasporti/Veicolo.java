package trasporti;

public abstract class Veicolo {
	
	private int maxPosti;
	private int maxVelocita;
	private String propietario;
	
	
	protected abstract String getTipoVeicolo();
	protected abstract int getPesoTrazione();
	protected abstract int getPesoAbitacolo();
	protected abstract int getNumTrazioni();
	protected abstract int getVelocitaIstantanea();
	protected abstract int getAutonomia();

	
	public Veicolo(String propietario, int maxPosti, int maxVelocita) {
		
		this.propietario = propietario;
		this.maxPosti = maxPosti;
		this.maxVelocita = maxVelocita;
	}
	
	public int maxDistanza() {
		return getVelocitaIstantanea() * getAutonomia();
	}
	
	public int getPeso() {
		return getPesoTrazione()*getNumTrazioni() + getPesoAbitacolo();
	}
	
	public String getNomeVeicolo() {
		return propietario;
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
	


	
	
	
	
}
