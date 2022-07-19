package Ab8;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;
    private static String rf = "jmt";
    private static String zeichen = "-";

    public Datum(){
        this.tag = 1;
        this.monat = 1;
        this.jahr = 1;
    }
    public Datum(int jahr){
        this.tag = 1;
        this.monat = 1;
        this.jahr = jahr;

    }
    public Datum(int jahr, int monat){
        this.tag = 1;
        this.monat = monat;
        this.jahr = jahr;
    }
    public Datum(int jahr, int monat, int tag){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }
    public Datum(Datum ref){
        this.tag = ref.tag;
        this.monat = ref.monat;
        this.jahr = ref.jahr;
    }
    public int getJahr() {
        return jahr;
    }
    public int getMonat() {
        return monat;
    }
    public int getTag() {
        return tag;
    }
    public boolean equals(Datum ref){
        if (this.tag == ref.tag && this.monat == ref.monat && this.jahr == ref.jahr){
            return true;
        }
        return false;
    }
    public boolean istFrueher(Datum ref){
        if (this.jahr < ref.jahr){
            return true;
        }
        if (this.jahr <= ref.jahr && this.monat < ref.monat){
            return true;
        }
        if (this.jahr <= ref.jahr && this.monat <= ref.monat && this.tag < ref.tag){
            return true;
        }
        return false;
    }
    public String toString(){
        String n = "0";
        String t = "" + tag;
        String m = "" + monat;
        if (this.tag < 10){
            t = n + tag;
        }
        if (this.monat < 10){
            m = n + monat;
        }
        if (this.tag < 10 && this.monat < 10){
            t = n + tag;
            m = n + monat;
        }
        switch (rf){
            case ("tmj") : return t + zeichen + m + zeichen + jahr;
            case ("mtj") : return m + zeichen+ t + zeichen + jahr;
            default: return jahr + zeichen + m + zeichen + t;
        }
    }
    public void setFormatRF(String reihenFolge){
        rf = reihenFolge;
    }
    public void setFormatTZ(String trennZeichen) {
        zeichen = trennZeichen;
    }

    public static void main(String[] args) {
       Datum a = new Datum();
       Datum b = new Datum(2001,1,5);
       System.out.println(b.toString());
       a.setFormatRF("mtj");
       a.setFormatTZ("/");
       System.out.println(a.toString());

    }
}
