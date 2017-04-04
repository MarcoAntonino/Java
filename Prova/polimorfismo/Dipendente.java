package polimorfismo;

public abstract class Dipendente implements Cloneable {
	
	private String nominativo;
	private int oreLavorate;
	private double pagaOraria;
	
	public Dipendente() {
		super();
	}
	
	public Dipendente(String nominativo, int oreLavorate, double pagaOraria) {
		super();
		this.nominativo = nominativo;
		this.oreLavorate = oreLavorate;
		this.pagaOraria = pagaOraria;
	}

	

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
	}

	public double getPagaOraria() {
		return pagaOraria;
	}

	public void setPagaOraria(double pagaOraria) {
		this.pagaOraria = pagaOraria;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public abstract double stipendio();

	@Override
	public String toString() {
		return "" 
				+ (nominativo != null ? "nominativo=" + nominativo + ", " : "") 
				+ "oreLavorate="+ oreLavorate 
				+ ", pagaOraria=" + pagaOraria 
				+ ", stipendio=" + stipendio() 
				;
	}
	
	
}
