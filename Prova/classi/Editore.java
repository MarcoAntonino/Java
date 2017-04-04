package classi;

public class Editore {
	private String ragioneSociale;
	private Indirizzo indirizzo;
	private String telefono;
	public Editore(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	private String email;
	private String sitoWeb;
	
	public Editore() {
	}

	public Editore(String ragioneSociale, Indirizzo indirizzo, String telefono, String email, String sitoWeb) {
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

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
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
		return "Editore ["
				+ (ragioneSociale != null ? "ragioneSociale=" + ragioneSociale : "") 
				+ (indirizzo != null ? "\n indirizzo=" + indirizzo : "") 
				+ (telefono != null ? "\n telefono=" + telefono : "")
				+ (email != null ? "\n email=" + email : "") 
				+ (sitoWeb != null ? "\n sitoWeb=" + sitoWeb : "") 
				+ "]";
	}
	
	
	
	

}
