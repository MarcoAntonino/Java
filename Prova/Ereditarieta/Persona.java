package Ereditarieta;
import enumeration.Sesso;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	//attributi
	private String nome;
	private String cognome;
	private GregorianCalendar dataNascita;
	private String luogoNascita;
	private Sesso sex;
	
	
	//costruttori
	public Persona() {
		dataNascita = new GregorianCalendar();
		sex=Sesso.ALTRO;
	}

	public Persona(String nome, String cognome) {
		this(); //richiamo il costruttore precedente
		this.nome = nome;
		this.cognome = cognome;
	}

	public Persona(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sex) {
		this(nome,cognome); //utilizza il costruttore precedente e poi inizializza
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.sex = sex;
	}

	//accessors
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

	public void setDataNascita(GregorianCalendar datanascita) {
		this.dataNascita = datanascita;
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

	//metodi
	public int eta(){
		GregorianCalendar oggi = new GregorianCalendar();
		
		//21/1/1993 - Andrea - eta 24
		//24/04/1993 - Davide - eta 23
		int e=oggi.get(Calendar.YEAR)-dataNascita.get(Calendar.YEAR);
		
		if(dataNascita.get(Calendar.MONTH)>oggi.get(Calendar.MONTH) 
			|| ((dataNascita.get(Calendar.MONTH)==oggi.get(Calendar.MONTH) 
					&& dataNascita.get(Calendar.DAY_OF_MONTH)>oggi.get(Calendar.DAY_OF_MONTH))))
				e--;
		return e;
	}

	@Override
	public String toString() {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d = "";
				if (dataNascita!=null)
					d=sdf.format(dataNascita.getTime());
		
		
		return ""
				+ (nome != null ? "nome=" + nome : "") 
				+ "\n"+ (cognome != null ? " cognome=" + cognome : "") 
				+ "\n"+ (dataNascita != null ? " dataNascita=" + d : "")
				+ "\n"+ (luogoNascita != null ? " luogoNascita="	+ luogoNascita : "") 
				+ "\n"+ (dataNascita != null ? " eta=" + eta() : "")
				+ "\n"+ (sex != null ? " sesso=" + sex : "");
	}
	
	
}
