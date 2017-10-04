
public class Sala {
	
	String nome;
	int numeroPosti;
	
	int[] postiInFila = {8,10,10,15,20};
	int numFile;
	
	
	public Sala(String nome) {
		super();
		this.nome = nome;	
		
		numFile = postiInFila.length;
		this.numeroPosti = calcolaNumeroPosti();
	}
	
	public Sala(String nome, int[] postiInFila) {
		super();
		this.nome = nome;		
		this.postiInFila = postiInFila;
		this.numeroPosti = calcolaNumeroPosti();
		numFile = postiInFila.length;
	}
	
	public int calcolaNumeroPosti(){
		int counter = 0;
		for(int posti: postiInFila)
			counter += posti;
		return counter;
	}
	
	public int getCodicePosto(int fila, int numero) {
		
		if(fila<0 || fila >= postiInFila.length) {
			System.out.println("(Sala) ERRORE: Fila non esistente!");
			return -1;
		}
		if(numero<0 || numero >= postiInFila[fila]) {
			System.out.println("(Sala) ERRORE: Numero non esistente!");
			return -1;
		}
		
		
		int codice = 0;
		for(int f=0; f<postiInFila.length; f++) {
			for(int n=0; n<postiInFila[f]; n++) {
				if(f == fila && n == numero)
					return codice;
				codice++;
			}
			
		}
		
		System.out.println("(Sala->getCodicePosto) ERRORE: Qualcosa è andato storto!");
		return -1;
	}
	
	public int getNumeroPosti() {
		return numeroPosti;
	}

	public int getNumFile() {
		return numFile;
	}
	
	public int getNumPostiInFila(int i) {
		return postiInFila[i];
	}
	
	public String toString() {
		return nome + " " + numeroPosti;
	}
	
}
