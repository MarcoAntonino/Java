package matrici;

import funzioni.MyLibrary;

public class MatriceDinamicaInteri {

	public static int casuale(int inf, int sup){
		return (int)(Math.random()*(sup-inf+1)+inf);
	}
	/*
	 * Il progr Genera una matrice  da solo
	 * Es 2/3
 	 */
	public static void main(String[] args) {
		//definizione
		int[][] m = new int [MyLibrary.casualeInfSup(1,10)][MyLibrary.casualeInfSup(1,10)]; // a priori non sappiamo le sue dimensioni
		
		//caricamento dati
		for (int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j]=casuale(-10,10);
			}
		}
		//stampa
		for (int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				System.out.print("\t"+m[i][j]);
			}
			System.out.println();
		}
	}

}
