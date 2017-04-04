package selezione;

public class SequenzaOrariaCorretta {

	public static void main(String[] args) {
		/*
		 * data una sequenza oraria...
		 */
		
		int h=1;
		int m=12;
		int s=3;
		
		String msg="";
		if (h<0 || h>23 || m<0 || m>59 || s<0 || s>59)
			msg = "Errore";
		else{
			/*	
			if(h<10)msg+="0"; // msg = msg + "0"
		msg+=h+":";
		
			if(m<10)msg+="0";
		msg+=m+":";
				
				if(s<10)msg+="0";
		msg+=s;
		
		//versione migliorata da preferire a quello di prima
		/*
		 * ?:operatore ternario che ha quindi 3 argomenti 
		 * invece che due. 
		 * è un qualcosa che restituisce dei risultati e 
		 * quindi bisogna sempre recuperare il suo risultato 
		 * e farne qualcosa
		 */
		msg+= (h<10 ? "0":"")+h+":";
		msg+= (m<10 ? "0":"")+m+":";
		msg+= (s<10 ? "0":"")+s;
		}
		
		System.out.println(msg);
		
	}

}
