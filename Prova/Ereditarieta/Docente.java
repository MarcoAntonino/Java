package Ereditarieta;

import java.util.GregorianCalendar;

import enumeration.Sesso;

public class Docente extends Studente {
	
	private String materia;

	public Docente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sex,
			String corso) {
		super(nome, cognome, dataNascita, luogoNascita, sex, corso);
		this.materia=materia;
	}

	public Docente(String nome, String cognome, GregorianCalendar dataNascita, String luogoNascita, Sesso sex) {
		super(nome, cognome, dataNascita, luogoNascita, sex);
		// TODO Auto-generated constructor stub
	}

	public Docente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public Docente(String corso) {
		super(corso);
		// TODO Auto-generated constructor stub
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "" 
				+ (super.toString() != null ? "" 
				+ super.toString() + "\n" : "")
				+ (materia != null ? "materia=" + materia : "") 
				;
	}
	
	

}
