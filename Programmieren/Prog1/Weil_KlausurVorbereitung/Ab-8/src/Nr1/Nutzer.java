package Nr1;

public class Nutzer extends Person{
    private int id;
    private Medium[] ausleihListe = new Medium[10];
    private int ausgelieheneMedien = 0;
    private static int nummer = 1;

    public Nutzer(String name, int gebJahr){
        super(name,gebJahr);
        id = nummer;
        nummer++;
    }
    public void ausleihen(Medium ref){
        if (ausgelieheneMedien == 10){
            System.out.println("Der Nutzer hat die max anzahl an Medien ausgeliehen");
            return;
        }
        if (!ref.getVerfügbarkeit()){
            System.out.println("das Medium ist bereits ausgeliehen");
            return;
        }
        ausleihListe[ausgelieheneMedien] = ref;
        ausgelieheneMedien++;

        ref.setVerfügbarkeit(); // nach dem Ausleihen wird die verfügbarkeit auf false gesetzt
        ref.setAusleiher(Nutzer.this);//der Nutzer der diese Methode ausführt, wird bei Medium als ausleiher eingetragen
    }
    public void ausleihListe(){
        for (int i = 0; i < ausleihListe.length; i++){
            System.out.println(ausleihListe[i]);
        }
    }
    public void rückgabeMedien(){
        for (int i = 0; i < ausgelieheneMedien; i++){
            ausleihListe[i].setVerfügbarkeit();

        }
        ausleihListe = null; //gesamte liste wird leer, weil alle Medien zurückgegeben werden
        ausgelieheneMedien = 0; // es werden alle ausgeliehenen Medien auf ein mal zurückgegeben
    }
    public int getAusgelieheneMedien() {
        return ausgelieheneMedien;
    }
    public int getId() {
        return id;
    }
}
