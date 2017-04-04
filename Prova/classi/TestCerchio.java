package classi;

public class TestCerchio {

	public static void main(String[] args) {
		Cerchio c = new Cerchio(12);
		
		System.out.println("Dati del cerchio: \n"+c.stampa());
		System.out.println();
		c.setRaggio(10);
		System.out.println("Dati del cerchio: \n"+c.stampa());
		System.out.println();
	}

}
