
public class Prodotto {
	
	private int codice;
	private String prodotto;
	private String descrizione;
	private double prezzo;
	
	public Prodotto() {
		
	}

	public Prodotto(int codice, String prodotto, String descrizione, double prezzo) {
		this.codice = codice;
		this.prodotto = prodotto;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getProdotto() {
		return prodotto;
	}

	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", " 
				+ (prodotto != null ? "prodotto=" + prodotto + ", " : "")
				+ (descrizione != null ? "descrizione=" + descrizione + ", " : "") 
				+ "prezzo=" + prezzo + "]";
	}
	
	
	
	
	

}
