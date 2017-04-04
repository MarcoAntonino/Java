package classi;

public class TestPersona {

	public static void main(String[] args) {

		
		Persona pino = new Persona();
		pino.setNome("Pino");
		pino.setCognome("Caluso");
		
		Persona dino = new Persona ("Dino", "Delillo");
		
		Data dNascitaMino = new Data (23,4,1933);
		
		Persona mino = new Persona ("Mino", "Raspino",dNascitaMino,"Loreto");
		System.out.println(mino);

	}

}
