package interfacce;

public class Calciatore extends Atleta implements Comparable, Cloneable {
	
	private int pettorina;
	private int partiteGiocate;
	private int golSegnati;
	
	public Calciatore() {
		super();
	}

	public Calciatore(String nominativo, String club, int pettorina, int partiteGiocate, int golSegnati) {
		super.setClub(club);
		super.setNominativo(nominativo);
		this.pettorina = pettorina;
		this.partiteGiocate = partiteGiocate;
		this.golSegnati = golSegnati;
		super.setDisciplina("Calcio");
	}

	public int getPettorina() {
		return pettorina;
	}

	public void setPettorina(int pettorina) {
		this.pettorina = pettorina;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}

	public int getGolSegnati() {
		return golSegnati;
	}

	public void setGolSegnati(int golSegnati) {
		this.golSegnati = golSegnati;
	}
	
	public double mediaGol()
	{
		return (double) golSegnati/partiteGiocate;
	}
	
	
	//metodo clones
	/*
	 * viene gi� creata una gestione di un'eccezione
	 */
	

	@Override 
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + golSegnati;
		result = prime * result + partiteGiocate;
		result = prime * result + pettorina;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //restituisce il tipo di classe
			return false;
		Calciatore other = (Calciatore) obj; //casting
		//if(!super.equals(/*(Atleta)*/obj))
			//return false;
		if (this.getNominativo() != other.getNominativo())
			return false;
		if (this.getClub() != other.getClub())
			return false;
		if (this.getDisciplina() != other.getDisciplina())
			return false;
		if (golSegnati != other.golSegnati)
			return false;
		if (partiteGiocate != other.partiteGiocate)
			return false;
		if (pettorina != other.pettorina)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object obj) {
				
		// => 1 se maggiore
		// => 0 se uguale
		// => -1 se minore
		// -2 in tutti gli altri casi
		
		if(obj == null)
			return -2;
		if (obj.getClass()!=this.getClass())
			return -2;
		
		Calciatore other = (Calciatore)obj;
		if(other.mediaGol()<this.mediaGol())
			return 1;
		else if (other.mediaGol()>this.mediaGol())
			return -1;
		return 0;		
	}
	
	
	@Override
	public String toString() {
		return "" 
	+ (super.toString() != null ? super.toString() + ", " : "")
	+ "getPettorina()=" + getPettorina() 
	+ ", getPartiteGiocate()=" + getPartiteGiocate()
	+ ", getGolSegnati()=" + getGolSegnati()
	+ ", mediaGol()=" + mediaGol()
	
	;
	}

	

	

}

