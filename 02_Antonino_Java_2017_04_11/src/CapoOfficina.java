import java.util.ArrayList;

public class CapoOfficina extends Meccanico {
	
	private static final double BONUSPERORDINE = 0.5;
	
	private ArrayList<Ordine> ordini;

	public CapoOfficina() {
		super();
	}

	

	public CapoOfficina(String nome, String cognome, double stipendio, String settore, ArrayList<Ordine> ordini) {
		super(nome, cognome, stipendio, settore);
		this.ordini = ordini;
	}



	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	public void aggiungiOrdine(Ordine nuovoOrdine){
		ordini.add(nuovoOrdine);
	}
	
	public int nOrdini(){
		return ordini.size();
	}

	@Override
	public double tredicesima() {
		double bonus = 0;
		for (Ordine o: ordini)
		{
			bonus+=(o.totale());
		}
		
		return getStipendio()*2+bonus;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "CapoOfficina [" + (super.toString() != null ? super.toString() + ", " : "")
				+ (ordini != null ? "ordini=" + ordini + ", " : "") 
				+ "tredicesima()=" + tredicesima() + "]";
	}
	
	

}
