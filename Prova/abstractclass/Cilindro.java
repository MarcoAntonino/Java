package abstractclass;

public class Cilindro extends Solido{
	
	private double raggio;
	private double altezza;
	
	public Cilindro(Materiale materiale, double raggio, double altezza) {
		super(materiale);
		if(Cilindro.rIsValid(raggio))
			this.raggio = raggio;
		else
			System.out.println("Il valore del raggio è illegale");
		if(Cilindro.altIsValid(altezza))
			this.altezza = altezza;
		else
			System.out.println("Il valore dell'altezza è illegale");
		
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double volume() {
		return Math.PI*Math.pow(raggio, 2)*altezza;
	}

	public double supLater() {
		return 2*Math.PI*raggio*altezza;
	}

	@Override
	public double supTot() {
		return (2*Math.PI*raggio*altezza)+2*Math.PI*Math.pow(raggio, 2);
	}

	public static boolean isValid(Materiale nome)
	{
		if(nome == null)
			return false;
		else
			return true;
	}
	
	public static boolean rIsValid(double raggio)
	{
		if(raggio>0)
			return true;
		else
			return false;
	}
	
	public static boolean altIsValid(double altezza)
	{
		if(altezza>0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "C" 
	+ (super.toString() != null ? super.toString() + "\n" : "") 
	+ "supLaterale="+ supLater()
	+ ", raggio="+ raggio 
	+ ", altezza=" + altezza 
	;
	}
	
	
	

}
