package Nr3;

import java.util.Random;

public class Würfel {

    //klassenvariable
    private static Random r = new Random (); //statischer zufalls-zahlen-generator

    //instanz variable
    public int wert;

    //konstruktor
    public Würfel(){
        wert = r.nextInt(6) + 1;
    } // werte von 1 bis 6 (ohne +1 werte von 0 bis 5)

    public int getWert() {
        return wert;
    }
    //instanzmethode
    public int wuerfeln(){
        wert = r.nextInt(6) + 1;
        return wert;
    }
    //Klassenmethoden
    public static boolean vergleich(Würfel r1 , Würfel r2){
        return r1.getWert() == r2.getWert();
    }
}
