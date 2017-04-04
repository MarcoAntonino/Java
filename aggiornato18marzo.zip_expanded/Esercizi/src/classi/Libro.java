package classi;


public class Libro {
	
	public static final double COSTO_FISSO = 5.7;
	public static final double COSTO_PER_PAGINA = 0.05;
	
	private String titolo;
	private int numPagine;
	private int annoPubbl;
	private String isbn;
	private Autore autore;
	private Editore editore;
	private double prezzo;
	
	public Libro() {
	}
	
	public Libro(String titolo, int numPagine, int annoPubbl, String isbn, 
			String nomeAutore, String cognomeAutore, String ragioneSocialeEditore) {
		this.titolo = titolo;
		autore = new Autore(nomeAutore, cognomeAutore);
		editore = new Editore (ragioneSocialeEditore);
		this.numPagine = numPagine;
		this.annoPubbl = annoPubbl;
		if (Isbn.isValid(isbn))
			this.isbn = isbn;

		setPrezzo();
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo() {
		this.prezzo = costo(numPagine);
		 
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}

	public int getAnnoPubbl() {
		return annoPubbl;
	}

	public void setAnnoPubbl(int annoPubbl) {
		this.annoPubbl = annoPubbl;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
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
	
	public double costo (int numPagine){
		
		double prezzo =0;
		
		prezzo = COSTO_FISSO+(COSTO_PER_PAGINA*numPagine);	
		
		return prezzo;
	}

	@Override
	public String toString() {
		return "Libro ["
				+ (titolo != null ? "titolo= " + titolo : "") 
				+ (numPagine != 0 ? "\n numPagine= " + numPagine : "") 
				+ (annoPubbl != 0 ? "\n annoPubbl= " + annoPubbl : "") 
				+ (isbn != null ? "\n isbn= " + isbn : "")
				+ (autore != null ? "\n autore= " + autore.AutoreIniziali() : "") 
				+ (editore != null ? "\n editore= " + editore.getRagioneSociale() : "")
				+ (prezzo != 0 ? "\n prezzo= " + prezzo : "")
				+ "]";
	}

	
	
	

}
