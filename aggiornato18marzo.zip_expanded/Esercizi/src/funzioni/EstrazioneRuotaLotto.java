package funzioni;

public class EstrazioneRuotaLotto {
	
	public static int estrazione(){
		return (int)(Math.random()*90+1);
	}

	public static void main(String[] args) {
		/*
		 * Estrazione dei numeri della ruota del lotto di Torino
		 * Si tratta di un'estrazione senza reimissione
		 */
		
		int e1,e2,e3,e4,e5;
		
		e1=estrazione();
		do {
			e2=estrazione();
		}while(e1==e2);
		
		do{
			e3=estrazione();
		}while(e1==e3 || e2==e3);
		
		do{
			e4=estrazione();
		}while(e1==e4 || e2==e4 || e3==e4);
		
		do{
			e5=estrazione();
		}while(e1==e5 || e2==e5 || e3==e5 || e4==e5);
		
		System.out.println("Torino: "+e1+" "+e2+" "+e3+" "+e4+" "+e5);
		
		e1=MyLibrary.estrazione();
		do {
			e2=MyLibrary.estrazione();
		}while(e1==e2);
		
		do{
			e3=MyLibrary.estrazione();
		}while(e1==e3 || e2==e3);
		
		do{
			e4=MyLibrary.estrazione();
		}while(e1==e4 || e2==e4 || e3==e4);
		
		do{
			e5=MyLibrary.estrazione();
		}while(e1==e5 || e2==e5 || e3==e5 || e4==e5);
		
		System.out.println("Bari: "+e1+" "+e2+" "+e3+" "+e4+" "+e5);
		

	}

}
