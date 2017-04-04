package sequenza;

public class Divisione2interi {

	public static void main(String[] args) {
		int a=12, b=7;
		
		int q=a/b; //quoziente
		int r=a%b; //resto
		float qr=(float)a/b;
		/*
		 * Operazione di casting 
		 * */
		System.out.println("valore di a: "+a);
		System.out.println("valore di a: "+b);
		System.out.println("Quoziente intero: "+q);
		System.out.println("Resto: "+r);
		System.out.println("Quoziente reale: "+qr);
	}

}
