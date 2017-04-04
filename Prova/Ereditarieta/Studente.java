package Ereditarieta;

import java.util.GregorianCalendar;

import enumeration.Sesso;

public class Studente extends Persona {
	
	private String corso;
	
	public Studente(){
		super();
	}
		
	public Studente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sex) {
		super(nome, cognome, dataNascita, luogoNascita, sex);
	}
	
	
	
	public Studente(String corso) {
		this.corso = corso;
	}

	public Studente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sex, String corso) {
		super(nome, cognome, dataNascita, luogoNascita, sex);
		this.corso=corso;
	}
	
	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	@Override
	public String toString() {
		return ""
				+ (super.toString() != null ? "" 
				+ super.toString() + ", " : "")
				+ (corso != null ? "corso=" + corso : "")
				;
	}

	
}
