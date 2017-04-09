package abstractclass;

public class Cubo extends Solido{
	
	
	private double lato;

	public Cubo(Materiale materiale, double lato) {
		super(materiale);
		if(Cubo.isValid(lato))
			this.lato = lato;
		else
			System.out.println("Il valore del lato è illegale");
		}	
	
	
	public double getLato() {
		return lato;
	}


	public void setLato(double lato) {
		this.lato = lato;
	}


	@Override
	public double volume(){
		return Math.pow(lato, 3);
	}

	public double supLater() {
		return Math.pow(lato, 2)*4;
		
	}

	@Override
	public double supTot() {
		return Math.pow(lato, 2)*6;
	}

	public static boolean isValid(Materiale nome)
	{
		if(nome == null)
			return false;
		else
			return true;
	}
	
	public static boolean isValid(double lato)
	{
		if(lato>0)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "" 
	+ (super.toString() != null ? super.toString() + "\n" : "") 
	+ "lato=" + lato
	+ ", supLater()=" + supLater() 
	;
	}
	
	
}
