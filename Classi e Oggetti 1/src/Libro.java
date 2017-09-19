
public class Libro {
	
	String titolo;
	String autore;
	int numeroPagine;
	CasaEditrice editrice;

	String descrizione() {
		
		return "[Tit: " + titolo + " | Aut: " + autore +
				" | Pag: " + numeroPagine + "]";
		
	}
	
	void dimezzaPagine() {
		numeroPagine /= 2;
						
	}
	
	void aggiungiPagine(int pagine) {
		numeroPagine += pagine;
	}

	void cambiaCitta(String nuovaCitta) {
		editrice.citta = nuovaCitta;
	}
	
	void cambiaCasaEditrice(CasaEditrice ce) {
		editrice = ce;
	}
	
	void cambiaTutto(String nuovoTitolo, String nuovoAutore, int nuovePagine) {
		titolo = nuovoTitolo;
		autore = nuovoAutore;
		numeroPagine = nuovePagine;
	}
	
}
