package classi;

public class Triangolo {
	
	//attributi
	private double lato1;
	private double lato2;
	private double lato3;
	
	public Triangolo(){

}
	public Triangolo(double lato1, double lato2, double lato3){
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
	}
	
	public Triangolo(Punto punto1, Punto punto2, Punto punto3){
		this.lato1=punto1.distanza(punto2);
		this.lato2=punto2.distanza(punto3);
		this.lato3=punto3.distanza(punto1);
	}
	
	//metodi
	
	private boolean isCostruibile(){
		return lato1+lato2>lato3 && 
				lato2+lato3>lato1 &&
				lato3+lato1>lato2;
	}
	/*
	 * Espressione logica che da un vero o falso. 
	 * is serve proprio a indicare questo
	 * Permette di evitare che i lati del trinagolo non soddisfino i requisiti
	 */
	
	public double perimetro(){
		return lato1*lato2*lato3;
	}
	
	public double area(){
		//formula di Erone
		double sp = perimetro()/2;
		return Math.sqrt(sp*(sp-lato1)*(sp-lato2)*(sp-lato3));
	}
	
	public String tipo(){
		if(lato1==lato2 && lato1==lato3)
			return "Equilatero";
		else if (lato1==lato2 || lato1 == lato3 || lato2==lato3)
			return "Isoscele";
		else
			return "Scaleno";
	}
	
	public String stampa(){
		
		return stampa(", ");
	}
	
	
	
	public String stampa(String separatore){
		
		if (!isCostruibile())
			return "Dati inseriti non validi ai fini della costruzione di un triangolo";
		
		return "" //servono per iniziare una stringa vuota
				+"lato1: "+lato1
				+separatore
				+"lato2: "+lato2
				+separatore
				+"lato3: "+lato3
				+separatore
				+"Perimetro: "+perimetro()
				+separatore
				+"Area: "+area()
				+separatore
				+"Tipo: "+tipo()
				;
	}
	
	//dopo la chiocciola è un'annotazione 
	/*
	 * Serve per dire al compilatore che confermiamo l'override.
	 * Sovrascrivo. È una sorta di controllo 
	 */
	
	@Override
	public String toString(){
		return stampa();
	}
}