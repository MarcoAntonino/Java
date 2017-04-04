package selezione;

public class NomeMese {

	public static void main(String[] args) {
		int num = 12;
		
		String msg = "";
		
		if (num<1 || num>12)
			msg = "Errore";
		else if (num==1)
			msg = "Gennaio";
		else if (num==2)
			msg = "Febbraio";
		else if (num==3)
			msg = "Marzo";
		else if (num==4)
			msg = "Aprile";	
		else if (num==5)
			msg = "Maggio";
		else if (num==6)
			msg = "Giugno";
		else if (num==7)
			msg = "Luglio";
		else if (num==8)
			msg = "Agosto";
		else if (num==9)
			msg = "Settembre";
		else if (num==10)
			msg = "Ottobre";
		else if (num==11)
			msg = "Novembre";
		else if (num==12)
			msg = "Dicembre";
		
		System.out.println(msg);

	}

}
