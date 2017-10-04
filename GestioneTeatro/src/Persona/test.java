package Persona;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] gente = new Persona[100];
		GeneratorePersone gp = new GeneratorePersone();
		
		for(int i=0; i<gente.length; i++) {
			
			gente[i] = GeneratorePersone.genera();
//			gente[i] = gp.genera();
			System.out.println(gente[i]);
		}
	}

}
