package Nr2;

public class Projekt {

    //Klassen variable
    public static int maxTeilnehmerAnzahlGesamt = 0;

    //Instanz variable
    private String titelDesProjekts;
    private Person projektLeiter; // bestehend aus Name und GB
    private int maxTeilnehmer;
    private boolean standortProjekt; // intern/extern wobei true = intern

    public Projekt() { }

    public Projekt (String titel, Person a){
        titelDesProjekts = titel;
        projektLeiter = a;
    }

    public Projekt (String titel, Person a, int maxT, boolean ort){
        titelDesProjekts = titel;
        projektLeiter = a;
        maxTeilnehmer = maxT;
        standortProjekt = ort;
        maxTeilnehmerAnzahlGesamt += maxT;
    }

    public void setMaxTeilnehmer(int maxTeilnehmerNeu) {
        maxTeilnehmerAnzahlGesamt -= maxTeilnehmer;
        maxTeilnehmer = maxTeilnehmerNeu;
        maxTeilnehmerAnzahlGesamt += maxTeilnehmerNeu;
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
    public String toString(){
        return "Titel des Projekts: " + titelDesProjekts + "\n" +
                "Name des Projektleiters " + projektLeiter.getName();
    }
    public String alleSchülerHabenProjekt(int a){
        if (maxTeilnehmerAnzahlGesamt >= a){ // 1000 = anzahl aller Schüler (kann jederzeit geändert werden)
            return "alle Schüler können zu vorhandenen Projekten zugeteilt werden";
        }else{
            return "es werden nicht genügend Projekte angeboten um alle Schüler unterzubringen";
        }
    }


}
