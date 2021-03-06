import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		
		//prove dello studente
		
		Venditore v1 = new Venditore("Marco", "Antonino", 1000, "moto");
		//System.out.println(v1);
		Venditore v2 = new Venditore("Luigi", "Bottassi", 1000, "auto");
		//System.out.println(v2);
		
		Meccanico m1 = new Meccanico("Marco", "Panzanaro", 1200, "auto");
		Meccanico m2 = new Meccanico("Tony", "Fava", 1200, "moto");
		//System.out.println(m1);
		
				
		
		
		ArrayList<Venditore> vrv1 = new ArrayList<Venditore>();
		
		ResponsabileVenditori rv1 = new ResponsabileVenditori("Cesare","Venditori" , 2000, "auto", vrv1);
		rv1.aggiungivenditore(v1);
		rv1.aggiungivenditore(v2);
		//System.out.println(rv1);
		
		GregorianCalendar datao1 = new GregorianCalendar(2017,04,11);
		Prodotto p1 = new Prodotto(1,"Martello", "Utensile", 9.50);
		Prodotto p2 = new Prodotto(2,"Cacciavite", "Utensile", 6.50);
		ArrayList<Prodotto> po1 = new ArrayList<Prodotto>();
		Ordine o1 = new Ordine(1,datao1,po1,v1);
		po1.add(p1);
		po1.add(p2);
		
		ArrayList<Ordine> oco1= new ArrayList<Ordine>();
		
		CapoOfficina co1 = new CapoOfficina("Cesare", "Officini", 2200, "auto", oco1);
		co1.aggiungiOrdine(o1);
		
				
		//CODICE DELLA CONSEGNA
		
		System.out.println("Stampa elenco venditori: "+vrv1); //stampa elenco dei venditori sotto rv1
		System.out.println("Stampa elenco meccanici: "+m1+"\n"+m2); // nel caso di pi� meccanici si potrebbe creare un ArrayList apposito per gestirne la stampa
		
		System.out.println("Ecco il tuo ordine: "+o1); //stampa di un certo ordine
		System.out.println(rv1); //stampa dei dati del responsabile dei venditori
		System.out.println(co1); //stampa dei dati del capoofficina
		
		//sicuramente i toString() dei vari oggetti sono da sistemare per rendere la comprensione del
		//codice pi� facile.
		//Inoltre, se fossi pi� veloce nel scrivere il codice, nella classe test avrei implementato uno switch per permettere una gestione migliore 
		//del tutto
		
		
		
		
		
		

		
		

	}

}
