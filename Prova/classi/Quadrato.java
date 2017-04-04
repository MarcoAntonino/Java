package classi;

public class Quadrato {
	
	//attributi
	private double lato;  // se è privato la sua accessibilità non c'è più
	//ergo gli faccio apssare l'attributo come valore di default 
	//e creo un costruttore
	
	
	
	//COSTRUTTORE1
	
	//costruttore di default
	public Quadrato(){}
	//costruttore con passaggio di parametri
	public Quadrato(double lato){ //double lato è un parametro deve esser identico all'attributo che vogliamo gestire
		setLato(lato); 
	
	}
	//per non fare confusione uso il  this e dico dai questo parametro a questa classe
	
	/*
	 * this non fa male scriverlo. è obbligatorio usarlo quando uso lo stesso nome del parametro
	 * come quello dell'attributo
	 */
	
	/*
	 * Posso mantenere entrambi i costruttori grazie all'overloading.
	 * Hanno identificatore comune "quadrato" ma firma differente
	 * firma=Quadrato(double lato).
	 * 
	 */
	
	/*
	 * Una proprietà è una caratteristica accessibile in scrittura e lettura
	 * Cosa sono set e get? Sono accessor, consentono all'oggetto di inserire il dato, 
	 * di inizializzarlo e prelevarlo. Se io volessi dire che non posso costruire
	 * quadrati di lato negativo, lo gestisco quando definisco la proprietà.
	 * Quindi nel set gli mettiamo le graffe e gli diciamo con delle graffe che
	 * non può gestirlo
	 */
	
	//ACCESSOR
	/*
	 * Sono metodi particolari che permettono di leggere e scrivere su un attributo
	 */
	
	//getter
	public double getLato(){
		return lato;
	}
	
	//setter
	public void setLato(double lato){
		if(lato>0)
			this.lato=lato;
	}
	//Il get legge. Posso scrivere solo lui se voglio solo fare leggere
	//Il set restituisce
	
	//METODI
	public double perimetro(){
		return lato*4;
	}
	
	public double area(){
		return lato*lato;
	}
	
	public double diagonale(){
		return lato*Math.sqrt(2);
	}
	
	public String stampa(){
		return ""
				+"Lato: "+lato
				+"\nPerimetro: "+perimetro()
				+"\nArea: "+area()
				+"\nDiagonale: "+diagonale()
				;
		
	}

}

/*
 * Integer: è la classe che mi consente di utilizzare i tipi interi
 * 
 */