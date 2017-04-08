import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.security.sasl.AuthorizeCallback;


public class Test {
	
	
	public static void main(String[] args) {
		
		GregorianCalendar dataNPinco = new GregorianCalendar(1901,11,23);
		GregorianCalendar dataMPinco = new GregorianCalendar(2001,10,6);
		
		GregorianCalendar dataNCaio = new GregorianCalendar(1986,10,6);
		GregorianCalendar dataNSempronio = new GregorianCalendar(1926,10,6);


		
	
				
		Autore a1 = new Autore ("Pinco", "Pallino"
				, dataNPinco, "Tunisi"
				, dataMPinco, "Roma");
		
		Autore caio = new Autore ("Caio", "De Roma", dataNCaio, "Forl�");
		
		Autore sempronio = new Autore ("Sempronio", "Da Roma", dataNSempronio, "Catania");
		
		//System.out.println("� vivo? "+caio.isVivo()+"\n");
		
		//System.out.println("Nominativo: "+caio.nomimativoAutore()+"\n");
		
		
		//System.out.println(caio);
		
		Editore e1 = new Editore ("Feltrinelli spa", "Via dell'Arcivescovado 9, 10091 Torino",
				"0114055789", "info@feltrinelli.it", "www.feltrinelli.it");
		
		Editore mondadori = new Editore ("Mondadori spa", "Piazza Confraternita 9, 00192 Roma",
				"01245687", "info@mondadori.it", "www.mondadori.it");
		
		//System.out.println(e1.getRagioneSociale()+"\n");
		//System.out.println(e1+"\n");
		
		ArrayList<Autore> aut1 = new ArrayList<Autore>();
		aut1.add(a1);
		aut1.add(caio);

		Posizione psl1 = new Posizione ("Rossa", 1,111);
		Libro l1 = new Libro ("Le tigri", 12343564, aut1, e1, 122, 1999, psl1, StatoLibro.DISPONIBILE);
		System.out.println(l1+"\n");
		l1.StatoLibro();
		
		ArrayList<Autore> aut2 = new ArrayList<Autore>();
		aut2.add(sempronio);
		Posizione psl2 = new Posizione ("Gialla", 2,222);
		Libro l2 = new Libro ("I romani a Forl�", 789456, aut2, mondadori, 789, 2016, psl2, StatoLibro.PRESTATO);
		System.out.println(l2+"\n");
		l2.StatoLibro();
		
		//Libro diSempronio = new Libro ("I romani al mare", 4566465, sempronio, mondadori, 40, 2016);
		//Libro l3 = new Libro ("Domani vedremo", 45646, a1, e1, 54, 1900);
		
		
		
		
		
		
		
			
		
		
	}


}
