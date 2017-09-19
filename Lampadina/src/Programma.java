
public class Programma {

	public static void main(String[] args) {

		
		Lampadina lamp = new Lampadina();
		
		System.out.println(lamp.VITA_LAMPADINA);
		
		System.out.println(lamp.info());		
		lamp.accendi();
		System.out.println(lamp.info());		
		lamp.spegni();
		System.out.println(lamp.info());		
		lamp.inverti();
		System.out.println(lamp.info());		
		lamp.inverti();
		System.out.println(lamp.info());		
//		lamp.rompi();
//		System.out.println(lamp.info());		
//		lamp.accendi();
//		System.out.println(lamp.info());		
//		lamp.spegni();
//		System.out.println(lamp.info());		
//		lamp.inverti();
//		System.out.println(lamp.info());
		
		for(int i=0; i<99; i++) {
			lamp.inverti();
			System.out.println(lamp.info());
		}
		
		System.out.println("\n\n * * * Sei al buio * * *");
	}

}
