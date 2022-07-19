package Nr3;

public class Automat {
    public String ort;
    public double preisProStunde;

    public Automat(){
        ort = "";
        preisProStunde = 0;
    }
    public Automat (String s, double a){
        ort = s;
        preisProStunde = a;
    }
    public String getOrt (){
        return ort;
    }
    public double getPreisProStunde(){
        return preisProStunde;
    }
    public String settOrt (){
        return ort;
    }
    public double setPreisProStunde(){
        return preisProStunde;
    }

    @Override
    public String toString() {
        return "Automat{" +
                "ort='" + ort + '\'' +
                ", preisProStunde=" + preisProStunde +
                '}';
    }
    public String showStatus(ParkscheinAutomat b){
        return "Standort: " + ort + "\n" +
                "Anzahl Tickets: " + b.anzahlTickets + "\n" +
                "Einnahmen vom Automat: " + b.einnahmenAutomat + "\n" +
                "durchschnittliche Parktauer: " + (b.anzahlStunden /b.anzahlTickets);

    }
}
