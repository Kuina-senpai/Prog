package Nr22;

public abstract class Wesen{
    private String name;
    private int alter;
    private double geldBeutel;
    private int ausgelieheneGegenstände = 0;
    private Gegenstand[] inventar = new Gegenstand[1]; //so können wesen mehrere gegenstände tragen. wie vile kann man später definieren

    private Tragbar ding; //Tragbar kann verwendet werden wie ein Objekt, denn es ist ein normaler rückgabe typ
    public Wesen(String name){
        this.name = name;
    }
    public Wesen(String name, int alter){//Unterklassen konstruktor muss format des oberklassen konstruktor haben
        this.name = name;
        this.alter = alter;
    }
    public Wesen(String name, int alter, double geldBeutel){//Unterklassen konstruktor muss format des oberklassen konstruktor haben
        this.name = name;
        this.alter = alter;
        this.geldBeutel = geldBeutel;
    }
    public abstract boolean nehmen(Tragbar a); // wird in hobbit und Magier implementiert (Pferd)

    public abstract boolean lebendig();
    //def von Hobbit/Magier ref hier nicht nötig
    //das programm erkennt, was für ein typ das objekt ist und gibt dem entsprechend die
    // → in der jeweiligen klasse definierte methode aus


    public boolean kaufen(Gegenstand schwert){
        if (schwert.getPreis() <= this.geldBeutel){
            addInventar(); //siehe methode
            this.geldBeutel -= schwert.getPreis(); //preis des Gegenstandes wird vom geldbeutel abgezogen
            this.inventar[ausgelieheneGegenstände] = schwert;
            ausgelieheneGegenstände++;
            schwert.setBesitzer(this);
            return true;
        }
        return false;
    }
    private void addInventar(){ //Hilfsmethode: dynamic Array
        Gegenstand[] array = new Gegenstand[ausgelieheneGegenstände + 1]; //Array länge + 1
        for (int i = 0; i < inventar.length; i++){
            array[i] = inventar[i];
        }
        this.inventar = array;
    }
    private boolean imInventar(Gegenstand b){ //Hilfsmethode
        for (int i = 0; i < inventar.length; i++){
            if (inventar[i] == b){
                return true;
            }
        }
        return false;
    }
    public boolean verkaufen(Wesen a, Gegenstand b){
        if (a.imInventar(b) && this.kaufen(b)){
            //bedeutet, dass das Objekt bei Wesen a im inventar ist und der Kaufen prozess nach der Methode Kaufen ist true
            a.remove(b); //Gegenstand b wird bei Wesen a aus dem inventar entfernt
            return true;
        }
        return false;
    }
    public void remove(Gegenstand ref){
        int arrayLängeNeu = ausgelieheneGegenstände -1;
        if (arrayLängeNeu > 0){
            Gegenstand[] array = new Gegenstand[arrayLängeNeu];
            int a = 0;
            for (int i = 0; i < inventar.length; i++){//sucht position des entfernten objekts
                if (inventar[i] == ref){
                    a = i;
                }
            }
            for (int i = 0; i < a; i++){//fügt die objekte bis zum remove objekt in den neuen array ein
                array[i] = inventar[i];
            }
            for (int i = a + 1; i <inventar.length; i++){//fügt die gegenstände ab dem remove objekt in den neuen array ein
                array[i - 1] = inventar[i];
            }
            this.inventar = array;
        }
    }

    public String toString(){
        return "Name: " + name + "\n" +
                "Alter: " + alter + "\n";
    }

    public Tragbar tragen(){ //zeigt, was ich trage
        return ding;
    }


    //Get/Set-Methoden
    public void setDing(Tragbar ding) {
        this.ding = ding;
    }
    public Tragbar getDing() {
        return ding;
    }
    public int getAlter() {
        return alter;
    }
    public String getName() {
        return name;
    }
    public double getGeldBeutel() {
        return geldBeutel;
    }
    public int getAusgelieheneGegenstände() {
        return ausgelieheneGegenstände;
    }
    public void setGeldBeutel(Gegenstand a) {
        this.geldBeutel -= a.getPreis();
    }
    public void getInventar(){
        for (int i = 0; i < inventar.length; i++){
            System.out.println(inventar[i]);
        }
    }
}
