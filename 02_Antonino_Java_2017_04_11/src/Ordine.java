import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Ordine {
	
	private int idOrdine;
	private GregorianCalendar data;
	private ArrayList<Prodotto> listaDiProdotti;
	private Venditore venditore;
	
	public Ordine() {
		
		data = new GregorianCalendar(); //un ordine deve avere una data, al massimo poi la modifico
	}

	public Ordine(int idOrdine, GregorianCalendar data, ArrayList<Prodotto> listaDiProdotti, Venditore venditore) {
		this.idOrdine = idOrdine;
		this.data = data;
		this.listaDiProdotti = listaDiProdotti;
		this.venditore = venditore;
	}

	public int getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}

	public GregorianCalendar getData() {
		return data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public ArrayList<Prodotto> getListaDiProdotti() {
		return listaDiProdotti;
	}

	public void setListaDiProdotti(ArrayList<Prodotto> listaDiProdotti) {
		this.listaDiProdotti = listaDiProdotti;
	}

	public Venditore getVenditore() {
		return venditore;
	}

	public void setVenditore(Venditore venditore) {
		this.venditore = venditore;
	}
	
	public int nProdotti(){
		return listaDiProdotti.size();
	}
	
	public double totale(){
		double totale = 0;
		
		for (Prodotto p: listaDiProdotti)
		{
			totale+=p.getPrezzo();
		}
		
		return totale;
	}
	
	public String ottieniData(GregorianCalendar data)
	{data.setLenient(false);
	String dataStringa = data.get(Calendar.DAY_OF_MONTH)
			+"/"+data.get(Calendar.MONTH)+"/"+data.get(Calendar.YEAR);
	return dataStringa;
	}
	
	public String ottieniDataOra(GregorianCalendar data)
	{data.setLenient(false);
	String dataStringa = data.get(Calendar.DAY_OF_MONTH)
			+"/"+data.get(Calendar.MONTH)+"/"+data.get(Calendar.YEAR)+" "
			+data.get(Calendar.HOUR_OF_DAY)+":"+data.get(Calendar.MINUTE)+":"+data.get(Calendar.SECOND);
	return dataStringa;
	}

	@Override
	public String toString() {
		return "Ordine [idOrdine=" + idOrdine + ", " + (data != null ? "data=" + ottieniData(data) + ", " : "")
				+ (listaDiProdotti != null ? "listaDiProdotti=" + listaDiProdotti + ", " : "")
				+ (venditore != null ? "venditore=" + venditore + ", " : "") 
				+ "nProdotti()=" + nProdotti()
				+ ", totale()=" + totale() + "]";
	}
	
	public void scontrino(){
		String msg="";
		msg+="idOrdine= " + idOrdine + "\n"
							+"Data e ora= " + ottieniDataOra(data) + "\n" 
							+"Venditore= " + venditore;
		for (Prodotto p: listaDiProdotti){
			msg+="Codice prodotto= "+p.getCodice()+" "+"Nome= "+p.getProdotto()+" "
					+"Quantit�=1"+"Prezzo unitario= "+p.getPrezzo()+ "\n";
		}
		
		double subtotale = 0;
		
		for (Prodotto o: listaDiProdotti){
			subtotale+=o.getPrezzo();
		}
		
		double totale = 0;
		
		for (Prodotto o: listaDiProdotti){
			totale+=o.getPrezzo();
		}
		
		msg+="subtotale= "+subtotale+ "\n"+"totale= "+totale;
	}
	
	
	
	

}