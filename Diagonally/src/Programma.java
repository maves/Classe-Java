import java.util.Scanner;

public class Programma {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una parola da visualizzare in diagonale..");
		String parola = input.nextLine();
		input.close();
		
		for (int i = 0; i < parola.length(); i++) {
			
			String lettera = String.valueOf(parola.charAt(i));
			
			for(int spazi=0; spazi < i; spazi++ ) {
				System.out.print(" ");
			}
				
			System.out.println(lettera);
				
			
		}
		

	}

}
