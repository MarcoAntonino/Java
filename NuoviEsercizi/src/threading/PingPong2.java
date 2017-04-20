package threading;

public class PingPong2 implements Runnable{
	/*
	 * Questo si usa quando la tua classe eredita da un'altra classe,
	 * perchè la multiereditarietà in Java non è possibile
	 * */
	private String frase;
	private int riposo;
	
	public PingPong2(String frase, int riposo) {
		super();
		this.frase = frase;
		this.riposo = riposo;
		Thread t = new Thread(this); //NB: attiva il thread su quest'oggetto
		t.start();
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
	public void run() { //metodo per gestire cosa fare mentre gira
		while(true){
			System.out.println(frase);
			try {
				Thread.sleep(riposo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
