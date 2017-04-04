package Ereditarieta;

//extends per ereditare
public class Rettangolo extends Quadrilatero{
	
	public Rettangolo (double base, double altezza){
		super(base, altezza, base, altezza);
				
	}
	
	public double area(){
		return super.getLato1()*super.getLato2();
	}
	
	public double diagonale(){
		return Math.sqrt(Math.pow(getLato1(), 2)+Math.pow(getLato2(), 2));
	}

	@Override
	public String toString() {
		return "base=" + getLato1() 
		+ ", altezza=" + getLato2() 
		+ ", perimetro=" + perimetro()
		+ ", area=" + area() 
		+ ", diagonale()=" + diagonale()
		;
	}
	
	

}
