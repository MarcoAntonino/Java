package selezione;

public class FormatoData {

	public static void main(String[] args) {
		int g = 12;
		int m = 1;
		int a = 2015;
		
		String msg = "";
		if (g < 1 || g > 31 || m < 1 || m > 12 || a< 1582 || a>2017)
			msg = "Errore";
		else if ((m==11 || m==4 || m==6 || m==9) && g==31)
			msg = "Errore";
		else if (m==2 && a>29)
			msg = "Errore";
		else if (m==2 && g==29 && a%4!=0)
			msg = "Errore";
		else if (m==2 && g==29 && a%100!=0 && a%400!=0)
			msg = "Errore";
		else 
		{
			msg+= (g<10 ? "0":"")+g+" ";
			
			if (m==1)
				msg += "Gennaio ";
			else if (m==2)
				msg += "Febbraio ";
			else if (m==3)
				msg += "Marzo ";
			else if (m==4)
				msg += "Aprile ";	
			else if (m==5)
				msg += "Maggio ";
			else if (m==6)
				msg += "Giugno ";
			else if (m==7)
				msg += "Luglio ";
			else if (m==8)
				msg += "Agosto ";
			else if (m==9)
				msg += "Settembre ";
			else if (m==10)
				msg += "Ottobre ";
			else if (m==11)
				msg += "Novembre ";
			else if (m==12)
				msg += "Dicembre ";
			msg+= a;
		}
		
		System.out.println(msg);

	}

}
