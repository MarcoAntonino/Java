package classi;

public class Punto {
	
	private String nome;
	private double x;
	private double y;
	
	public Punto() {
	}
	
	/*
	 * Per generare un costruttore velocemente 
	 * Source-->Generate Constructor using Fields
	 */
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto(String nome, double x, double y) {
		this.nome = nome;
		this.x = x;
		this.y = y;
	}
	

	

	//metodi
	
	public double distanza(){
		return distanza(new Punto("O",0,0));
	}
	
	public double distanza(Punto punto){
		return Math.sqrt((Math.pow(this.x-punto.x, 2)+Math.pow(this.y-punto.y, 2)));
	}

	@Override
	public String toString() {
		return (nome!=null ? nome : "") // se il valore è nullo, non stampare "null"
				+"(" + x + "," + y + ")";
	}
	
	
	

}
