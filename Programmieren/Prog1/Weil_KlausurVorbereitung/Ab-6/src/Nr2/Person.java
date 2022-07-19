package Nr2;

public class Person {
    private String name;
    private int gebJahr;
    private boolean angemeldet = false;

    public Person(String name, int gebJahr){
        this.name = name;
        this.gebJahr = gebJahr;
    }
    public boolean anmelden(Projekt ref, Person ref2){
        if (ref.plaetzeFrei() && !angemeldet){ // ist ein Platz in der Projektliste frei & ist Person noch nirgendwo angemeldet
            for (int i = 0; i < ref.getFreiePlätze().length; i++){
                if (ref.getFreiePlätze()[i] == 0){
                    ref.setTeilnehmerListe(ref2 , i);
                    ref.setFreiePlätze(i);
                    angemeldet = true;
                    return true;
                }
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
