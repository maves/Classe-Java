import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		
		
		String l = "N";
		if( l.equals(l.toUpperCase()))
			System.out.println(true);
		else
			System.out.println(false);
		
		if( !l.equals(l.toLowerCase()))
			System.out.println(true);
		else
			System.out.println(false);
		

		Scanner input = new Scanner(System.in);
		
		// La mamma di mia zia è mia nonna! Àh! Non ci avevo mai pensato..
		String frase = input.nextLine();
		input.close();
		
		String vocali = "aàeèéiìoòuù";
		vocali += vocali.toUpperCase();
		
		int numLettere = frase.length();
		
		
		System.out.println();
		System.out.println();
		System.out.println("Lettere al contrario:");
		
		for(int i=numLettere-1; i>=0; i--){	
			String lettera = String.valueOf(frase.charAt(i));			
			System.out.print(lettera);			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Lettere maiuscole al contrario:");
		
		for(int i=numLettere-1; i>=0; i--) {		
			String lettera = String.valueOf(frase.charAt(i));
			
			
			//if( lettera.equals(lettera.toUpperCase())) System.out.print(lettera);			
			if( !lettera.equals(lettera.toLowerCase())) System.out.print(lettera);
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Lettere minuscole al contrario:");
		
		for(int i=numLettere-1; i>=0; i--) {		
			String lettera = String.valueOf(frase.charAt(i));
			
					
			//if( lettera.equals(lettera.toLowerCase())) System.out.print(lettera);			
			if( !lettera.equals(lettera.toUpperCase())) System.out.print(lettera);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Vocali al contrario:");
		
		
		for(int i=numLettere-1; i>=0; i--) {			
			String lettera = String.valueOf(frase.charAt(i));			
			if( vocali.contains(lettera) ) System.out.print(lettera);			
		}
		
		// La mamma di mia zia è mia nonna! Àh! Non ci avevo mai pensato..
	}

}
