package Nr1alternative;

public class DVD extends Medium{
	
	public DVD(String t) {
		super(t);
		
	}

	public String signatur() {
		 return "DVD "+ super.getNummer();
	}

}
