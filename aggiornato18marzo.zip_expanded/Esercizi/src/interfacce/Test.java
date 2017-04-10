package interfacce;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta ("Piero Del Colle","Juvenilia", "Calcite");
		System.out.println(a1);
		
		Calciatore c1 = new Calciatore ("Domenico Mangione", "Provercelli", 1, 34, 23);
		Calciatore c2 = new Calciatore ("Francesco Delia", "garibaldi", 3, 20, 10);
		Calciatore c3 = new Calciatore ("Francesco Delia", "garibaldi", 3, 20, 10);
		Calciatore c4 = c3;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c2==c3);



		
	}

}
