import java.util.concurrent.TimeUnit;

public class Programma2 {

	public static void main(String[] args) throws InterruptedException {

		int numLamp = 100;
		
		Lampadina [] arrLamp = new Lampadina[numLamp];
		
		for(int i=0; i<numLamp; i++) {			
			arrLamp[i] = new Lampadina();			
		}
		
		for(int c=0; c<135; c++) {
			
			for(int i=0; i<numLamp; i++) {
				arrLamp[i].inverti();
				arrLamp[i].rappresentazioneGrafica();
				
			}
			
			System.out.println();
			TimeUnit.MILLISECONDS.sleep(20);
				
		}

	}

}
