package interfacce;

public class Atleta implements IAtleta, INuotatore, IAtletaUniversale{
	
	//attributi
	
	private String nominativo;
	private String club;
	private String disciplina;
	
	public Atleta() {
		super();
	}
	public Atleta(String nominativo, String club) {
		super();
		this.nominativo = nominativo;
		this.club = club;
	}
	
	public Atleta(String nominativo, String club, String disciplina) {
		super();
		this.nominativo = nominativo;
		this.club = club;
		this.disciplina = disciplina;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public String corro() {
		return "Sto Correndo....";
	}
	@Override
	public String salto() {
		return "Sto salntando...";
	
	}
		@Override
	public String nuoto() {
		return "Sto nuotando...";
	
		
	}
	@Override
		public String mangio() {
		return "Sto mangiando...";
		}
	
	@Override
	public String bevo() {
		return "Sto bevendo...";
		}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + ((nominativo == null) ? 0 : nominativo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (nominativo == null) {
			if (other.nominativo != null)
				return false;
		} else if (!nominativo.equals(other.nominativo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Atleta [" 
				+ (nominativo != null ? "nominativo=" + nominativo + ", " : "")
				+ (club != null ? "club=" + club + ", " : "")
				+ (disciplina != null ? "disciplina=" + disciplina + ", " : "")
				+ (corro() != null ? corro() + ", " : "") 
				+ (salto() != null ? salto() : ", ")
				+ (nuoto() != null ? nuoto() : ", ")
				+ (mangio() != null ? mangio() : ", ")
				+ (bevo() != null ? bevo() : "")
				+ "]";
	}
	
	
	
	
	
	

}
