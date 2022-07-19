public class Automat {
    private String ort;
    private double preisProStunde;
    private int anzTicket;
    private double einnahmenAutomat;
    private double geld;
    private double ticketKosten;
    public Automat(String ort, double preisProStunde){
        this.ort = ort;
        this.preisProStunde = preisProStunde;
    }
    public String toString(){
        return "ort: " + ort + "\n" + "preisProStunde: " + preisProStunde;
    }
    public void erzeugeTicket(int zwei, int eins , int cent){
        this.geld = (zwei * 2) + eins + (cent * 0.5);
        if (geld <= 0){
            System.out.println("ungueltige Eingabe");
        }
        if (geld < preisProStunde){
            System.out.println("Kein Ticket");
            System.out.println("ihr rückgeld in 50 cent münzen: " + rückgeld());
        }
        if (geld >= preisProStunde){
            this.ticketKosten = parkdauer() * preisProStunde;
            this.einnahmenAutomat += ticketKosten;
            anzTicket++;
            System.out.println("mögliche Parkdauer: " + parkdauer());
            System.out.println("Standort: " + ort);
            System.out.println("Parkdauer: " + parkdauer());
            System.out.println("Preis des Tickets: " + ticketKosten);
            System.out.println("Eingeworfener Geld Betrag: " + einnahmenAutomat);
            System.out.println("Ihr Rückgeld: " + rückgeld());
        }
    }
    public void showStatus(){
        System.out.println("Standort: " + ort + "\n" + "Tarif: " + preisProStunde);
        System.out.println("Anzahl ausgegebener Tickets: " + getAnzTicket());
        System.out.println("Eingenommene Parkgebuehren: " + getEinnahmenAutomat());
        System.out.println("Durchschnittliche Parkdauer: " + (parkdauer() / getAnzTicket()));
    }
    private int parkdauer(){
        int i = 0;
        for (double a = geld; a > 0;){
            a -= preisProStunde;
            i++;
        }
        return i;
    }
    private int rückgeld(){
        int i = 0;
        this.ticketKosten = parkdauer() * preisProStunde;
        for (double a = geld - ticketKosten; a > 0;){
            a -= 0.5;
            i++;
        }
        return i;
    }

    public int getAnzTicket() {
        return anzTicket;
    }
    public double getPreisProStunde() {
        return preisProStunde;
    }
    public String getOrt(){
        return ort;
    }
    public double getEinnahmenAutomat() {
        return einnahmenAutomat;
    }

    public static void main(String[] args) {
        Automat a = new Automat("schloss" , 2.5);
        a.erzeugeTicket(5,0,0);

    }
}
