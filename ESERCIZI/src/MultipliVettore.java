import java.util.Scanner;

public class MultipliVettore {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una serie di numeri separati da uno spazio");
		String s = in.nextLine();
		System.out.println("Inserisci un numero");
		String n = in.nextLine();
		
		int numero = Integer.parseInt(n);
		
		in.close(); 
		
		String[] arrString = s.split(" ");
		
		int[] arrInt = new int[arrString.length];
		
		for(int i=0; i< arrString.length; i++) {
			
			arrInt[i] = Integer.parseInt(arrString[i]);
		}
		
//		int[] arrInt = { 1, 2, 3, 4 };
//		int numero = 12;
		
//		int[] arrInt = { 3, 4 };
//		int numero = 17;

		boolean dividendo = false;
		
		for(int i=0; i<arrInt.length; i++) {
			
//			System.out.println(numero);
//			System.out.println(arrInt[i]);
			if( numero % arrInt[i] == 0) {
				
				dividendo = true;
				System.out.print("True");
				break;
			}
			
		}
		
		if(!dividendo) System.out.println("False");
		
		
		

	}

}
