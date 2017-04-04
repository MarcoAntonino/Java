package input;

import java.io.*;

public class Prova20170210 {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input); 
		
		int quanti = 0;
		int intero = 0;
		int somma = 0;
		int media = 0;
		
		
		try{
			System.out.println("Di quanti interi si vuole fare la media? ");
			quanti = Integer.parseInt(tastiera.readLine());
			for(int i=0;i<quanti;i++){
				System.out.println((i+1)+"Dammi intero");
				intero = Integer.parseInt(tastiera.readLine());
				somma = somma+intero;
			}
			
		}catch(Exception e){
			System.out.println("errore");
			System.out.println(e.getMessage());
			return;
		}
		
		media = somma/quanti;
		
		String msg = "Ecco la somma: "
				+  somma 
				+ "\n"
				+ "Ecco la media: "
				+ media
				;
		System.out.println(msg) ;
	}

}
