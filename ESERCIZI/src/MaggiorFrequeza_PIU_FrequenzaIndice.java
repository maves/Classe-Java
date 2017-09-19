
public class MaggiorFrequeza_PIU_FrequenzaIndice {
	public static void main(String[] args) {
		
		int[] arr = MarzioUtil.getInts("Inserisci un vettore di interi separati da uno spazio.");
		
		// cerco indice massimo
		int max = 0;
		
		for(int el: arr)
			if(el>max) max = el;
		
		int[] res = new int[max+1];
		
		for (int i = 0; i <= max; i++) {
			
			int occorrenze = 0;
			
			for(int el: arr)
				if(el == i)	occorrenze++;
			
			res[i] = occorrenze;
		}
		
		max = 0;
		for (int i = 0; i < res.length; i++) {
			
			System.out.println(i + ": " + res[i]);
			
			if(res[i]>max) max = res[i];
			
		}
		
		System.out.println("L'elemento che si presenta con maggior frequenza è: " + max);
	}
}
