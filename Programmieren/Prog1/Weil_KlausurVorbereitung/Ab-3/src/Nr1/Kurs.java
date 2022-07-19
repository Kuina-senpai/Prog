package Nr1;

public class Kurs {
    private String kursname;
    private double kursGebuehren;
    private double gesamtEinnahmen;
    private int anzTeilnehmer;

    public Kurs(String kursname, double kursGebuehren){
        this.kursname = kursname;
        this.kursGebuehren = kursGebuehren;

    }
    public double getKursGebuehren() {
        return kursGebuehren;
    }

    public double getGesamtEinnahmen() {
        return gesamtEinnahmen;
    }

    public void anmelden(){
        anzTeilnehmer++;
        gesamtEinnahmen += kursGebuehren;
    }
    public String toString(){
        return  "kursname; " + kursname;
    }


}
