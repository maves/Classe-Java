
public class Fibonacci {

	public static void main(String[] args) {

		int penultimo, ultimo, nuovo;
		int limite = 50;
		
		penultimo = 1;
		ultimo = 1;
		ultimo = 1;
		
		while (ultimo < limite) {
			System.out.println(ultimo);
			
			nuovo = penultimo+ultimo;
			penultimo = ultimo;
			
			ultimo = nuovo;
		}
		
		System.out.println("------------------");
		
		int n = 123456789;
		
		do {
			System.out.println(n%10);
			n = n/10;
			
		} while (n>0);
		
		System.out.println("Fine.");

		float a = 32;
		
		System.out.println(a%5);
	}

}
