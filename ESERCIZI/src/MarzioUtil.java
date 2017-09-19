import java.util.Scanner;

public class MarzioUtil {

	static int[] getInts(String domanda, String separatore) {
		
		Scanner in = new Scanner(System.in);		
		System.out.println(domanda);		
		String res = in.nextLine();		
		in.close(); 		
		String[] arrS = res.split(separatore);		
		int[] arrInt = new int[arrS.length];			
		for(int i=0; i< arrS.length; i++) {			
			arrInt[i] = Integer.parseInt(arrS[i]);			
		}
		return arrInt;
	}
	
	static int[] getInts(String domanda) { // separatore " "
		
		Scanner in = new Scanner(System.in);		
		System.out.println(domanda);		
		String res = in.nextLine();		
		in.close(); 		
		String[] arrS = res.split(" ");		
		int[] arrInt = new int[arrS.length];			
		for(int i=0; i< arrS.length; i++) {			
			arrInt[i] = Integer.parseInt(arrS[i]);			
		}
		return arrInt;
	}
	
	static String[] getStrings(String domanda, String separatore) {
		
		Scanner in = new Scanner(System.in);		
		System.out.println(domanda);		
		String res = in.nextLine();		
		in.close(); 		
		String[] arrS = res.split(separatore);		
		
		return arrS;
	}
	static String[] getStrings(String domanda) { // separatore " "
		
		Scanner in = new Scanner(System.in);		
		System.out.println(domanda);		
		String res = in.nextLine();		
		in.close(); 		
		String[] arrS = res.split(" ");		
		
		return arrS;
	}
	
	static void printInts(int[] arr, boolean acapo) {
		
		for(int el: arr) {
			if(acapo)
				System.out.println(el);
			else
				System.out.print(el + " ");
		}		
	}
	
	static void printStrings(String[] arr, boolean acapo) {
		
		for(String el: arr) {
			if(acapo)
				System.out.println(el);
			else
				System.out.print(el + " ");
		}		
	}
}
