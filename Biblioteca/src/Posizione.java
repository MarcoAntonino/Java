
public class Posizione {
	
	private String stanza;
	private int scaffale;
	private int ripiano;
	
	public Posizione() {
	}

	public Posizione(String stanza, int scaffale, int ripiano) {
		this.stanza = stanza;
		this.scaffale = scaffale;
		this.ripiano = ripiano;
	}

	@Override
	public String toString() {
		return "Posizione [" + (stanza != null ? "stanza=" + stanza + ", " : "") + "scaffale=" + scaffale + ", ripiano="
				+ ripiano + "]";
	}
	
	
	
	

}
