package Persona;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class GeneratorePersone {

	static String [] cognomi;
	static String [] nomi;
	
//	static final String path = "P:/eclipse-workspace/GeneratorePersone/src/Persona/";
	static final String path = "P:/eclipse-workspace/GestioneTeatro/src/Persona/";
	static final String fnCognomi = path + "dbCognomi.txt";
	static final String fnNomi = path + "dbNomi.txt";
	
	static int numCognomi;
	static int numNomi;
	
	public GeneratorePersone(){
		
		try {
			
			ArrayList<String> arrCognomi = new ArrayList<String>();
			File file = new File(fnCognomi);
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
	        String line = reader.readLine();
	        while(line!=null) {
//	            System.out.println(line);
	            line = reader.readLine();	    
//	            line = line.substring(0, 1).toUpperCase() + line.substring(1);
//	            System.out.println(line);
	            if(line != null) {

	            	arrCognomi.add(line);	
	            }            
	                        
	        }			
	        
	        
	        ArrayList<String> arrNomi = new ArrayList<String>();			
			reader = new BufferedReader(new FileReader(fnNomi));
	        line = reader.readLine();
	        while(line!=null) {
//	            ;
	            line = reader.readLine();
	            if(line != null) {
//	            	line = line.substring(0, 1).toUpperCase() + line.substring(1);
		            arrNomi.add(line);	
	            }
	                        
	        }		
	        
	        cognomi = new String[arrCognomi.size()];
	        cognomi =  (String[]) arrCognomi.toArray(cognomi);
	        nomi = new String[arrNomi.size()];
	        nomi = (String[]) arrNomi.toArray(nomi);
	        
	        numCognomi = cognomi.length;
	    	numNomi = nomi.length;
	    	
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static String nomeCasuale() {
		
		
		return Persona.formattaNome( nomi[ (int)(Math.random()*numNomi)-1 ] );
	}
	
	public static String cognomeCasuale() {
		return Persona.formattaNome(cognomi[ (int)(Math.random()*numCognomi)-1 ]);
	}
	
	public static Persona genera() {
//		System.out.println((int)(Math.random()*numCognomi));
		String cognome = cognomeCasuale();
		String nome = nomeCasuale();
		
		Date now = new Date();
		long milli = (long)( now.getTime() * Math.random() );
		Date data = new Date(milli);
		
		
		
		
		
//		return new Persona(nome, cognome, "10/06/1984");
		return new Persona(nome, cognome, data);
		
	}
	
	

	
	
}


