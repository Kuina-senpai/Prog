package Ab10;
import static Ab3.Datum.istSchaltjahr;

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
    public String monatFuerName(int n){
        switch (n){
            case 1 : return "Januar";
            case 2 : return "Februar";
            case 3 : return "Maerz";
            case 4 : return "April";
            case 5 : return "Mai";
            case 6 : return "Juni";
            case 7 : return "Juli";
            case 8 : return "August";
            case 9 : return "September";
            case 10 : return "Oktober";
            case 11 : return "November";
            case 12 : return "Dezember";
            default: throw new IllegalArgumentException();
        }
    }
    public int nameFuerMonat(String s){
        switch (s){
            case "Januar" : return 1;
            case "Februar" : return 2;
            case "Maerz" : return 3;
            case "April" : return 4;
            case "Mai" : return 5;
            case "Juni" : return 6;
            case "Juli" : return 7;
            case "August" : return 8;
            case "September" : return  9;
            case "Oktober" : return 10;
            case "November" : return 11;
            case "Dezember" : return 12;
            default: throw new IllegalArgumentException();
        }
    }
    public String toString(){
        String n = "0";
        String t = "" + tag;
        String m = "" + monat;
        if (zeichen.equals("-") || zeichen.equals(",") || zeichen.equals(".") || zeichen.equals("_") || zeichen.equals("/")){
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
        }else{
            if (this.tag < 10){
                t = n + tag;
            }
            switch (rf){
                case ("tmj") : return t + ". " + monatFuerName(monat) + " " + jahr;
                case ("mtj") : return monatFuerName(monat) + " " + t + ". " + jahr;
                default: return jahr + " " + monatFuerName(monat) + " " + t;
            }
        }
    }
    public int tageInMonat(int jahr, int monat)throws Exception{
        switch (monat){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 9 :
            case 11:
                return 31;
            case 2 : if (istSchaltjahr(jahr)) {
                        return 29;
                    }
                    else {
                        return 28;
            }
            case 4 :
            case 6 :
            case 8 :
            case 10 :
            case 12 :
                return 30;
            default: throw new IllegalArgumentException("ungueltiger Wert fuer " + rf + " : " + monat);
        }
    }
    public void setFormatRF(String reihenFolge)throws Exception{
        if (reihenFolge == null){
            throw new NullPointerException();
        }
        if((reihenFolge.equals("tmj")) || (reihenFolge.equals("mtj")) || (reihenFolge.equals("jmt"))){
            rf = reihenFolge;
        }
        else{
            throw new IllegalArgumentException("ungueltiger Wert fuer Format-Reihenfolge: " + '\"' + reihenFolge + '\"');
        }

    }
    public void setFormatTZ(String trennZeichen) {
        zeichen = trennZeichen;
    }

    public static void main(String[] args) throws Exception{
       Datum a = new Datum();
       Datum b = new Datum(2001,1,5);
       b.setFormatRF("mj");
       b.setFormatTZ("-");
       System.out.println(b.toString());
    }

}