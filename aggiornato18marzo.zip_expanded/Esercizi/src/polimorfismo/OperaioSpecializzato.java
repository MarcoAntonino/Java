package polimorfismo;

public class OperaioSpecializzato extends Operaio {
	
	
	private int numeroMissioni;
	private double indennitaMissione;
	
	public OperaioSpecializzato() {
		super();
	}
	
	
	public OperaioSpecializzato(String nominativo, int oreLavorate, double pagaOraria, Settore settore, int numeroMissioni, double indennitaMissione) {
		super(nominativo, oreLavorate, pagaOraria,settore);
		this.numeroMissioni = numeroMissioni;
		this.indennitaMissione = indennitaMissione;
	}
	public int getNumeroMissioni() {
		return numeroMissioni;
	}
	public void setNumeroMissioni(int numeroMissioni) {
		this.numeroMissioni = numeroMissioni;
	}
	public double getIndennitaMissione() {
		return indennitaMissione;
	}
	public void setIndennitaMissione(double indennitaMissione) {
		this.indennitaMissione = indennitaMissione;
	}
	@Override
	public double stipendio() {
		
		return super.stipendio() + this.numeroMissioni*this.indennitaMissione;
	}
	@Override
	public String toString() {
		return "OperaioSpecializzato [" 
				+ (super.toString() != null ?  super.toString() + ", " : "")
				+ "numeroMissioni=" + numeroMissioni 
				+ ", indennitaMissione=" + indennitaMissione 
				+ "]"
				;
	}
	
	
	
	
	

}
