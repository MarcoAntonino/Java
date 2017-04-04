package Ereditarieta;

public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato, lato);
	}

	
	//tutto quello che arriva dalla classe che non soddisfa 
	@Override
	public String toString() {
		return "Lato=" + getLato1() 
		+ ", perimetro=" + perimetro() 
		+ ", area=" + area()
		+ ", diagonale()=" + diagonale()
		;
	}
	
	
	
	

}
