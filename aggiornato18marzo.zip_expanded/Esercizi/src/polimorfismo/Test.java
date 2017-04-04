package polimorfismo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Amministrativo a1 = new Amministrativo("Gino A", 112,50,Mansione.CONTABILE);
		Amministrativo a2 = new Amministrativo("Gino B", 120,30,Mansione.RISORSEUMANE);
		Amministrativo a3 = new Amministrativo("Gino A", 12,100,Mansione.DIRETTORE);
		
		Amministrativo[] elenco = new Amministrativo[3]; // array di oggetti
		elenco[0]=a1;
		elenco[1]=a2;
		elenco[2]=a3;
		
		System.out.println("Elenco amministrativi");
		for(int i=0; i<elenco.length;i++)
			System.out.println(elenco[i]);
		
		Operaio o1 = new Operaio("Dino A", 100, 12.5, Settore.LOGISTICA);
		Operaio o2 = new Operaio("Dino B", 100, 12.5, Settore.PRODUZIONE);
		Operaio o3 = new Operaio("Dino C", 100, 12.5, Settore.MANUTENZIONE);
		
		System.out.println();
		
		System.out.println("Lista operai");
		Operaio [] lista ={o1,o2,o3};
		for(Operaio o : lista)
			System.out.println(o);
		
		OperaioSpecializzato os1 = new OperaioSpecializzato("Mino A", 100, 12.5, Settore.LOGISTICA,1,450);
		OperaioSpecializzato os2 = new OperaioSpecializzato("Mino B", 80, 15.5, Settore.LOGISTICA,1,450);
		OperaioSpecializzato os3 = new OperaioSpecializzato("Mino C", 60, 12.5, Settore.LOGISTICA,1,450);

		System.out.println();
		
		System.out.println("Lista operai specializzati");
		OperaioSpecializzato [] listaSpecializzati ={os1,os2,os3};
		for(OperaioSpecializzato os : listaSpecializzati)
			System.out.println(os);
		
		

		
		// non sto instanziando d ma bensì lo faccio puntare a o
		/*
		 * in java qualasia cosa è un object, un modo per poter capire di cosa stiamo parlando è instanceof
		 * ci sono dei tipi ad integrare un oggetto, le classi wrapper: Integer, String, Float
		 * 
		 */
		
		
		//Integer n = new Integer(4);
		//uguale int n=4;
		/*
		 * n. è un oggetto e quindi accede a tutti i metodi di Integer
		 */
		


	}

}
