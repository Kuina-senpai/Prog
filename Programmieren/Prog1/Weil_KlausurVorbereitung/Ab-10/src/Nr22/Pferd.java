package Nr22;

public class Pferd extends Wesen{
    private int reiter = 0;
    private int maxGewicht = 250;

    public Pferd(String name){
        super(name);
    }

    public boolean lebendig() {
        return true;
    }

    public boolean nehmen(Tragbar a) {
        if (reiter < 2 && a.gewicht() <= maxGewicht){
            reiter++;
            return true;
        }
        return false;
    }
}
