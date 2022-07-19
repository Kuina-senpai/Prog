package Nr1;

public class kurs {
    public String nameKurs;
    public double kostenProMonatKurs;
    public double gesamtEinnahmenAllerKurse;
    public int anzahlKursMitglieder;

    public kurs() { }

    public kurs (String s, double kosten){
        nameKurs = s;
        kostenProMonatKurs = kosten;
        gesamtEinnahmenAllerKurse += kostenProMonatKurs;
    }
    public kurs (String s, double kosten, int i){
        nameKurs = s;
        kostenProMonatKurs = kosten;
        gesamtEinnahmenAllerKurse += kostenProMonatKurs;
        anzahlKursMitglieder = i;
    }
    public double getGesamtEinnahmenAllerKurse() {
        return gesamtEinnahmenAllerKurse;
    }
    public int getAnzahlKursMitglieder() {
        return anzahlKursMitglieder;
    }
    @Override
    public String toString() {
        return "kurs{" +
                "name='" + nameKurs + '\'' +
                '}';
    }

    public void anmelden(){
        anzahlKursMitglieder ++;
        gesamtEinnahmenAllerKurse += kostenProMonatKurs;
    }
}
