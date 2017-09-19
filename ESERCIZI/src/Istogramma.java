
public class Istogramma {
	
	public static void main(String[] args) {
		
		int[] arr = MarzioUtil.getInts("Inserisci un vettore di interi separati da uno spazio.");
		
		for(int el: arr) {
			for (int i = 0; i < el; i++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
