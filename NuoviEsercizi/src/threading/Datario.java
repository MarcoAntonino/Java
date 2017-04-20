package threading;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Datario extends Thread {
	
	private GregorianCalendar data;

	public Datario() {
		data = new GregorianCalendar();
		start();
	}
	
	public String giornoSettimana(){
		
		String[]giorni ={"Domenica", "Luned�", "Marted�", "Mercoled�", "Gioved�", "Venerd�", "Sabato"};
		
		return giorni[data.get(Calendar.DAY_OF_WEEK)];
		}
	
	public String nomeMese(){
		String[] mesi = {"Gennaio"};
		return mesi[data.get(Calendar.MONTH)];
	}
	
	public String dataLetterale(){
		
		return "";
		
	}
	
	public String dataLineare(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(data.getTime());
	}
	
	public String oraLineare(){
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return sdf.format(data.getTime());
	}
	
	
		
	
	}

	
	
	
	


