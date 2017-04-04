package selezione;

public class SequenzaData {

	public static void main(String[] args) {
		int g = 4;
		int m = 7;
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
			msg+= (g<10 ? "0":"")+g+":";
			msg+= (m<10 ? "0":"")+m+":";
			msg+= a;
		}
		System.out.println(msg);

	}

}
