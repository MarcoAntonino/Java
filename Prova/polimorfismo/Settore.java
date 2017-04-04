package polimorfismo;

public enum Settore {
	PRODUZIONE(250.00),LOGISTICA(145.65),MANUTENZIONE(185.50);
	
	private double valore;
	
	public double getValore(){
		return valore;
	}
	
	Settore(double valore){
		this.valore=valore;
	}

}
