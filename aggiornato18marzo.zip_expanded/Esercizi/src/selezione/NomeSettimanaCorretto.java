package selezione;

public class NomeSettimanaCorretto {

	public static void main(String[] args) {
		
		int n=2;
		//selezione multipla
		String msg="";
		
		switch (n) {
		
		case 1: msg="Lunedì";break;
		case 2: msg="Martedì";break;
		case 3: msg="Mercoledì";break;
		case 4: msg="Giovedì";break;
		case 5: msg="Venerdì";break;
		case 6: msg="Sabato";break;
		case 7: msg="Domenica";
			
		// default raccoglie tutti i casi non elencati
		//Il default deve essere l'ultimo caso
		default: msg="Errore";
		}
		
		System.out.println("Numero:"+n+"; Nome del giorno della settimana: "+msg);

	}

}
