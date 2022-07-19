package Nr22;

public class Hobbit extends Wesen implements gruss,Tragbar {
    private int lebenserwartung = 150;
    private boolean alive = true;
    private double kannGewichtTragen = 20;

    public Hobbit(String name, int alter){
        super(name,alter);
    }

    public Hobbit(String name, int alter , double geldbeutel){ //Überladener konstruktor
        super(name,alter,geldbeutel);//reihenfolge muss == der Reihenfolge des Oberklassen Konstruktors sein
    }
    public double gewicht() {
        if (kannGewichtTragen == 20){
            return 100;
        }
        return 100 + (20 - kannGewichtTragen); // entspricht dem Körpergewicht und dem Objekt gewicht, dass Hobbit trägt
    }
    public boolean lebendig() {
        return getAlter() < lebenserwartung;
    }
    public String gruss(){
        return "Hallo!";
    }
    public void wirdVerwundet(int damage) {
        int n = this.lebenserwartung - damage;
        if (n < getAlter()) {
            System.out.println(this + "ist gestorben");
            alive = false;
        } else {
            setLebenserwartung(n);
            System.out.println(this + " hat überlebt mit restlicher Lebenserwartung von: " + this.lebenserwartung);
        }
    }

    @Override
    public boolean nehmen(Tragbar a) {
        if (a.gewicht() <= kannGewichtTragen){
            setDing(a); // dann hat der Hobbit Ding zugewiesen bekommen
            setKannGewichtTragen(kannGewichtTragen - a.gewicht());
            return true;
        }
        //System.out.println("Das " + ((Gegenstand)a).getBezeichnung());
        return false;
    }
    public String toString(){
        return super.toString() + "ist am leben: " + alive;
    }
    public void setLebenserwartung(int lebenserwartung) {
        this.lebenserwartung = lebenserwartung;
    }
    public void setKannGewichtTragen(double kannGewichtTragen) {
        this.kannGewichtTragen = kannGewichtTragen;
    }

    public static void main(String[] args) {
        Wesen a = new Hobbit("eli" , 50);
        Wesen b = new Magier("Hasib", 20);
        Hobbit c = new Hobbit("Huy" , 20);
        System.out.println(a.lebendig());
        System.out.println(b.lebendig());
        c.wirdVerwundet(60);
        c.wirdVerwundet(10);
        c.wirdVerwundet(1);
    }
}
