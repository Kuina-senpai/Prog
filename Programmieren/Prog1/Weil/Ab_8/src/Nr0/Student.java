package Nr0;

public class Student extends Person {
	
	// Klassenattribute
	private static int nextMatNr = 9000000;
	
	// Instanzattribute
	
	// String name wird von Person geerbt
	// int gebJahr wird von Person geerbt
	private int matNr;
	private double[] note = new double[10];
	private Modul[] module = new Modul[10];
	private int anz = 0; // Anzahl abgelegter Modulpruefungen
	private int cp = 0; // Anzahl ECTS-Punkte
	
	// Konstruktoren
	public Student (String name, int gebJahr) {
		super(name, gebJahr);
		this.matNr = nextMatNr;
		nextMatNr = nextMatNr + 1;
	}
	
	// Instanzmethoden
	
	// getter und setter
	
	public int matNr() {
		return matNr;
	}
	
	public double getNote(int modulNr) {
		return note[modulNr];
	}
	
	public int erreichteCP() {
		return cp;
	}
	
	public void pruefung(Modul m, double erg) {
		module[anz] = m;
		note[anz] = erg;
		anz++;
		if ( erg < 5.0)
			cp = cp + m.getCP();
	}
	
	public void notenspiegel() {
		System.out.println("Notenspiegel von " + this.toString());
		for (int i = 0; i < anz; i++)
			System.out.println(module[i].titel() + "\t" + note[i]);
		System.out.println("Summe ECTS-Punkte: " + cp);
	}
	
	public String toString() {
		return super.toString() + "(" + matNr + ")";
	} 
}
