package Nr1;

public class Member {

    //Klassen variable
    public static int mitgliedsNummer;
    public static double mitgliedsBeitrag;

    //Instanz variable
    public String nameDesMembers;
    public double mitgliedsBeitragGesamt;
    public int besuchteKurse;

    //Konstruktor
    public Member(){ }

    //Konstruktor
    public Member (String s){
        nameDesMembers = s;
        mitgliedsNummer += 1;
    }

    //Klassenmethode
    public static void setMitgliedsBeitrag(double a) {
        mitgliedsBeitrag = a;
    }

    //Instanz methoden
    public void buchen (kurs a){
        mitgliedsBeitragGesamt += a.kostenProMonatKurs + mitgliedsBeitrag;
        besuchteKurse += 1;
        a.anmelden();
    }

    public int getBesuchteKurse() {
        return besuchteKurse;
    }

    public double getMitgliedsBeitragGesamt() {
        return mitgliedsBeitragGesamt;
    }

    public String toString(){
        return "" + nameDesMembers + " " + mitgliedsNummer;
    }
}
