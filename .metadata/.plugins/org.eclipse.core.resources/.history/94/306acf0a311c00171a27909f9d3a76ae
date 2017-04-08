import java.util.GregorianCalendar;

public class Libro {
	
	public static final double COSTO_FISSO = 7.5;
	public static final double COSTO_PER_PAGINA = 0.05;
	
	private String titolo;
	private int isbn;
	private Autore autore;
	private Editore editore;
	private int numPagine;
	private int annoPubb;
	
	public Libro() {
		
	}

	public Libro(String titolo, int isbn, Autore autore, Editore editore, int numPagine, int annoPubb) {
		this.titolo = titolo;
		this.isbn = isbn;
		this.autore = autore;
		this.editore = editore;
		this.numPagine = numPagine;
		this.annoPubb = annoPubb;
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

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
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

	@Override
	public String toString() {
		return "Libro [" + (titolo != null ? "titolo=" + titolo + ", " : "") + "isbn=" + isbn + ", "
				+ (autore != null ? "autore=" + autore.nomimativoAutore() + ", " : "")
				+ (editore != null ? "editore=" + editore.getRagioneSociale() + ", " : "") + "numPagine=" + numPagine + ", annoPubb="
				+ annoPubb + "]";
	}
	
	
	
	
	

}
