package Nr0;

public class Person {
	// Klassenattribute
	private static int wahlAlter = 18;
	
	// Instanzattribute
	
	private String name;
	private int gebJahr;
	
	// Konstruktoren

	
	public Person (String n, int j) {
		name = n;
		gebJahr = j;
	}
	
	// Klassenmethoden
	public static int getWahlalter() {
		return wahlAlter;
	}
	
	public static void setWahlAlter(int alter) {
		wahlAlter = alter;
	}
	
	// spezielle Instanz-Methoden: getter und setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getGebJahr() {
		return gebJahr;
	}
	
	// weitere Instanzmethoden
	
	public int alter(int jahr) {
		return jahr - gebJahr;
	}
		
	public boolean volljaehrig(int jahr) {
		return alter(jahr) >= wahlAlter;
	}
	
	public String toString() {
		return name;
	}

}
