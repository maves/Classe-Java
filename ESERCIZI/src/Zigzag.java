import java.util.Scanner;

public class Zigzag {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una serie di numeri separati da uno spazio");
		String s = in.nextLine();
		
		in.close(); 
		
		String[] arrString = s.split(" ");
		
		int[] arrInt = new int[arrString.length];
		
		for(int i=0; i< arrString.length; i++) {
			
			arrInt[i] = Integer.parseInt(arrString[i]);
		}
		

		int length = arrInt.length;
		System.out.println(" ");
		
		for(int i= 0; i< length/2 ; i++) {
			
			System.out.print(arrInt[i] + " ");
			System.out.print(arrInt[length-i-1] + " ");
			
		}
		

		if(length%2>0) System.out.print(arrInt[length/2]);
		
		
		

	}

}
