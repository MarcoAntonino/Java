package sequenza;

public class Fattura {

	public static void main(String[] args) {
		/*
		 * Dato l'imponibile e l'aliquota iva ,
		 * calcolare il totale da pagare 
		 */
		
		float imponibile = 1500.00F;
		/*
		 * Due tipologie di numeri costanti in java costanti int e double,
		 * quindi devo fare un casting e quindi ecco la F. 
		 * Quindi gli dico che nonostante sia una costante sia float
		 * puoi anche scrivere (float) davanti al numero
		 * per gestire gli interi: byte, short, long, int
		 */
		int aliquota = 22; // 22% 22/100 = 0.22
		
		float iva = imponibile*aliquota/100;
		float totale = imponibile+iva;
		
		System.out.println("Imponibile: € "+imponibile);
		System.out.println("Aliquota iva: "+aliquota+"%");
		System.out.println("Iva: € "+iva);
		System.out.println("Totale: € "+totale);
	}

}
