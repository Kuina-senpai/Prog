package Nr2;

public class Waffe extends Gegenstand implements Tragbar{

    private double gewicht;

    public Waffe(String s, double gewicht){
        super(s);
        this.gewicht = gewicht;
    }
    public double gewicht(){
        return gewicht;
    }

}
