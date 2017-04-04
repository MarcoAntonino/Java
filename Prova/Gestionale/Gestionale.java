package Gestionale;

import java.util.Scanner;

public class Gestionale {

	public static void main(String[] args) {
		
		int codice;
		String nome;
		String descrizione;
		double prezzo;
		int giacenza;
		int scelta = -1;
		
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserisci il codice del prodotto");
		codice = tastiera.nextInt();
		System.out.println("Inserisci il nome del prodotto");
		nome = tastiera.next();
		System.out.println("Inserisci la descrizione del prodotto");
		descrizione = tastiera.next();
		System.out.println("Inserisci il prezzo del prodotto");
		prezzo = tastiera.nextDouble();
		System.out.println("Inserisci il numero di prodotti");
		giacenza = tastiera.nextInt();
		while (giacenza>100)
			{System.out.println("Errore: giacenza max 100 pz");
			giacenza = tastiera.nextInt();}
		
		Prodotto nuovoProdotto = new Prodotto(codice, nome, descrizione, prezzo, giacenza);
		
		System.out.println(nuovoProdotto);
		
		
		do {
			System.out.println("Inserisci la tua scelta\n");
			System.out.println("1. Fai un ordine\n");
			System.out.println("0. Uscita\n");
			scelta= tastiera.nextInt();
			
			switch (scelta) {
			case 1: System.out.println("Inserisci il numero di pezzi");
			int pezzi=tastiera.nextInt();			
					if (nuovoProdotto.ordine(pezzi)>0)
					{
					if(nuovoProdotto.getGiacenza()<10 || nuovoProdotto.getGiacenza()>0)
					{
						System.out.println("Attenzione: la giacenza è di "+nuovoProdotto.getGiacenza()+" ");
					}
					else if (nuovoProdotto.getGiacenza()==0)
					{
						System.out.println("Impossibile fare l'operazione, gianceza");
					}
					}
					else
						System.out.println("hai ordinato troppi pezzi");
				break;
				
			case 0:
				
				break;

			default:
				break;
			}
			
		} while (scelta!=0);
		
		

	}

}
