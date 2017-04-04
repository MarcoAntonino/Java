package input;
import java.io.*;

public class Consulente {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		String nominativo = "";
		double fatturato = 0;
		double spese = 0;
		int quanti = 0;
		double guadagno = 0;
		
		try{
			System.out.println("quanti consulenti si vogliono inserire : ");
			quanti = Integer.parseInt(tastiera.readLine());
			for(int i=0;i<quanti;i++){
			System.out.println("Nome consulente: ");
			nominativo = tastiera.readLine();
			
			System.out.println("Fatturato lordo: ");
			fatturato = Double.parseDouble(tastiera.readLine());
			
			System.out.println("Spese: ");
			spese = Double.parseDouble(tastiera.readLine());
			}
			
		}catch(Exception e){
			System.out.println("errore");
			System.out.println(e.getMessage());
			return;
		}
		
		guadagno = fatturato - spese;
		
		String msg = "Dati del consulente: "
				+ "\nNominativo: " + nominativo
				+ "\nFatturato: " + fatturato
				+ "\nSpese: " + spese
				+ "\nGuadagno: " + guadagno
				;
		
		System.out.println(msg);
	}

}
