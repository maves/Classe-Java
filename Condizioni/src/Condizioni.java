
public class Condizioni {

	public static void main(String[] args) {

		int eta = 19;
		
		if(eta>=18) {
			System.out.println("Sei maggiorenne");
			
			if(eta>25) System.out.println("Ammesso voto Senato");
			else System.out.println("Non ammesso voto Senato");
		}else {
			System.out.println("Sei minorenne");
		}
		
		print("----------------------");
		
		switch(eta) {
		
		
			
		case 1:
			print("neonato");
			break;
		case 2:
			print("vaccino");
			break;
		case 3:
			print("Età materna");
			break;
		case 6:
			print("età elementari");
			break;
		default:
			print("Valore non considerato");
			
		}

		
	}
	
	static void print(String s) {
		System.out.println(s);
	}

}
