package classi;

public class TestTraingolo {

	public static void main(String[] args) {
		
		Triangolo t1 = new Triangolo(3.25,3.25,3.25);
		System.out.println(t1.stampa("\n"));
		
		Triangolo t2 = new Triangolo(3.25,3.25,4.25);
		System.out.println(t2.stampa());
		System.out.println(t2.toString());
		System.out.println(t2);
		//3 modi per fare la stessa cosa
		
		Triangolo t3 = new Triangolo(3.25,3.15,4.25);
		System.out.println(t3.stampa("; "));
		
		Punto p = new Punto("P", -3.4, 4.3);
		Punto q = new Punto(-13.4, 14.3);
		Punto r = new Punto("R", 3.4, -4.3);
		
		Triangolo t4 = new Triangolo(p,q,r);
		System.out.println(t4);
	}

}
