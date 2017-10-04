package Persona;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
	private String nome;
	private String cognome;
	private Date dataDiNascita;
	
	public Persona(String nome, String cognome, String dataDiNascita) {
		super();
		this.nome = formattaNome(nome);
//		System.out.println(cognome);
		this.cognome = formattaNome(cognome);
		
		
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.dataDiNascita = dt.parse(dataDiNascita);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Persona(String nome, String cognome, Date dataDiNascita) {
		super();
		this.nome = formattaNome(nome);
//		System.out.println(cognome);
		this.cognome = formattaNome(cognome);
		
		this.dataDiNascita = dataDiNascita;
		
	}
	public static String formattaNome(String s) {
		s = s.trim();
		String[] nomi = s.split(" ");
		String out = "";
		
		for(int i=0; i<nomi.length; i++) {
			out += nomi[i].substring(0, 1).toUpperCase() + nomi[i].substring(1);;
			if(i+1<nomi.length) out += " ";
		}
		
		return out;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	
	@SuppressWarnings("deprecation")
	public String toString() {
		Date d = this.dataDiNascita;
		return nome + " " + cognome + " " + d.getDate() + "/" + d.getMonth() + "/" +(d.getYear()+1900);
	}
	
	
}
