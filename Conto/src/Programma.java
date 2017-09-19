
public class Programma {

	public static void main(String[] args) {


		Conto contoMarzio = new Conto("Marzio", 9999.99);
		Conto contoFabio = new Conto("Fabio", 100);
		Conto contoAntonio = new Conto("Antonio", 1000);
		
		System.out.println(contoMarzio.resoconto());
		System.out.println(contoFabio.resoconto());
		System.out.println(contoAntonio.resoconto());
		
		contoMarzio.versamento(100);
		contoFabio.versamento(1);
		contoAntonio.versamento(10);
		
		System.out.println(contoMarzio.resoconto());
		System.out.println(contoFabio.resoconto());
		System.out.println(contoAntonio.resoconto());
		
		contoMarzio.prelievo(10);
		contoFabio.prelievo(1);
		contoAntonio.prelievo(100);
		
		System.out.println(contoMarzio.resoconto());
		System.out.println(contoFabio.resoconto());
		System.out.println(contoAntonio.resoconto());
		
		double costoGelato = 10;
		
		if(contoFabio.getTotale() >= costoGelato) {
			contoFabio.prelievo(costoGelato);
			System.out.println("Fabio mangia il gelato");
		}else {
			System.out.println("Fabio guarda gli altri mangiare il gelato.");
		}
			
		
		

	}

}
