package Nr22;

public class Gegenstand {
    private String bezeichnung;
    private double preis;
    private Wesen besitzer;

    public Gegenstand(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }
    public Gegenstand(String bezeichnung, double preis){
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
    public String getBezeichnung(){
        return this.bezeichnung;
    }
    public double getPreis(){
        return preis;
    }
    public void setBesitzer(Wesen ref){
        this.besitzer = ref;
    }
}
