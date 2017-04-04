package abstractclass;

public abstract class Solido {
	
	private Materiale materiale;

	//peso non può essere vuoto
	/*
	 * Cose da fare:
	 * 1. Reinposta
	 * 2. Cambia metodo di verifica
	 */
	
	
	 public Solido(Materiale materiale) {
	 
		this.materiale = materiale;
	}	
	
	public double peso(){
		return materiale.getPesoSpecifico()*volume();
	}
	
	public abstract double volume();
	
	public abstract double supTot();
	
		
	@Override
	public String toString() {
		return "" 
	+ "pesoSpecifico=" + materiale.getPesoSpecifico() 
	+ "\npeso()=" + peso() 
	+ "\nvolume()=" + volume()
	+ "\nsuperficie totale=" +supTot()
	;
	}

}
