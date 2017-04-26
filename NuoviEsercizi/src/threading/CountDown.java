package threading;
/**
 * 
 * @author docente-its
 * 
 * conto alla rovescia
 */
public class CountDown {

	public static void main(String[] args) {
		
		int count =10;
		while(count>0){			
			System.out.println(count--);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		}System.out.println("BOOOOM!!!!");
	}

}
