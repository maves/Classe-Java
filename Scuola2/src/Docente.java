import java.util.ArrayList;

public class Docente extends Professione{

	ArrayList<Corso> corsi;
	
	public Docente(Corso c) {
		super("Docente", 2000);
		corsi = new ArrayList<Corso>();
		corsi.add(c);
	}
	
	public Docente() {
		super("Docente", 2000);
		corsi = new ArrayList<Corso>();
	}
	
	public void insegna(String corso) {		
		
		for(Corso el: corsi) {
			if(el.nome.equals(corso)) {
				System.out.println(" sta insegnando " + corso);
				return;
			}
		}
		System.out.println(" non dovrebbe insegnare " + corso);
	}

	
}
