package matrici;

public class MatriceInteri {

	public static void main(String[] args) {
		/*
		 * matrice rettangolare 3*2 di numeri interi
		 * L'esercizio più facile
		 */
		
		int r = 3; //numero di righe
		int c = 2; // numero di colonne
		//dichiarazione di una matrice
		int [][] m = new int [r][c];
		
		m[0][0]=12;
		m[0][1]=-12;
		m[1][0]=11;
		m[1][1]=-11;
		m[2][0]=10;
		m[2][1]=-10;
		
		//stampa
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++) //in base alla riga che stai gestendo, dimmi la riga di i
				System.out.print("\t"+m[i][j]);
			System.out.println();
		}

	}

}
