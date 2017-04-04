package polimorfismo;

public class Operaio extends Dipendente {

	private Settore settore;
	
	public Settore getSettore() {
		return settore;
	}

	public void setSettore(Settore settore) {
		this.settore = settore;
	}

	public Operaio(String nominativo, int oreLavorate, double pagaOraria, Settore settore) {
		super(nominativo, oreLavorate, pagaOraria);
		this.settore = settore;
	}

	public Operaio() {
		super();
	}
	
	

	@Override
	public double stipendio() {
		// TODO Auto-generated method stub
		return super.getOreLavorate()*super.getPagaOraria()+settore.getValore();
	}
	
	@Override
	public String toString() {
		return "Operaio [" 
				+ (super.toString() != null ? super.toString() + ", " : "")
				+ (settore != null ? "settore=" + settore + ", " : "")				 
				+ "]";
	}

}
