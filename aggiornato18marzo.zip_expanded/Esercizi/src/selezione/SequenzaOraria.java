package selezione;

public class SequenzaOraria {

	public static void main(String[] args) {
		int h = 90;
		int m = 34;
		int s = 15;
		String msg = "";
		
		if ((h<0 || h>23) || (m<0 || m>60) || (s<0 || m>60))
				msg = "Errore";
		else
			msg = h+":"+m+":"+s;
		
		System.out.println(msg);
	}

}
