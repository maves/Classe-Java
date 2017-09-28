
public class Distributore {
	
	private Bottiglia[] deposito = new Bottiglia[5];
	
	Distributore(Bottiglia[] arr) {
		deposito = arr;
	}
	
	public void operazione(int i, int qta) {
		
		if(qta==0 || i>=5) {
			System.out.println("Non è colpa mia se tu sei..");
			return;
		}
		
		Bottiglia bott = deposito[i];
		int res = (qta>0) ? bott.riempi(Math.abs(qta)) : bott.bevi(Math.abs(qta));
		
		String out;
		
		if(res != Math.abs(qta)) {
			
			out = "Attenzione la bottiglia numero " + i + " è " +
						 ( (qta>0) ? "piena" : "vuota") +
						 "!! Ho " +
						 ( (qta>0) ? "aggiunto" : "tolto") +
						 " solo " + res + " su " + Math.abs(qta) +
						 " ml di " + bott.getContenuto();
		}else {
			out = "Ho " + ( (qta>0) ? "aggiunto " : "tolto ") +
					     res + " ml di " + bott.getContenuto() +
					     " alla bottiglia numero " + i;
			
			if(bott.getQuantita() == bott.getDimensione())
				out += ", ora la bottiglia è piena!";
			
			if(bott.getQuantita() == 0)
				out += ", ora la bottiglia è vuota!";
		}
		
		
		
		
		System.out.println(out);
	}
	
	void controlla() {
		
		for(Bottiglia el: deposito)
			System.out.print(el+" ");
		
		System.out.println();
	}
}
