package polimorfismo;

public class Amministrativo extends Dipendente {

	private Mansione mansione;
	
	public Amministrativo() {
		super();
	}
	
	 



	public Mansione getMansione() {
		return mansione;
	}





	public void setMansione(Mansione mansione) {
		this.mansione = mansione;
	}





	public Amministrativo(String nominativo, int oreLavorate, double pagaOraria, Mansione mansione) {
		super(nominativo, oreLavorate, pagaOraria);
		this.mansione = mansione;
	}





	@Override
	public double stipendio() {
		double s = super.getPagaOraria()*super.getOreLavorate();
		switch(mansione){
			case CONTABILE: s+=150; break;
			case RISORSEUMANE: s+=250; break;
			case DIRETTORE: s+=400; break;
			default: s+=0; break;
		}
		return s;
		
	}





	@Override
	public String toString() {
		return "Amministrativo [" 
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (mansione != null ? "mansione=" + mansione + ", " : "")
				+ (getMansione() != null ? "getMansione()=" + getMansione() : "") 
				+ "]";
	}

}
