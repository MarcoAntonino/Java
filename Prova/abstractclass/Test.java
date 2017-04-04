package abstractclass;

public class Test {
	
	static void paragona(Solido s1, Solido s2)
	{
		if (s1.peso()>s2.peso())
		{
			System.out.println("Il peso del primo solido è maggiore");
		}
		else
		{
			System.out.println("Il peso del secondo solido è maggiore");
		}
	}

	public static void main(String[] args) {
		
		//Solido s = new Solido(7.85); non si può fare 
		
		Solido s; //si crea un oggetto ma non l'istanza
		
		/*
		 * Tabelle di riferimento per i pesi specifici: 
		 * http://www.oppo.it/tabelle/pesi_specifici.html
		 * 
		 */
		//acciaio = 7.85
		
		Materiale acciaio = new Materiale("acciaio", 7.85);
		Materiale alluminio = new Materiale ("alluminio", 2.60);
		Materiale gomma = new Materiale("gomma", 2.00);
		
		Cubo c1 = new Cubo(acciaio, -2.5);
		System.out.println(c1+"\n");
		
		Sfera s1 = new Sfera(acciaio, 2.5);
		System.out.println(s1+"\n");
		
		Cilindro ci1 = new Cilindro(gomma, 2.0, 5.0);
		System.out.println(ci1+"\n");
		
		
		paragona(c1,s1);
		
		
		}
	
	

}
