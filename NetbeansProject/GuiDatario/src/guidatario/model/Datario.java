package guidatario.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

public class Datario extends Thread {
	
	private GregorianCalendar data;
        private JLabel output;

	public Datario() {
		data = new GregorianCalendar();
		start();
	}

        
        
        public Datario( JLabel output) {
        this(); //chiama il costruttore di sopra
        this.output = output;
        }
        
        public Datario(GregorianCalendar data, JLabel output) {
            this(output);
            this.data=data; //per fare l'esercizio dei fuso orari
            
        }
        
        
	
	public String giornoSettimana(){
		
		String[]giorni ={"Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerd�", "Sabato"};
		
		return giorni[data.get(Calendar.DAY_OF_WEEK)-1];
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
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(data.getTime());
	}
	
	

	@Override
	public void run() {
		while(true)
		{
			data.set(Calendar.SECOND, data.get(Calendar.SECOND)+1);
			output.setText(this.toString());
                        
		
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

	
	
	
	


