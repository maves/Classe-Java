
public class SoloVocali2 {
	public static void main(String[] args) {
		
		
		String[] parole = {"cello", "guitar", "violin", "double bass"}; 
		
		
		String vocali = "aàeèéiìoòuù";
		vocali += vocali.toUpperCase();
		
//		System.out.print(vocali);

		
		
		for(int p=0; p<parole.length; p++) {
			
			String parola = parole[p];
			String nuovaParola = "";
			
			for(int i=0; i<parola.length(); i++) {
				
				String lettera = String.valueOf(parola.charAt(i));
				
				if(!vocali.contains(lettera))
					nuovaParola += lettera;				
			}
			
			parole[p] = nuovaParola;
			
		}
		
//		for(String parola: parole) {
//			
//			
//			String nuovaParola = "";
//			
//			for(int i=0; i<parola.length(); i++) {
//				
//				String lettera = String.valueOf(parola.charAt(i));
//				
//				if(!vocali.contains(lettera))
//					nuovaParola += lettera;				
//			}
//			
//			parola = nuovaParola;
//
//		}
		
		
		for(String parola: parole) {
			
			System.out.println(parola);
		}
		
		
		
		
	}
}
