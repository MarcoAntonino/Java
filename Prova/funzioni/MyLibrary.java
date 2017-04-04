package funzioni;

public class MyLibrary {
	
	
	//metodo statico
	public static int lancioDado(){
		return lancioDado(6); 
	}
		
	public static int lancioDado(int noFaccie){
		return (int)(Math.random()*noFaccie+1);
	}

	public static int casualeInfSup(int inf, int sup){
		return (int)(Math.random()*(sup-inf+1)+inf);
	}
	
	public static int estrazione(){
		return (int)(Math.random()*90+1);
	}
}
