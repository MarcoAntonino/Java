package gui;

import java.awt.Frame;

public class Finestra {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setTitle("La mia finestra in Java");
		f.setLocation(235, 394);
		f.setSize(400, 300);
		f.setVisible(true);
		/*
		 * La finestra non si chiude perch� il pulsante con la x non � gestito
		 * La x � un evento: il click
		 */
		
		
	}

}
