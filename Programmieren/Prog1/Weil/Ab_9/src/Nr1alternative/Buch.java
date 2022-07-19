package Nr1alternative;

public class Buch extends Medium{

	public Buch(String t) {
		super(t);
		
	}

	public String signatur() {
		 return "B "+ super.getNummer();
	}

}
