package Nr1alternative;

public class Nutzer extends Person_1 {
	private  static int fNummer = 2000; 
	private int iDNummer;
	private  Medium[] array = new Medium [10];
	private int medZaehler = 0;
	
	public Nutzer() {
		this.iDNummer = fNummer;
		fNummer++;
	}
	public int getiD() {
		return this.iDNummer;
	}
	public boolean ausleihen(Medium m) {
		if(medZaehler < 10 && m.getAusgeliehen()) {//ruft ausgelieh 
		array[medZaehler] = m;
		medZaehler++;
		m.setAusgeliehen(false);
		m.setAusleiher(this);//this ist der nutzer der ausleiht
		return true; //ist ausgeliehen
			
		}
		return false;
	}
	public Medium[] ausleihListe() {
		return array;
	}
	
	public void allezurueckgeben() {
		for(int i = 0; i < 10; i++) {
			array[i].setAusgeliehen(false);//jedes medium kann wieder ausgeliehen werden
			array[i] = null; //leer
			
		}
		medZaehler = 0;
	}
	public void printListe() {// 8.1b
		for (int i = 0; i < medZaehler; i++) {
			System.out.println(array[i].signatur());
		}
	}

}
