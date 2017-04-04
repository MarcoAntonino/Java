package classi;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	public Rettangolo(){}
	
	public Rettangolo (double base, double altezza){
			setBase(base);
			setAltezza(altezza);
		}
	
	public double getBase (){
		return base;
	}
	
	public void setBase(double base){
		if (base>0)
			this.base=base;
	}
	
	public double getAltezza (){
		return altezza;
	}
	
	public void setAltezza(double altezza){
		if (base>0)
			this.altezza=altezza;
	}
	
	
	public double perimetro (){
		return (base+altezza)*2;
	}
	
	public double area (){
		return base*altezza;
		
	}
	
	public double diagonale(){
		return Math.sqrt(Math.pow(base, 2)+Math.pow(altezza, 2));
	}
	
	public String stampa(){
		return ""
				+"Base: "+base
				+"\tAltezza: "+altezza
				+"\nPerimetro: "+perimetro()
				+"\nArea: "+area()
				+"\nDiagonale "+diagonale()
				;
		
	}

}
