package Nr0;

public class Modul {
	
	private String titel;
	private int cp;
	
	public Modul(String titel, int cp) {
		this.titel = titel;
		this.cp = cp;
	}
	
	public String titel() {
		return this.titel;
	}
	
	public int getCP() {
		return this.cp;
	}
	
	public String toString() {
		return this.titel;
	}

}

