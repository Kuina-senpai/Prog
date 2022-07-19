package Nr1;

import java.util.Arrays;

public class Projekt {

    //Klassen variable
    public static int maxTeilnehmerAnzahlGesamt = 0;
    private static  Person[] teilnehmerliste;
    //Instanz variable
    private String titelDesProjekts;
    private Person projektLeiter; // bestehend aus Name und GB
    private int maxTeilnehmer;
    private boolean standortProjekt; // intern/extern wobei true = intern

    public Projekt() { }

    public Projekt(String titel, Person a){
        titelDesProjekts = titel;
        projektLeiter = a;
    }

    public Projekt(String titel, Person a, int maxT, boolean ort){
        titelDesProjekts = titel;
        projektLeiter = a;
        maxTeilnehmer = maxT;
        teilnehmerliste = new Person[maxT]; //laenge des Arrays ist die max. Teilnehmeranzahl
        standortProjekt = ort;
        maxTeilnehmerAnzahlGesamt += maxT;
    }

    public Person[] getTeilnehmerliste(){
        return teilnehmerliste;
    }

    public void showTeilnehmer(){
        for (int i = 1; i < teilnehmerliste.length; i++){
            System.out.println(teilnehmerliste[i] + " ");
        }
        System.out.println();
    }
    public void showTeilnehmer2(){
        //System.out.println(java.util.Arrays.toString(new String[]{Arrays.toString(teilnehmerliste)}));
        System.out.println(Arrays.toString(teilnehmerliste));
    }
    public void showTeilnehmer3(){
        for (int i = 1; i < teilnehmerliste.length; i++){
            System.out.println( "Teilnehmerliste nr." + i + ": " + teilnehmerliste[i]);
            //man koennte auch wie aus den folien nur print benutzen, jedoch weiß ich nicht wie lang die listen werden
            //deswegen finde ich es sinnvoll die teilnehmer, mit ihrer Nummer auf der liste, untereinander auszugeben
        }
    }
    public void plaetzeFrei(){
        int a = 0;
        for (int i = 1; i < teilnehmerliste.length; i++){
            if (teilnehmerliste[i] == null){
                a++;
            }
            //Null, weil dem Person-Array an der stelle i noch kein Objekt zugewiesen wurde
        }
        System.out.println("Im Projekt \"" + titelDesProjekts + "\" sind noch " + a + " plaetze frei");
    }
    public int plaetzeFreiGenauer() {
        int a = 0;
        for (int i = 1; i < teilnehmerliste.length; i++) {
            if (teilnehmerliste[i] == null) {
                System.out.println(teilnehmerliste[i] + " ist noch frei");
                a++;
            }
        }
        System.out.print("Im Projekt \"" + titelDesProjekts + "\" ist die anzahl der freien plätze =");
        return a;
    }


    public void setStandortProjekt(boolean standortProjektNeu){
        this.standortProjekt = standortProjektNeu;
    }
    public int getMaxTeilnehmer() {
        return maxTeilnehmer;
    }
    public boolean getStandortProjekt() {
        return standortProjekt;
    }

    @Override
    public String toString() {
        return "Projekt{" +
                "titelDesProjekts='" + titelDesProjekts + '\'' +
                ", projektLeiter=" + projektLeiter +
                ", maxTeilnehmer=" + maxTeilnehmer +
                ", standortProjekt=" + standortProjekt +
                '}';
    }

    public String alleSchuelerHabenProjekt(int a){
        if (maxTeilnehmerAnzahlGesamt >= a){ // 1000 = anzahl aller Schüler (kann jederzeit geändert werden)
            return "alle Schüler können zu vorhandenen Projekten zugeteilt werden";
        }else{
            return "es werden nicht genügend Projekte angeboten um alle Schüler unterzubringen";
        }
    }

    public static void main(String[] args) {
        Person[] a = new Person[7];
        System.out.println(java.util.Arrays.toString(new String[]{Arrays.toString(a)}));

    }
}
