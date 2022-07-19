package Nr22;

public class Rüstung extends Gegenstand { //nicht Tragbar da sie das Interface Tragbar nicht implementiert

    public Rüstung (String bezeichnung){ //selbe Konstruktor Struktur wie in der Oberklasse
        super(bezeichnung);
    }
    public Rüstung (String bezeichnung, double preis){
        super(bezeichnung, preis);
    }
}
