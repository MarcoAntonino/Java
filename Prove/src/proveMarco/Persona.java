package proveMarco;

public class Persona {
	
	private String nome;
	private String cognome;
	
	public Persona() {
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		if (cognome.length()<2){
			System.out.println("Errore: il cognome deve essere di almeno 2 lettere");
			System.exit(0);
		}else
			this.cognome = cognome;
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
		if (cognome.length()<2){
			System.out.println("Errore: il cognome deve essere di almeno 2 lettere");
			System.exit(0);			
		}else
			this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Persona [" + (nome != null ? "nome=" + nome + "\n " : "") 
				+ (cognome != null ? "Cognome=" + cognome : "")
				+ "]";
	}
	
	

	
	

}
