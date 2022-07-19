public class Karte {
    private String farbe; //{"kreuz" , "pik" , "herz" , "karo"};
    private String wert; // {"7" , "8" , "9" , "10" , "B" , "D" , "K" , "Ass"};

    public Karte(String farbe, String wert){
        this.farbe = farbe;
        this.wert = wert;
    }
    public int punktwert(){
        int i = 0;
        switch (wert){
            case ("B") :
                return i = 2;
            case ("D") :
                return i = 3;
            case ("K") :
                return i = 4;
            case ("Ass") :
                return i = 11;
            case ("10") :
                return i = 10;
        }
        return i;
    }
    public String toString(){
        return farbe + " " + wert;
    }
    public String getFarbe() {
        return farbe;
    }
    public String getWert() {
        return wert;
    }
}
