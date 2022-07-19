package Nr2;

public class Hobbit extends Wesen{
    private int lebenserwartung = 150;
    private boolean alive = true;

    public Hobbit(String name, int alter){
        super(name,alter);
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
    public void nehmen(Tragbar a) {
        if (a.gewicht() <= 20){
            setDing(a); // dann hat der Hobbit Ding zugewiesen bekommen
        }else{
            System.out.println("Das " + ((Gegenstand)a).getBezeichnung());
        }
    }
    public String toString(){
        return super.toString() + "ist am leben: " + alive;
    }



    public void setLebenserwartung(int lebenserwartung) {
        this.lebenserwartung = lebenserwartung;
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
