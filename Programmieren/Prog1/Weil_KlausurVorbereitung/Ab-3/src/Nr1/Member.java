package Nr1;

public class Member { // Kommentar zu static und nicht static in Notizen 3
    private String name;
    private int mitgliedsnummer;
    private static double clubMitgliedschaft = 90;
    private int anzBesuchteKurse;
    private double monatsBeitrag = clubMitgliedschaft;

    public Member(String name){
        this.name = name;
        mitgliedsnummer++;
    }

    public static void setClubMitgliedschaft(double clubMitgliedschaft) {
        Member.clubMitgliedschaft = clubMitgliedschaft;
    }
    public void buchen(Kurs ref){
        anzBesuchteKurse++;
        monatsBeitrag += ref.getKursGebuehren();
        ref.anmelden();
    }
    public int getAnzBesuchteKurse() {
        return anzBesuchteKurse;
    }
    public double rechnungsBetrag(){
        return monatsBeitrag;
    }
    public String toString(){
        return "Name: " + name + "\n" + "Mitgliedsnummer: " + mitgliedsnummer;
    }
}
