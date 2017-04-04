package array;

public class ArrayLetterale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] nomi = {"Pino", "Lino", "Rino", "Mino", "Dino", "Bino", "Gino", "Tino", "Nino"};
		// è la stessa cosa che scriver il new
		// vd ArrayInteri
		
		for (int i=0;i<nomi.length; i++) //lenght si può usare perchè abbiamo messo il new
			System.out.println(nomi[i]);
	}

}
