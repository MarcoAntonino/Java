package interfacce;

public class TestCalciatori {

	public static void main(String[] args) {
		
		Calciatore c1 = new Calciatore ("Andrea Del rio", "San Santi", 56,12,36);
		Calciatore c2 = new Calciatore ("Andrea Del Mio", "San Tanti", 56,26,36);
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		if(c1.equals(c2))
			System.out.println("Gli oggetti c1 e c2 sono uguali");
		else
			System.out.println("Gli oggetti c1 e c2 sono diversi");
			
		Calciatore c3 = c2;
		c3.setNominativo("Pino Oletto"); 
		//entrambi gli oggetti puntano alla stessa istanza
		/*
		 * Collegamento by reference
		 */
		
		System.out.println(c3);
		System.out.println(c2);
		
		Object o = c1;
		Calciatore c4 = null;
		try{
		c4=(Calciatore)c2.clone(); // casting necessario
		}catch(CloneNotSupportedException e){
			System.out.println("Errore! Oggetto non clonato!");
		}
		
		if(c4.equals(c2))
			System.out.println("Gli oggetti c4 e c2 sono uguali");
		else
			System.out.println("Gli oggetti c4 e c2 sono diversi");
			
		
		if(c4!=null){
			c4.setNominativo("Dino Rinato");
			c4.setPartiteGiocate(4);
		}

		System.out.println(c4);
		
		System.out.println("\nClassifica (compareTo): ");
		if(c1.compareTo(c2)==1)
		{
			System.out.println(c1.getNominativo()+", P: "+c1.mediaGol());
			System.out.println(c2.getNominativo()+", P: "+c2.mediaGol());
			}
		else if (c1.compareTo(c2)==-1)
		{
			System.out.println(c2.getNominativo()+", P: "+c2.mediaGol());
			System.out.println(c1.getNominativo()+", P: "+c1.mediaGol());
			}
		else if (c1.compareTo(c2)==0)
		{
			System.out.println("Parimerito");
			
			}
		else
			System.out.println("Errore");
			


	}

}
