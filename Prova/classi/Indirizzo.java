package classi;

public class Indirizzo {
	private String nomeVia;
	private String civicoVia;
	private int cap;
	private String citta;
	private String provincia;
	private String nazione;
	
	public Indirizzo() {
	}

	
	public Indirizzo(String nomeVia, String civicoVia, int cap, String citta, String provincia, String nazione) {
		this.nomeVia = nomeVia;
		this.civicoVia = civicoVia;
		this.cap = cap;
		this.citta = citta;
		this.provincia = provincia;
		this.nazione = nazione;
	}

	public String getNomeVia() {
		return nomeVia;
	}

	public void setNomeVia(String nomeVia) {
		this.nomeVia = nomeVia;
	}

	public String getCivicoVia() {
		return civicoVia;
	}

	public void setCivicoVia(String civicoVia) {
		this.civicoVia = civicoVia;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getCitta() {
		return citta;
	}



	public void setCitta(String citta) {
		this.citta = citta;
	}



	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}


	@Override
	public String toString() {
		return "Indirizzo ["
				+ (nomeVia != null ? "nomeVia= " + nomeVia : "") 
				+ (civicoVia != null ? ", civicoVia= " + civicoVia : "") 
				+ (cap != 0 ? ", cap=" + cap : "")
				+ (citta != null ? ", citta=" + citta : "")
				+ (provincia != null ? ", provincia=" + provincia : "") 
				+ (nazione != null ? ", nazione=" + nazione : "")
				+ "]";
	}

	
	
	

}
