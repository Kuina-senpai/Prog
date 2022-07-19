package Nr1alternative;

public abstract class Medium {
	private static int fNummer = 1000;
	private String title;
	private int nummer;
	private boolean verfuegbar = true;
	private Nutzer ausleiher;
	
  public Medium(String t) {
	  this.title = t;
	  this.nummer = fNummer;
	  fNummer++;

  }
  public String getTitle() {
	  return title;
  }
  public int getNummer() {
	return nummer;
	  
  }
  public abstract String signatur();
  
  public void setAusgeliehen(boolean b) {
	  this.verfuegbar = b;
  }
  public boolean getAusgeliehen() {
	  return verfuegbar;
  }
  public void setAusleiher(Nutzer n) {
	  this.ausleiher = n;
	  
  }
  public Nutzer getAusleiher() {
	  return ausleiher;
  }
  
}
	

