package selezione;

public class NomeSettimanaCorretto {

	public static void main(String[] args) {
		
		int n=2;
		//selezione multipla
		String msg="";
		
		switch (n) {
		
		case 1: msg="Luned�";break;
		case 2: msg="Marted�";break;
		case 3: msg="Mercoled�";break;
		case 4: msg="Gioved�";break;
		case 5: msg="Venerd�";break;
		case 6: msg="Sabato";break;
		case 7: msg="Domenica";
			
		// default raccoglie tutti i casi non elencati
		//Il default deve essere l'ultimo caso
		default: msg="Errore";
		}
		
		System.out.println("Numero:"+n+"; Nome del giorno della settimana: "+msg);

	}

}
