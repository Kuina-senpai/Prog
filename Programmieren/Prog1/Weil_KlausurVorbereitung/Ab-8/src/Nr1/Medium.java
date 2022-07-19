package Nr1;

public abstract class Medium {
    private String titel;
    private boolean verfügbarkeit = true;
    private int nummer = 0;
    private Nutzer ausleiher;

    private static int num = 1000;

    public Medium(String titel){
        this.titel = titel;
        nummer = num;
        num ++;
    }
    public abstract String signatur();
    public int getNummer() {
        return nummer;
    }

    public boolean getVerfügbarkeit() {
        return verfügbarkeit;
    }

    public String getAusleiher() {
        return ausleiher.getName();
    }

    public void setAusleiher(Nutzer ausleiher) {
        this.ausleiher = ausleiher;
    }

    public void setVerfügbarkeit(){
        verfügbarkeit = false;
    }
}
