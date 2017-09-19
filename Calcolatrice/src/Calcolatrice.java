import java.util.Scanner;

public class Calcolatrice {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*
		System.out.println("--- Calcolatrice ---");
		
		System.out.println("Inserisci il primo numero:");
		
		double primo = input.nextDouble();
		
		System.out.println("Inserisci l'operatore:");
		
		input.nextLine();
		
		String operatore = input.nextLine();
		
		
		System.out.println("Inserisci il secondo numero:");
		
		double secondo = input.nextDouble();
		input.nextLine();
		//input.close();
		
		System.out.print(primo + " " + operatore + " " + secondo + " = ");
		
		if(operatore.equals("*")) System.out.println(primo*secondo);
		else if(operatore.equals("/")) System.out.println(primo/secondo);
		else if(operatore.equals("+")) System.out.println(primo+secondo);
		else if(operatore.equals("-")) System.out.println(primo-secondo);
		*/
		System.out.println("--- Calcolatrice 2.0 ---");
		
		while(true) {
			System.out.println("Inserisci l'operazione separando con uno spazio ");
			
			
			String espressione = input.nextLine();
			
			
			//System.out.println(espressione);
	
			String[] arr = espressione.split(" ", 3);
			
			//System.out.println(arr.length);
			
			double first = Double.parseDouble(arr[0]);
			char operator = arr[1].charAt(0);
			double second = Double.parseDouble(arr[2]);
			
			System.out.print(first + " " + operator + " " + second + " = ");		
			
			switch(operator) {
			
			case '*': System.out.println(first*second); break;
			case '/': System.out.println(first/second); break;
			case '+': System.out.println(first+second); break;
			case '-': System.out.println(first-second); break;
			case '%': System.out.println(first%second); break;
			
			default: System.out.println("Errore, operatori supportati: + - * / %");
			}
			
			System.out.println("Uscire? [si/no]");
			
			String risposta = input.nextLine();
			if(risposta.equals("si"))	break;
			
	
		} // end while
		input.close();
		System.out.println("Grazie per aver usato Calcolatrice 2.0");
		
	}
}
