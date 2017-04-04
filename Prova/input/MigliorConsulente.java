package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MigliorConsulente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		String nominativo = "";
		double fatturato = 0;
		double spese = 0;
		int quanti = 0;
		double fatturatoMag = 0;
		double speseMin = 0;
		String fatturatore = "";
		String spesatore = "";
		String guadagnatore = "";
		
		try{
			System.out.println("Inserire i dati del primo consulente : ");
			System.out.println("Nome consulente: ");
			nominativo = tastiera.readLine();
			fatturatore = nominativo;
			spesatore = nominativo;
			guadagnatore = nominativo;
			
			System.out.println("Fatturato lordo: ");
			fatturato = Double.parseDouble(tastiera.readLine());
			fatturatoMag = fatturato;
			
			System.out.println("Spese: ");
			spese = Double.parseDouble(tastiera.readLine());
			speseMin = spese;
			
			System.out.println("quanti altri consulenti si vogliono inserire : ");
			quanti = Integer.parseInt(tastiera.readLine());
			for(int i=0;i<quanti;i++){
			System.out.println("Nome consulente: ");
			nominativo = tastiera.readLine();
			
			System.out.println("Fatturato lordo: ");
			fatturato = Double.parseDouble(tastiera.readLine());
			
			System.out.println("Spese: ");
			spese = Double.parseDouble(tastiera.readLine());
			if (fatturato>fatturatoMag)
			{
				fatturatoMag = fatturato;
				fatturatore = nominativo;
			}
			if (spese<speseMin)
			{
				speseMin = spese;
				spesatore = nominativo;
			}
			}
			
		}catch(Exception e){
			System.out.println("errore");
			System.out.println(e.getMessage());
			return;
		}
		
		double guadagno = fatturato - spese;
		
		String msg = "Dati del consulente: "
				+ "\nNominativo: " + nominativo
				+ "\nFatturato: " + fatturato
				+ "\nSpese: " + spese
				+ "\nGuadagno: " + guadagno
				+ "\nfatturatore: " + fatturatore
				+ "\nSpesatore: " + spesatore
				;
		
		System.out.println(msg);

	}

}
