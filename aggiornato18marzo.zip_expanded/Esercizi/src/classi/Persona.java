package classi;
import enumeration.Sesso;

public class Persona {
	
	//attributi
	
	private String nome;
	private String cognome; // li rendo privati e utilizzo dei metodi un pò speciali
	private Data dataNascita; //per acqusiire e dare i valori
	private String luogoNascita;
	private Sesso sex;
	
	public Persona() {
	}
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona(String nome, String cognome, Data dataNascita, String luogoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.sex = sex;
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
		this.cognome = cognome;
	}

	public Data getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Data dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	
	public Sesso getSex() {
		return sex;
	}

	public void setSex(Sesso sex) {
		this.sex = sex;
	}
	
	public int eta(){
		Data oggi = new Data(3,3,2017);
		
		//22/1/1993 - Andrea - eta = 24
		//24/04/1993 - davide - eta=23
		int e=oggi.getAnno()-dataNascita.getAnno();
		
		if (dataNascita.getMese()>oggi.getMese()
				|| ((dataNascita.getMese()==oggi.getMese()
				&& dataNascita.getGiorno()>oggi.getGiorno())))
			e--;
			return e;
	}

	@Override
	public String toString() {
		return "Persona ["
				+ (nome != null ? "nome=" + nome : "")
				+ (cognome != null ? ", cognome=" +cognome : "")
				+ (dataNascita!=null ? ", datanascita=" + dataNascita : "")
				+ (luogoNascita != null ? ", luogoNascita=" + luogoNascita : "")
				+ (dataNascita != null ? ", eta()=" + eta() : "")
				+ "]";
	}
	
	

}
