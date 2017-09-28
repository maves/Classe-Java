
public class Programma {
	


	public static void main(String[] args) {

		Bottiglia[] arr = new Bottiglia[5];


		arr[0] = new Bottiglia("acqua");
		arr[1] = new Bottiglia("acqua", 1000);
		arr[2] = new Bottiglia("acqua", 1000, 750);
		arr[3] = new Bottiglia("cocacola", 330);
		arr[4] = new Bottiglia("fanta");
		
		Distributore dist = new Distributore(arr);
		
		dist.controlla();
		System.out.println();
		
		dist.operazione(1, -100); dist.controlla();
		dist.operazione(1, -1800); dist.controlla();
		
		System.out.println();
		dist.operazione(3, -300); dist.controlla();
		dist.operazione(3, 450); dist.controlla();
		
		System.out.println();
		dist.operazione(2, 250);
		dist.operazione(4, -500);
		dist.controlla();
		
		
		
		
	}

}
