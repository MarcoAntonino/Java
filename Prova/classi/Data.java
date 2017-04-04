package classi;

public class Data {
	
	private int giorno;
	private int mese;
	private int anno;
	
	public Data(int giorno, int mese, int anno) {
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}
	
	//metodi
	
	
	
	public String stampaLineare(){
		return giorno+"/"+mese+"/"+anno;
	}
	
	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String stampaLetterale(){
		
		String[] mesi={"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno"
				,"Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
		
		return giorno+" "+mesi[mese-1]+" "+anno;
	}

	@Override
	public String toString() {
		return stampaLineare();
	}
	
	

}
