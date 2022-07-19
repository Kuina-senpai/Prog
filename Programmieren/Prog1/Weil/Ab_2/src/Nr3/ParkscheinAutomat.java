package Nr3;

public class ParkscheinAutomat {

    public int anzahlTickets;
    public double einnahmenAutomat;
    public double anzahlStunden;

    public ParkscheinAutomat( int i) {
        anzahlStunden = i;
    }

    public String erzeugeTicket(Automat a){
        anzahlTickets++;
        einnahmenAutomat += (anzahlStunden * a.preisProStunde);
        return  "standort: " + a.getOrt() + "\n" + "Parkdauer: " + anzahlStunden;
    }
}
