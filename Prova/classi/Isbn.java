package classi;

public class Isbn {
	
	/**
	 * 
	 * @param isbn
	 * @return
	 */
	public static boolean isValid(String isbn){
		if (isbn.length() == 10)
			return true;
		else if (isbn.length() == 13)
			return true;
		else
			return false;
	}

}
