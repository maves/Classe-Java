import java.util.ArrayList;

public class Studente extends Professione{

	String facolta;
	ArrayList<Corso> corsi;
	static int generatoreMatricola;
	int matricola;
	
	public Studente(String facolta) {
		super("Studente", 0);
		corsi = new ArrayList<Corso>();
		this.facolta = facolta;
		
		matricola = generatoreMatricola++;
		
	}
	
	
	
	public void impara(String corso) {		
		
		for(Corso el: corsi) {
			if(el.nome.equals(corso)) {
				System.out.println(" sta imparando " + corso);
				return;
			}
		}
		System.out.println(" non dovrebbe imparare " + corso);
	}
	
	public void iscrizioneCorso(Corso c) {
		corsi.add(c);
	}

	
}