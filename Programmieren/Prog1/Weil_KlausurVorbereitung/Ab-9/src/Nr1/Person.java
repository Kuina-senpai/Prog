package Nr1;

public class Person {
    // Version 2: auch Klassen-Attribute und -Methoden

    // Klassenattribute
    private static int wahlberechtigtAb = 18;
    private static int count = 0;

    // Instanzattribute

    private String name;
    private int alter;
    private int gebJahr;
    private double groesse;
    private double gewicht;

    // Konstruktoren

    public Person(String name) {
        count++;
    }
    public Person(String name , int alter){
        this.name = name;
        this.alter = alter;
        count++;
    }

    public Person(String name, int gebJahr, double groesse, double gewicht) {
        this(name, gebJahr);
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    // Klassenmethoden

    public static int getWahlAlter() {
        return wahlberechtigtAb;
    }

    public static void setWahlAlter(int alter) {
        wahlberechtigtAb = alter;
    }

    public static int getCount() {
        return count;
    }

    public double bmis(double groesse, double gewicht) {
        return gewicht/(groesse*groesse);
    }

    public static double bmi(Person p) {
        return p.gewicht/(p.groesse*p.groesse);
    }

    // Instanzmethoden

    public void setName(String name) {
        this.name = name;
    }

    public void setGebJahr(int jahr) {
        gebJahr = jahr;
    }

    public void setGewicht(double g) {
        gewicht = g;
    }

    public void setGroesse(double g) {
        groesse = g;
    }

    public String getName() {
        return name;
    }

    public int getGebJahr() {
        return gebJahr;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getGroesse() {
        return groesse;
    }

    public int getAlter() {
        return alter;
    }

    public int alter(int jahr) {
        return jahr-gebJahr;
    }

    public double bmi() {
        // Instanzmethode: benötigt keine Parameter
        return gewicht/(groesse*groesse);
    }

    public boolean volljaehrig(int jahr) {
        return alter(jahr) >= 18; // hier: Aufruf der Methode alter()
    }

    public String toString() {
        return this.name + " (" + this.gebJahr + ")";
    }

}
