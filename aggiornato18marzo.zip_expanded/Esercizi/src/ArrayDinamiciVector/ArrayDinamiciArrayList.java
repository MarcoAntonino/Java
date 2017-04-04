package ArrayDinamiciVector;

import java.util.GregorianCalendar;

import java.util.*;

import classi.*;

public class ArrayDinamiciArrayList {

	public static void main(String[] args) {
		
		//array dinamici
		
		ArrayList elenco = new ArrayList();
		System.out.println("Dimensione: "+elenco.size());
		
		elenco.add(new Punto());
		elenco.add(new Data(12,3,1999));
		elenco.add(new Cerchio(5.6));
		elenco.add(12.5);
		elenco.add(45);
		elenco.add(false);
		elenco.add("Pino");
		elenco.add(new GregorianCalendar());
		elenco.add(0);
		
		for(int i=0; i<elenco.size(); i++)
		{
			System.out.println(elenco.get(i)); // viene restituito il tostring
		}
		
		for(Object o: elenco){
			Punto p = null; //buona prassi
			if(o instanceof Punto){
				p=(Punto)o;
			}
			System.out.println(p.distanza());
			}
//questo per stampare solo una tipologia di oggetto
		
		elenco.remove(false); //rimuove un elemento specifico
		for(int i=0; i<elenco.size(); i++)
		{
			System.out.println(elenco.get(i)); 
		}
		
		Object obj = elenco.remove(3); // rimuove l'elemento con indice 3
		System.out.println("Elemento rimosso: "+obj);
		for(int i=0; i<elenco.size(); i++)
		{
			System.out.println(elenco.get(i)); 
		}
		
		elenco.set(3, new Persona("Pino", "Caluso")); //sostistuisce questo con quello che c'era
		for(int i=0; i<elenco.size(); i++)
		{
			System.out.println(elenco.get(i)); 
		}
		
		elenco.add(3, new Persona("Rino","Deluso")); //va ad inserire in quella posizione
		//tutto il resto shifta
		for(int i=0; i<elenco.size(); i++)
		{
			System.out.println(elenco.get(i)); 
		}

		
		

	}

}
