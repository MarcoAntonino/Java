package classi;

public class Autore {
	
	private String nome;
	private String cognome;
	private String luogoNascita;
	private Data dataNascita;
	private String luogoMorte;
	private Data dataMorte;
	
	public Autore() {
		
	}
	
	
	public Autore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}



	public Autore(String nome, String cognome, String luogoNascita, int giornoNascita, int meseNascita, int annoNascita, String luogoMorte,
			int giornoMorte, int meseMorte, int annoMorte) {
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.dataNascita = new Data(giornoNascita, meseNascita, annoNascita);
		this.luogoMorte = luogoMorte;
		this.dataMorte = new Data(giornoMorte, meseMorte, annoNascita);
	}

	public Autore(String nome, String cognome, String luogoNascita, String luogoMorte) {
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.luogoMorte = luogoMorte;
	}
	
	//generatore per autori vivi
	public Autore(String nome, String cognome, String luogoNascita, Data dataNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.luogoNascita = luogoNascita;
		this.dataNascita = dataNascita;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Data getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Data dataNascita) {
		this.dataNascita = dataNascita;
	}

	public Data getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(Data dataMorte) {
		this.dataMorte = dataMorte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getLuogoMorte() {
		return luogoMorte;
	}

	public void setLuogoMorte(String luogoMorte) {
		this.luogoMorte = luogoMorte;
	}
	
	public boolean inVita(){
		if (dataMorte == null)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public String AutoreIniziali() {
		String iniziali;
		String nome;
		nome = getNome();
		iniziali = nome.substring(0, 1) + " " + getCognome();
		
		
		
		
		return iniziali;
	}
	
	
	@Override
	public String toString() {
		return "Autore ["
				+ (nome != null ? "nome= " + nome : "") 
				+ (cognome != null ? "\n cognome= " + cognome : "" )
				+ (luogoNascita != null ? "\n luogoNascita= " + luogoNascita : "") 
				+ (dataNascita != null ? "\n dataNascita= " + dataNascita : "")
				+ (luogoMorte !=null ? "\n luogoMorte= " + luogoMorte : "")
				+ (dataMorte != null ? "\n dataMorte= " + dataMorte : "") 
				+ "]";
	}
	
	
	
	
	

}
