import java.util.ArrayList;

public class ResponsabileVenditori extends Venditore {
	
	private static final double BONUSPERVENDITORE = 0.15; 
	private static final int GIORNILAVORATIVIPERMESE = 21; //da cambiare ogni mese
	
	private ArrayList<Venditore> venditori;

	public ResponsabileVenditori() {
		super();
	}

	public ResponsabileVenditori(String nome, String cognome, double stipendio, String settore,
			ArrayList<Venditore> venditori) {
		super(nome, cognome, stipendio, settore);
		this.venditori = venditori;
	}

	public ArrayList<Venditore> getVenditori() {
		return venditori;
	}

	public void setVenditori(ArrayList<Venditore> venditori) {
		this.venditori = venditori;
	}
	
	public void aggiungivenditore(Venditore nuovoVenditore){
		venditori.add(nuovoVenditore);
	}
	
	public Venditore restituisciVenditore(int index){
		return venditori.get(index);
		
	}
	
	public void cancellaVenditore(int index){
		venditori.remove(index);
	}
	
	@Override
	public double tredicesima() {
		double bonus = 0;
		
		for (Venditore v: venditori)
		{
			bonus+=(v.getStipendio()/GIORNILAVORATIVIPERMESE)*BONUSPERVENDITORE;
		}
		
		return getStipendio()*2+bonus;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "ResponsabileVenditori [" + (super.toString() != null ? super.toString() + ", " : "")
				+ (venditori != null ? "venditori=" + venditori + ", " : "") 
				+ "]";
	}
	
	

}
