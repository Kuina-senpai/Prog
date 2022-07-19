package Nr2;

public class Projekt {
    private String titel;
    private Person projektleiter;
    private int maxTeilnehmer;
    private boolean intern = true;
    private int anzSchueler;
    private Person[]teilnehmerListe;
    private int[]freiePlätze;
    private static int gesamtAnzPlaetze;
    //muss static sein ansonsten ist die methode alleSchuelerUntergebracht immer false
    //mit static werden die Projektobjekte verbunden und die gesamtanzahl abgefragt
    //würde man static nicht verwenden müsste man manuell die einzelnen plätze der Projekte zusammenrechnen und mit der anzahl der schüler vergleichen

    //Keine set Methoden für Titel und Projektleiter

    public Projekt(String titel, Person ref, int maxTeilnehmer, boolean standort){
        this.titel = titel;
        this.projektleiter = ref;
        this.maxTeilnehmer = maxTeilnehmer;
        teilnehmerListe = new Person[maxTeilnehmer];
        freiePlätze = new int[maxTeilnehmer];
        this.intern = standort;
        Projekt.gesamtAnzPlaetze += this.maxTeilnehmer;
    }
    public void showteilnehmer(){
        for (int i = 0; i < teilnehmerListe.length; i++){
            System.out.println(teilnehmerListe[i]);
        }
    }
    public boolean plaetzeFrei(){
        int a = 0;
        for (int i = 0; i < teilnehmerListe.length; i++){
            if (teilnehmerListe[i] == null){
                freiePlätze[i] = 0;
                a++;
            }
        }
        if (a > 0){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Titel: " + titel + "\n" +
                "Name des Projektleiters: " + projektleiter.getName();
    }

    public void setTeilnehmerListe(Person a , int position) {
        this.teilnehmerListe[position] = a;
    }

    public void setFreiePlätze(int position) {
        this.freiePlätze[position] = 1;
    }
    public int[] getFreiePlätze() {
        return freiePlätze;
    }
    public Person[] getTeilnehmerListe() {
        return teilnehmerListe;
    }
    public void setMaxTeilnehmer(int a) {
        int i = gesamtAnzPlaetze - this.maxTeilnehmer;
        gesamtAnzPlaetze = i + (a); //die plätze können sich auch verringern
    }
    public void setAnzSchueler(int anzSchueler) {
        this.anzSchueler = anzSchueler;
    }
    public boolean alleSchuelerUntergebracht(){
        return gesamtAnzPlaetze > anzSchueler;
    }
}

