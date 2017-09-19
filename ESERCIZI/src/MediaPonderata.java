

import java.util.Scanner;

public class MediaPonderata {

	public static void main(String[] args) {
		
		

		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci voti");
		String sVoti = in.nextLine();
		System.out.println("Inserisci peso");
		String sPeso = in.nextLine();
		
		
		
		in.close(); 
		
		String[] arrSVoti = sVoti.split(" ");		
		int[] arrVoti = new int[arrSVoti.length];
		
		String[] arrSPeso = sPeso.split(" ");		
		int[] arrPesoVoto = new int[arrSPeso.length];
		
		for(int i=0; i< arrSVoti.length; i++) {
			
			arrVoti[i] = Integer.parseInt(arrSVoti[i]);
			arrPesoVoto[i] = Integer.parseInt(arrSPeso[i]);
		}
		
		
//		int[] arrVoti = { 27, 21, 28 };
//		int[] arrPesoVoto = { 8, 12, 4 };



		// numeratore
		double numeratore = 0;
		double denominatore = 0;
		
		for(int i=0; i<arrVoti.length; i++) {
			
//			
			numeratore += arrVoti[i] * arrPesoVoto[i];
			denominatore += arrPesoVoto[i];
		}
		
		System.out.println(numeratore/denominatore);
		
		
		

	}

}
