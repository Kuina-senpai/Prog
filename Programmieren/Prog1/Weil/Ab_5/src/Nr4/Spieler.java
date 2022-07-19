package Nr4;

import Nr3.Würfel;

public class Spieler {

    private static Würfel a = new Würfel(); //Klassenattribut

    public String name;
    public int punktzahl = 0;

    public Spieler(String a){
        this.name = a;
    }
    public String getName() {
        return name;
    }
    public int punkte() {
        return punktzahl;
    }
    public void punktPlus(){
        punktzahl++;
    }
    public void punktPlus(int n){
        punktzahl += n;
    }
    public void reset(){
        punktzahl = 0;
    }
    public String toString(){
        return "Name des Spielers: " + name + "\n" +
                "Punktestand: " + punktzahl;
    }
    public int wuerfeln(){
        return a.wuerfeln();
    }
}
