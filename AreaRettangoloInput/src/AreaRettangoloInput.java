import java.util.Scanner;

public class AreaRettangoloInput {

	public static void main(String[] args) {

		System.out.println("-----   Calcolo Area Rettangolo   -----");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci larghezza del rettangolo:");
		double larghezza = input.nextDouble();
		
		System.out.println("Inserisci altezza del rettangolo:");
		double altezza = input.nextDouble();
		
		
		
		System.out.println("L'area del rettangolo è: " + larghezza*altezza);
		
		input.close();

	}

}
