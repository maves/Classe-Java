
public class testSitoMarzio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ricercatore s = new Ricercatore("http://www.pmichaud.com/");
		Ricercatore s = new Ricercatore("http://www.armoniaolistica.it/");
		s.start();
		
		System.out.println("------------ PAROLE ------------");		
		System.out.println("Numero parole: " + s.parole.size());
		System.out.println(s.parole);
		System.out.println("------------ INDIRIZZI ------------");
		System.out.println("Numero indirizzi analizzati: " + s.indirizzi.size());
		System.out.println(s.indirizzi);
		
//		boolean res = s.stessoDominio("http://rakudo.org/");
//		System.out.println(res);
	}

}
