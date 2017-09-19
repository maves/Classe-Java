
public class SoloVocali {
	public static void main(String[] args) {
		
		
		String frase = "La mamma di mia zia è mia nonna! Àh! Non ci avevo mai pensato..";
		
		
		String vocali = "aàeèéiìoòuù";
		vocali += vocali.toUpperCase();
//		System.out.print(vocali);
		
		for(int i=0; i<frase.length(); i++)
		{
			String lettera = String.valueOf(frase.charAt(i));
			
			if( vocali.contains(lettera) )
				System.out.print(lettera);
			
		}
		
		
	}
}
