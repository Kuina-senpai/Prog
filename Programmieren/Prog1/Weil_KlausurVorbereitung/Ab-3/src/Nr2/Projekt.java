package Nr2;

public class Projekt {
    private String titel;
    private Person projektleiter;
    private int maxTeilnehmer;
    private boolean intern = true;
    private int anzSchueler;
    private static int gesamtAnzPlaetze;
    //muss static sein ansonsten ist die methode alleSchuelerUntergebracht immer false
    //mit static werden die Projektobjekte verbunden und die gesamtanzahl abgefragt
    //würde man static nicht verwenden müsste man manuell die einzelnen plätze der Projekte zusammenrechnen und mit der anzahl der schüler vergleichen

    //Keine set Methoden für Titel und Projektleiter
    public Projekt (String titel, Person ref){
        this.titel = titel;
        this.projektleiter = ref;
    }
    public Projekt (String titel, Person ref, int maxTeilnehmer){
        this.titel = titel;
        this.projektleiter = ref;
        this.maxTeilnehmer = maxTeilnehmer;
        Projekt.gesamtAnzPlaetze += this.maxTeilnehmer;
    }
    public Projekt (String titel, Person ref, boolean standort){
        this.titel = titel;
        this.projektleiter = ref;
        this.intern = standort;
    }
    public Projekt (String titel, Person ref, int maxTeilnehmer, boolean standort){
        this.titel = titel;
        this.projektleiter = ref;
        this.maxTeilnehmer = maxTeilnehmer;
        this.intern = standort;
        Projekt.gesamtAnzPlaetze += this.maxTeilnehmer;
    }

    public void setMaxTeilnehmer(int a) {
        int i = gesamtAnzPlaetze - this.maxTeilnehmer;
        gesamtAnzPlaetze = i + (a); //die plätze können sich auch verringern
    }

    public String toString(){
        return "Titel: " + titel + "\n" +
                "Name des Projektleiters: " + projektleiter.getName();
    }
    public void setAnzSchueler(int anzSchueler) {
        this.anzSchueler = anzSchueler;
    }
    public boolean alleSchuelerUntergebracht(){
        return gesamtAnzPlaetze > anzSchueler;
    }
}

