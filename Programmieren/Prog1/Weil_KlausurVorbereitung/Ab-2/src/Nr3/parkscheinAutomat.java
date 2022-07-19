package Nr3;

public class parkscheinAutomat {
    private int anzTicket;
    private double einnahmenAutomat;
    private int parkdauer;

    public String erzeugeTicket(int std, Automat ref){
        this.parkdauer += std;
        double kosten = ref.getPreisProStunde() * std;
        einnahmenAutomat += kosten;
        anzTicket++;
        return "Standort: " + ref.getOrt() + "\n" + "Parkdauer: " + std;
    }
    public int getAnzTicket(){
        return anzTicket;
    }
    public double getEinnahmenAutomat(){
        return einnahmenAutomat;
    }
    public int getParkdauer(){
        return parkdauer;
    }
}
