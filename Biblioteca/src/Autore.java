import java.util.Calendar;
import java.util.GregorianCalendar;

public class Autore {
	
	private String nome;
	private String cognome;
	private GregorianCalendar dataNascita;
	private String luogoNascita;
	private GregorianCalendar dataMorte;
	private String luogoMorte;
	
	public Autore() {
		
	}

	public Autore(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita,
			GregorianCalendar dataMorte, String luogoMorte) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.dataMorte = dataMorte;
		this.luogoMorte = luogoMorte;
	}
	
	//costruttore per autori vivi
	public Autore(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
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

	public GregorianCalendar getDataNascita() {
		
		return dataNascita;
	}

	public void setDataNascita(GregorianCalendar dataNascita) {
		
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public GregorianCalendar getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(GregorianCalendar dataMorte) {
		this.dataMorte = dataMorte;
	}

	public String getLuogoMorte() {
		return luogoMorte;
	}

	public void setLuogoMorte(String luogoMorte) {
		this.luogoMorte = luogoMorte;
	}
	
	public boolean isVivo(){
		if (dataMorte==null)
				return true;
		else
			return false;
	}
	
	public String nomimativoAutore(){
		String inizialeNome;
		String nome;
		String nominativo;
		nome=getNome();
		
		inizialeNome=nome.substring(0, 1);
		inizialeNome=inizialeNome.toUpperCase();
		
		nominativo=inizialeNome+"."+" "+getCognome();
		
		return nominativo;

	}
	
	public String ottieniData(GregorianCalendar data)
	{data.setLenient(false);
	String dataStringa = data.get(Calendar.DAY_OF_MONTH)
			+"/"+data.get(Calendar.MONTH)+"/"+data.get(Calendar.YEAR);
	return dataStringa;
	}

	@Override
	public String toString() {
		return "Autore [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "")
				+ (dataNascita != null ? "dataNascita=" + ottieniData(dataNascita) + ", " : "")
				+ (luogoNascita != null ? "luogoNascita=" + luogoNascita + ", " : "")
				+ (dataMorte != null ? "dataMorte=" + ottieniData(dataMorte) + ", " : "")
				+ (luogoMorte != null ? "luogoMorte=" + luogoMorte : "") + "]";
	}

	
	
	
	


	

}
