package threading;

public class PingPong extends Thread{
	
	private String frase;
	private int riposo;
	
	public PingPong(String frase, int riposo) {
		
		this.frase = frase;
		this.riposo = riposo;
		start(); //ereditato da Thread, molto importante
	}

	
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public int getRiposo() {
		return riposo;
	}

	public void setRiposo(int riposo) {
		this.riposo = riposo;
	}
	
	@Override
	public void run() {
		
		
		while(true){ // metodo che mantiene in vita l'oggetto
			System.out.println(frase);
			try {
				sleep(riposo); //millisecondi di riposo. Metodo statico della classe Thread.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
			
		
	}
	
	

}
