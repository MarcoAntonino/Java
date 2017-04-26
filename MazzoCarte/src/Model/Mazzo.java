package Model;

import java.util.Arrays;
import java.util.Random;

public class Mazzo {
	
	private Carta[] mazzo; //sto facendo un'associazione fra classe mazzo e classe carta
	/*
	 * La relazione 1:n si va a realizzare in programmazione con un array
	 * Genera una dipendenza fra carta e mazzo cioè se modifico la classe carta 
	 * il mazzo dipende da questa variazione
	 */
	
	public Mazzo(){
		Seme[] s = Seme.values();
		Valore[] v = Valore.values();
		// in questo modo siamo indipendenti dal numero di carte
		
		mazzo=new Carta[s.length*v.length];
	}
	
	public void crea(){
		int k=0;
		
		for(Seme s : Seme.values())
			for(Valore v : Valore.values())
				mazzo[k++]=new Carta(v,s);
		
	}
	
	public void mescola(){
		
		mescola(150);
	}
	
	
	public void mescola(int numero){
		
		Random r = new Random();
		
		int p1;
		int p2;
		
		for (int i=0; i<numero;i++){
		p1 = r.nextInt(mazzo.length);
		
		
		do{
			p2=r.nextInt(mazzo.length);
		}while(p1==p2);
		
		Carta tmp = mazzo[p1];
		mazzo[p1]=mazzo[p2];
		mazzo[p2]=tmp;
		}
		
		
		
	}

	@Override
	public String toString() {
		
		String msg = "";
		for(Carta c : mazzo)
			msg +=(msg != "" ? "\n":"")+ c;
		
		return msg;
	}
	

}
