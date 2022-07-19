package Nr1;

public class Person {

    private  boolean teilnehmer = false;
    private String name;
    private int geburtsJahr;
    private int geburtsMonat;
    private int geburtsTag;


    public Person() { }

    public Person(String s, int a){
        name = s;
        geburtsJahr = a;
    }

    public Person(String s, int a, int b, int c){
        name = s;
        geburtsTag = a;
        geburtsMonat = b;
        geburtsJahr = c;
    }
    public String getName(){
        return this.name;
    }

    public boolean anmelden(Projekt r , Person a) {
        if (pruefedoplleteMitgliedschaft(r,a) && setzePerson(r, a)){ //setzePerson(r, a) <==> setzePerson(r, a) == true
            return true;                                      //!setzePerson(r, a) <==> setzePerson(r, a) == false
        }else{
            return false;
        }
    }
    public boolean setzePerson(Projekt r2 , Person a){
        for (int i = 1; i < r2.getTeilnehmerliste().length; i++){
            if (r2.getTeilnehmerliste()[i] == null){
                r2.getTeilnehmerliste()[i] = a; // setzt eine Person referenz an die freie stelle in der Liste
                teilnehmer = true; //bedeutet, dass Person a jetzt teil eines Projekts ist
                return true; // => Person a wurde der Teilnehmerliste hinzugefügt

            }
        }
        System.out.print("die maximale Teilnehmer Anzahl wurde erreicht ==> ");
        return false;
        //gibt false aus, wenn Person a schon teilnehmer dieses Projekts ist.
        //gibt true aus, wenn für person a noch Platz in der Teilnehmerliste des Projekts x ist
    }
    public boolean pruefedoplleteMitgliedschaft(Projekt r3 , Person a){
        for (int i = 1; i < r3.getTeilnehmerliste().length; i++){
            if (r3.getTeilnehmerliste()[i] == a){
                return false;
                //bedeutet, dass person a bereits mitglied in dem Projekt oder in irgendeinem ist
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "teilnehmer=" + teilnehmer +
                ", name='" + name + '\'' +
                ", geburtsJahr=" + geburtsJahr +
                ", geburtsMonat=" + geburtsMonat +
                ", geburtsTag=" + geburtsTag +
                '}';
    }
}
