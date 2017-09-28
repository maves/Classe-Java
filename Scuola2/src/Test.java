import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		
		Persona marzio = new Persona("Marzio", "Marino", "10/06/1984");
		
		Studente studenteMarzio = new Studente("Informatica"); // facoltà informatica
		
		marzio.addProfessione(studenteMarzio);
		
		Persona giovanni = new Persona("Giovanni", "non lo so", "01/01/1254");
		Studente studenteGiovanni = new Studente("Informatica");
		giovanni.addProfessione(studenteGiovanni);
		
		int matricola = ((Studente)(marzio.getProfessione("Studente"))).matricola;
		System.out.println("Matricola marzio: " + matricola);
		matricola = ((Studente)(giovanni.getProfessione("Studente"))).matricola;
		System.out.println("Matricola giovanni: " + matricola);
		
		
		Corso java = new Corso("Java", 30);
		
		((Studente)(marzio.getProfessione("Studente"))).iscrizioneCorso(java);
		
		
		Docente docenteJava = new Docente(java);
		
		Persona antonio = new Persona("Antonio", "Lezzi", "29/02/1981");
		
		antonio.addProfessione(docenteJava);
				
		System.out.print(antonio);
		((Docente)(antonio.getProfessione("Docente"))).insegna("Java");
		
		System.out.print(marzio);
		((Studente)(marzio.getProfessione("Studente"))).impara("Java");
		
		
		
		System.out.println("Marzio ha superato l'esame ed ora vuole insegnare java");
		
		marzio.addProfessione(docenteJava);
		
		System.out.print(marzio);
		((Docente)(marzio.getProfessione("Docente"))).insegna("Java");
		
		
		
//		Class c = Docente.class;
//        Method[] m = c.getDeclaredMethods();
//        for (int i = 0; i < m.length; i++)
//        System.out.println(i+" "+m[i].toString());
		
		marzio.azione("Docente", "insegna", "Java");
		
		
	}

}
