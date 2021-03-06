import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Libro {
	
	public static final double COSTO_FISSO = 7.5;
	public static final double COSTO_PER_PAGINA = 0.05;
	
	private String titolo;
	private int isbn;
	private ArrayList<Autore> autori;
	private Editore editore;
	private int numPagine;
	private int annoPubb;
	private Posizione posizione;
	private StatoLibro statoLibro;
	
	public Libro() {
		
	}

	public Libro(String titolo, int isbn, ArrayList<Autore> autori, Editore editore, int numPagine, int annoPubb,
				Posizione posizione, StatoLibro statoLibro) {
		this.titolo = titolo;
		this.isbn = isbn;
		this.autori = autori;
		this.editore = editore;
		this.numPagine = numPagine;
		this.annoPubb = annoPubb;
		this.posizione = posizione;
		this.statoLibro = statoLibro;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	
	public ArrayList<Autore> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autore> autori) {
		this.autori = autori;
	}

	public Editore getEditore() {
		return editore;
	}

	public void setEditore(Editore editore) {
		this.editore = editore;
	}

	public int getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}

	public int getAnnoPubb() {
		return annoPubb;
	}

	public void setAnnoPubb(int annoPubb) {
		this.annoPubb = annoPubb;
	}

	public Posizione getPosizione() {
		return posizione;
	}

	public void setPosizione(Posizione posizione) {
		this.posizione = posizione;
	}

	public StatoLibro getStatoLibro() {
		return statoLibro;
	}

	public void setStatoLibro(StatoLibro statoLibro) {
		this.statoLibro = statoLibro;
	}
	
	public void StatoLibro(){
		
		switch (statoLibro) {
		case DISPONIBILE:
			System.out.println("Il libro � disponibile e la sua posizione � " + posizione);
			
			break;
		case PRESTATO:
			System.out.println("Il libro � attualmente in prestito");
			
			break;
		case SMARRITO:
			System.out.println("Oh no! Il libro � stato smarrito");
		default:
			break;
		}
	}

	@Override
	public String toString() {
		String msg="";
		msg+="titolo: " + titolo 
		   + "\nautori: ";
		
		//guarda come si fa a chiamare un metodo dentro a un foreach
		for (Autore o: autori)
			msg+=o.nomimativoAutore()+" ";
		
		msg+="\neditore: " + editore.getRagioneSociale()
		   + "\nanno pubblicazione: " + annoPubb
		   + "\nnum. pagine: " + numPagine 
		   + "\nisbn: " + isbn
		   + "\ncosto stampa: " + costoStampa(numPagine)
		   + "\nStato: " + statoLibro;
		
		return msg;
	}

	public double costoStampa(int numPagine) {
		
		double costoTot;
		
		costoTot = (double)numPagine*COSTO_PER_PAGINA+COSTO_FISSO;
		
		return costoTot;
	}

	
	
	
	
	
	

}
