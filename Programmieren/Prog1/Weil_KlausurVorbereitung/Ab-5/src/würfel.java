import java.util.Random;

public class würfel {
    private static Random r = new Random (); //statischer zufalls-zahlen-generator
    private int augenZahl;

    public würfel(){
        this.augenZahl = r.nextInt(0,6) + 1;
        // Alternativ ... = r.nextInt(1,7) gibt werte von eins bis 7
        //erster wert mit einbezogen, zweiter wert nicht mit einbezogen
    }
    public static boolean pasch(würfel a , würfel b){
        return a.getAugenZahl() == b.getAugenZahl();
    }
    public int wuerfeln(){
        this.augenZahl = r.nextInt(0,6) + 1;
        return augenZahl;
    }
    public int getAugenZahl() {
        return augenZahl;
    }
}
