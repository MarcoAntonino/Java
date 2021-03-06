
public class Meccanico extends Persona {
	
	private String settore;
	
	public Meccanico() {
		super();
	}
	
	
	public Meccanico(String nome, String cognome, double stipendio, String settore) {
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
		return "Meccanico [" + (super.toString() != null ? super.toString() + ", " : "")
				+ (settore != null ? "settore=" + settore + ", " : "") 
				+ "tredicesima=" + tredicesima() + "]";
	}
	
	

}
