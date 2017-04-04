package abstractclass;

public class Materiale {
	
	private String nome;
	private double pesoSpecifico;
	
	public Materiale(String nome, double pesoSpecifico) {
		this.nome = nome;
		this.pesoSpecifico = pesoSpecifico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPesoSpecifico() {
		return pesoSpecifico;
	}

	public void setPesoSpecifico(double pesoSpecifico) {
		this.pesoSpecifico = pesoSpecifico;
	}

	@Override
	public String toString() {
		return "" 
	+ (nome != null ? "nome=" + nome + ", " : "") 
	+ (pesoSpecifico != 0 ? "pesoSpecifico=" + pesoSpecifico : "")
	;
	}
	
	

}
