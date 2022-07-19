package Nr3;

public class Automat {
    private String ort;
    private double preisProStunde;

    public Automat(String ort, double preisProStunde){
        this.ort = ort;
        this.preisProStunde = preisProStunde;
    }
    public double getPreisProStunde() {
        return preisProStunde;
    }
    public String getOrt() {
        return ort;
    }
    public String toString(){
        return "Standort: " + ort + "\n" + "Tarif: " + preisProStunde;
    }
    public void showStatus(parkscheinAutomat ref){
        System.out.println("Standort: " + ort + "\n" + "Tarif: " + preisProStunde);
        System.out.println("Anzahl ausgegebener Tickets: " + ref.getAnzTicket());
        System.out.println("Eingenommene Parkgebuehren: " + ref.getEinnahmenAutomat());
        System.out.println("Durchschnittliche Parkdauer: " + (ref.getParkdauer() / ref.getAnzTicket()));
    }
}
