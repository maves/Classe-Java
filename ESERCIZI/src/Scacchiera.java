
public class Scacchiera {

	public static void main(String[] args) {

		int lunghezza = 8;
		String bianco = "WHITE";
		String nero = "BLACK";
		String separatore = "-";
		
		boolean b = true;
		
		String output = "";
		for(int i=0; i<lunghezza*lunghezza; i++) {
			
			output += (b=!b)?bianco:nero;
			
			if(i%lunghezza < lunghezza-1)
			{
				output+= separatore;
			}
			else {
				output+= "\n";
				b = !b;
			}
		}
		
		System.out.println(output);
		
		/////////////////////////////////////////
		
		lunghezza = 8;
		nero = Character.toString ((char) 169);
		bianco = Character.toString ((char) 215);;
		separatore = "*";
		
		
		output = "";
		for(int i=0; i<lunghezza*lunghezza; i++) {
			
			output += (b=!b)?bianco:nero;
			
			if(i%lunghezza < lunghezza-1)
			{
				output+= separatore;
			}
			else {
				output+= "\n";
				b = !b;
			}
		}
		 
		System.out.println(output);
		System.out.println();
		System.out.println();
		
//		for(int i=0; i<300; i++) {
//			
//			String s = Character.toString ((char) i);
//			System.out.println(i + ": " + s);
//		}
//		
		

	}

}
