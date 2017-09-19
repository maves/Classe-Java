
public class Programma {

	public static void main(String[] args) {
		
		Libro l = new Libro();
		
		l.titolo = "La Divina Commedia";
		l.autore = "Dante";
		l.numeroPagine= 200;
		
		System.out.println(l.descrizione());
		l.titolo = "La Divina Tragedia";
		System.out.println(l.descrizione());
		l.dimezzaPagine();
		System.out.println(l.descrizione());
		l.aggiungiPagine(5);
		System.out.println(l.descrizione());
		
		CasaEditrice ce = new CasaEditrice();
		ce.nome = "Salani";
		ce.citta = "Bologna";
		
		l.editrice = ce;
		l.cambiaCitta("Milano");
		
		CasaEditrice nuovaCe = new CasaEditrice();
		nuovaCe.nome = "Adelphi";
		
		l.cambiaCasaEditrice(nuovaCe);
		
		l.cambiaTutto("Pagliacci Divini", "Sbirulino", 666);
		
		System.out.println(l.descrizione());

	}

}
