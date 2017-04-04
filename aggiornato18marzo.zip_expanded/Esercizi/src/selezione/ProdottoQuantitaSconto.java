package selezione;

public class ProdottoQuantitaSconto {

	public static void main(String[] args) {
		/*
		 * Fascie di sconto:
		 * 0-3 0%
		 * 4-7 3%
		 * 8-11 7%
		 * 12-17 11%
		 * 18> 15%
		 */
		double prezzo=12.75;
		int quantita=5;
		int pSconto=0; // percentuale sconto
		double subTotale = prezzo*quantita;
		
		if(quantita>=4 && quantita<8)
			pSconto=3;
		else if (quantita>=8 && quantita<12)
			pSconto=7;
		else if (quantita>=12 && quantita<18)
			pSconto=11;
		else if (quantita>=18)
			pSconto=15;
		
		double sconto = subTotale*pSconto/100;
		double totale = subTotale-sconto;
		
		String msg=""
				+ "Prezzo: € "+prezzo
				+ "\nQuantità: "+quantita
				+ "\nPercentuale di sconto: "+pSconto+"%"
				+ "\nSub Totale € "+subTotale
				+ "\nSconto: € "+sconto
				+ "\nTotale: € "+totale
				;
		
		System.out.println(msg);
		
	}

}
