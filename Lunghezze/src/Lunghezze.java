import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lunghezze {
	
	public static void main(String [] args) {
		
		if(Character.isUpperCase('i')) System.out.println("ies");
		
		Scanner input = new Scanner(System.in);
		
		int maxEl = 5;
		String [] lista = new String[maxEl];
		
		int counter = 0;
		
		while(true) {
			
			if(counter >= maxEl) {
				System.out.println("Hai raggiunto il massimo di parole inseribili.. Calcolo in corso..");
				break;
			}
			
			System.out.println("Inserisci una parola (MAX "
					+ (maxEl-counter) + ") o premi invio per eseguire il calcolo..");

			String parola = input.nextLine();
			
			if(parola.length() == 0) break;
			
			lista[counter] = parola;
			
			counter++;
			
		}
		
		input.close();
		
		int totCharsUpperCaseWordsMetodo1 = 0;
		int totCharsUpperCaseWordsMetodo2 = 0;
		int totCharsUpperCaseWordsMetodo3 = 0;
		int totCharsUpperCaseWordsMetodo4 = 0;
		
		for(int i=0; i<counter; i++) {
			
			String parola = lista[i].trim();
			String lettera = "" + parola.charAt(0);
			char cLettera = parola.charAt(0);
			
			
			// METODO 1		meno intuitivo
			
			if(!lettera.equals(lettera.toLowerCase()))
				totCharsUpperCaseWordsMetodo1 += parola.length();
			
			// METODO 2		più logico
			
			if(cLettera >= 'A' && cLettera <= 'Z')
				totCharsUpperCaseWordsMetodo2 += parola.length();
			
			// METODO 3		più semplice
			
			if(Character.isUpperCase(cLettera))
				totCharsUpperCaseWordsMetodo3 += parola.length();
			
			// METODO 4		REGEX
			
			Pattern p = Pattern.compile("^[A-Z]");
		    Matcher m = p.matcher(parola);
			
			if(m.find())
				totCharsUpperCaseWordsMetodo4 += parola.length();
		}
		
		System.out.print("Metodo 1: ");
		System.out.println(totCharsUpperCaseWordsMetodo1);
		
		System.out.print("Metodo 2: ");
		System.out.println(totCharsUpperCaseWordsMetodo2);
		
		System.out.print("Metodo 3: ");
		System.out.println(totCharsUpperCaseWordsMetodo3);
		
		System.out.print("Metodo 4: ");
		System.out.println(totCharsUpperCaseWordsMetodo4);
		
		
	}

}
