package classi;

public class Cerchio {
	
	private double raggio;
	
	public Cerchio(double raggio){
		setRaggio(raggio);
	}
	
	public double getRaggio(){
		return raggio;
	}
	
	public void setRaggio(double raggio){
		if(raggio>0)
			this.raggio=raggio;
	}
	
	public double circonferenza(){
		return raggio*2*Math.PI;
	}
	
	public double area(){
		return Math.pow(raggio, 2)*Math.PI;
	}
	
	public String stampa(){
		return ""
				+"Raggio: "+raggio
				+"\nPerimetro: "+circonferenza()
				+"\nArea: "+area()
				;
	}

}

