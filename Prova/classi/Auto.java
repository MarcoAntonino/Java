package classi;
import enumeration.Alimentazione;

public class Auto {
	
	private String marca;
	private String modello;
	private Alimentazione alimentazione; // benzina, diesel, gpl, metano, ibrida
	private int cilindrata;
	private String colore;
	
	public Auto() {
	}
	
	public Auto(String marca, String modello, Alimentazione alimentazione, int cilindrata, String colore) {
		this.marca = marca;
		this.modello = modello;
		this.alimentazione = alimentazione;
		this.cilindrata = cilindrata;
		this.colore = colore;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
		
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	/*
	 * Un metoodo per calcolare la v max dell'auto
	 * cilindrata/10
	 * +50 benzina
	 * +30 diesel
	 * +10 gpl
	 * -20 metano
	 * -40 ibrida
	 */
	
	public int velocitaMax(){
		
		int v = cilindrata/10;
		
		switch (alimentazione){
		case BENZINA: v+=50;break;
		case DIESEL: v+=30; break;
		case GPL: v+=10; break;
		case METANO: v-=20; break;
		case IBRIDA: v-=40; break;
		default: v+=0;
		}
		
		return v;
		
	}

	@Override
	public String toString() {
		return "Auto ["
				+"marca="+ marca 
				+ ", modello=" + modello 
				+ ", alimentazione=" + alimentazione 
				+ ", cilindrata=" + cilindrata 
				+ ", colore=" + colore
				+ ", velocitaMax=" + velocitaMax()
				+ "]";
	}
	
	

}
