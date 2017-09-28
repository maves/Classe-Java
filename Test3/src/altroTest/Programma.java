package altroTest;

public class Programma {

	
	public static void main(String[] args) {
		
		Base base = new Base();
		System.out.println(base);
		
		base = new Derivata();			
		System.out.println(base);
		
		Derivata deri = new Derivata();
		System.out.println(deri.metodoFinal());
	}
}
