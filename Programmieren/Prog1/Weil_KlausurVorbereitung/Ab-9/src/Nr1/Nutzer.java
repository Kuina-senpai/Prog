package Nr1;

public class Nutzer extends Person{
    private int id;
    private Medium[] ausleihListe = new Medium[10];
    private int ausgelieheneMedien = 0;
    private static int nummer = 1;

    public Nutzer(String name, int alter){
        super(name,alter);
    }
    public void ausleihen(Medium ref)throws Exception{
        if (ausgelieheneMedien == 10){
            throw new AusleihException("sie haben bereits die maximale anzahl an Medien ausgeliehen");
        }
        if (getAlter() < ref.getFSK()){
            throw new FskException("Sie sind nicht alt genug um dieses Medium auszuleihen");
        }
        if (!ref.getVerfügbarkeit()){
            throw new VerfügbarkeitsException("Das Medium ist bereits ausgeliehen");
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

    public static void main(String[] args) throws Exception{
        Nutzer a = new Nutzer("Hasib" , 15);
        Medium b = new DVD("Marvel" , 16);
        a.ausleihen(b);

    }

}
