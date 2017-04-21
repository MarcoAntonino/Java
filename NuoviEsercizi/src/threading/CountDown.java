package threading;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CountDown extends Thread {
	
	private GregorianCalendar data;

	public CountDown() {
		data = new GregorianCalendar();
		start();
	}
	
	public String giornoSettimana(){
		
		String[]giorni ={"Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"};
		
		return giorni[data.get(Calendar.DAY_OF_WEEK)];
		}
	
	public String nomeMese(){
		String[] mesi = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno","Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
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
	
	

	@Override
	public void run() {
		while(true)
		{
			data.set(Calendar.SECOND, data.get(Calendar.SECOND)+1);
			System.out.println(this.toString());
		
		try{
			Thread.sleep(1000);
		} catch	(InterruptedException e){
				e.printStackTrace();
			}
			
		}		
	}
	

	@Override
	public String toString() {
		return giornoSettimana()
				+" "+ dataLineare()
				+" ore: " + oraLineare();
	}
	
	
		
	
	}

	
	
	
	


