
public class Venditore extends Persona{
	
	private String settore;

	public Venditore() {
		super();
	}

	public Venditore(String nome, String cognome, double stipendio, String settore) {
		super(nome, cognome, stipendio);
		this.settore = settore;
	}

	public String getSettore() {
		return settore;
	}

	public void setSettore(String settore) {
		this.settore = settore;
	}

	@Override
	public double tredicesima() {
		
		return getStipendio()*2;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "Venditore [" + (super.toString() != null ? super.toString() + ", " : "")
				+ (settore != null ? "settore=" + settore + ", " : "") 
				+ "tredicesima=" + tredicesima() + "]";
	}
	
	

	
	
	
	
	
	
	
	
	

}
