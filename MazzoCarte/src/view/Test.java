package view;

import Model.Mazzo;

public class Test {

	public static void main(String[] args) {
		
		Mazzo m = new Mazzo();
		m.crea();
		
		System.out.println(m);
		
		m.mescola();
		System.out.println("\n\nMazzo mescolato\n\n");
		System.out.println(m);

	}

}