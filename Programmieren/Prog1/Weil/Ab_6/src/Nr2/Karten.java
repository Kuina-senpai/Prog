package Nr2;

public class Karten {
    private String farbe; //Kreuz, Pik, Herz oder Karo
    private String wert; // 7, 8, 9, 10, B (Bube), D (Dame), K (Konig) oder Ass

    public Karten(){}
    public Karten(String fa, String we){
        this.farbe = fa;
        this.wert = we;
    }
    public String getFarbe() {
        return farbe;
    }
    public String getWert() {
        return wert;
    }

    public String toString(){
        return farbe + " " + wert ;

    }
    public int setzePunktwert(){
        int punktWert = 0;
        String a = getWert();
        switch (a){
            case "B" :
                return punktWert = 2;
            case "D" :
                return punktWert = 3;
            case "K" :
                return punktWert = 4;
            case "Ass" :
                return punktWert = 11;
            case "10" :
                return punktWert = 10;
        }
        return punktWert;
    }

    public static void main(String[] args) {
        Karten test = new Karten("pik" , "B");
        System.out.println(test.setzePunktwert());
    }
}