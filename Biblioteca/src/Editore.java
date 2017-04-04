
public class Editore {
	
	private String ragioneSociale;
	private String indirizzo; 
	private String telefono; 
	private String email;
	private String sitoWeb;
	
	
	
	public Editore() {
		super();
	}



	public Editore(String ragioneSociale, String indirizzo, String telefono, String email
			, String sitoWeb) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.email = email;
		this.sitoWeb = sitoWeb;
	}



	public String getRagioneSociale() {
		return ragioneSociale;
	}



	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}



	public String getIndirizzo() {
		return indirizzo;
	}



	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSitoWeb() {
		return sitoWeb;
	}



	public void setSitoWeb(String sitoWeb) {
		this.sitoWeb = sitoWeb;
	}

	
	@Override
	public String toString() {
		return "Editore [" + (ragioneSociale != null ? "ragioneSociale=" + ragioneSociale + ", " : "")
				+ (indirizzo != null ? "indirizzo=" + indirizzo + ", " : "")
				+ (telefono != null ? "telefono=" + telefono + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (sitoWeb != null ? "sitoWeb=" + sitoWeb : "") + "]";
	}
	
	
	


}
