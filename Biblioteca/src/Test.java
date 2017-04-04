import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


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
		
		Libro l1 = new Libro ("Le tigri", 12343564, a1, e1, 122, 1999);
		//System.out.println(l1+"\n");
		
		Libro l2 = new Libro ("I romani a Forl�", 789456, caio, mondadori, 789, 2016);
		
		//System.out.println(l1+"\n");
		
		Libro diSempronio = new Libro ("I romani al mare", 4566465, sempronio, mondadori, 40, 2016);
		Libro l3 = new Libro ("Domani vedremo", 45646, a1, e1, 54, 1900);
		
		
		
		
			ArrayList<Libro> posScaf1Rip1 = new ArrayList(); // le posizioni sullo scaffale 1
		posScaf1Rip1.add(l1);
		posScaf1Rip1.add(l2);
		
		System.out.println("Elenco libri ripiano 1:");
		for(int i=0; i<posScaf1Rip1.size(); i++)
		{
			System.out.println(posScaf1Rip1.get(i)); // viene restituito il tostring
		}
		
		ArrayList<Libro> posScaf1Rip2 = new ArrayList(); // le posizioni sullo scaffale 2
		posScaf1Rip2.add(diSempronio);
		posScaf1Rip2.add(l3);
		
		System.out.println("Elenco libri ripiano 2:");
		for(int i=0; i<posScaf1Rip2.size(); i++)
		{
			System.out.println(posScaf1Rip2.get(i)); // viene restituito il tostring
		}
		
		ArrayList<ArrayList> scaf1SRossa = new ArrayList();
		scaf1SRossa.add(posScaf1Rip1);
		scaf1SRossa.add(posScaf1Rip2);
		
		
		
	}


}
