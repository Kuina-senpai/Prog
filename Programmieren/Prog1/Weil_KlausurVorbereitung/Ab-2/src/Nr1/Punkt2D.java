package Nr1;

public class Punkt2D {

    private double x;
    private double y;

    public Punkt2D(){}
    public Punkt2D(double xWert, double yWert){
        this.x = xWert;
        this.y = yWert;
    }
    public Punkt2D(Punkt2D ref){
        this.x = ref.x;
        this.y = ref.y;
    }
    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public Punkt2D verschiebeUm(double dx, double dy){
        this.x += (dx); // klammern, da die Eingabe auch negativ sein kann
        this.y += (dy);
        return this; // gibt, das verwendetet Punkt2D objekt in veränderter Form zurück
    }
    public Punkt2D moveTo(double x, double y){
        this.x = x;
        this.y = y;
        return this;
    }
    public String toString(){
        return "(" + x + ',' + y + ")";
    }
}
