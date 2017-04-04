package classi;

public class TestPunto {

	public static void main(String[] args) {
		
		Punto p = new Punto("P", -3.4, 4.3);
		System.out.println(p);
		
		Punto q = new Punto(-13.4, 14.3);
		System.out.println(q);
		
		System.out.println("PQ: "+p.distanza(q));
		System.out.println("QP: "+q.distanza(p));
		System.out.println("PO: "+p.distanza());
		/*
		 * Specifica sempre il nome, come nella creazione di P modo da non ottenere null
		 */

	}

}
