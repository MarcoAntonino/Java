package abstractclass;

public class  Sfera  extends Solido{
	
	private double raggio;

	public Sfera(Materiale materiale, double raggio) {
		super(materiale);
		if (Sfera.isValid(raggio))
			this.raggio = raggio;
		else
			System.out.println("valore raggio non valido");
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public double volume() {
		return (4.0/3)*Math.PI*Math.pow(raggio, 3);
	}

	
	@Override
	public double supTot() {
		// TODO Auto-generated method stub
		return 4.0*Math.PI*Math.pow(raggio, 2);
	}
	
	public static boolean isValid(double raggio)
	{
		if(raggio>0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "" 
	+ (super.toString() != null ? super.toString() + "\n" : "") 
	+ "raggio="	+ raggio
	;
	}
	
	

}
