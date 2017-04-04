package classi;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datario {

	public static void main(String[] args) {
		//gestione di una data 
		
		Date d = new Date();
		System.out.println(d);
		
		String oggi = d.getDay()+"/"+d.getMonth()+"/"+d.getYear();
		
		System.out.println(oggi);
		/*
		 * la classe date è deprecata, al suo posto ne è stata inserita un'altra
		 *  
		 */
		
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal);
		
		oggi = cal.get(Calendar.DAY_OF_MONTH)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR);
		String adesso = cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
		System.out.println(oggi+"oggi");
		System.out.println(adesso);
		

		/*
		 * Se prende una data da sistema, si comporta diversamente che se gliela passi tu
		 * 
		 */
		GregorianCalendar dataCompleanno = new GregorianCalendar(1986,5,4); //mettere sempre un mese in meno
		dataCompleanno.setLenient(false); // basta mettere questo 
		String compleanno = dataCompleanno.get(Calendar.DAY_OF_MONTH)+"/"+dataCompleanno.get(Calendar.MONTH)+"/"+dataCompleanno.get(Calendar.YEAR);

		System.out.println(compleanno);
		
		

	}

}
