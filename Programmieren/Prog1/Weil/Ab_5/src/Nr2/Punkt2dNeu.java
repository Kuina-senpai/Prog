package Nr2;
import Nr1.Punkt2d;

public class Punkt2dNeu {

    public double x;
    public double y;

    public Punkt2dNeu (){
        this.x = 0;
        this.y = 0;
    }
    public Punkt2dNeu (double a, double b){
        this.x = a;
        this.y = b;
    }
    public Punkt2dNeu (Punkt2dNeu k){
        x = k.x;
        y = k.y;
    }

    public static double abstand (Punkt2dNeu r1 , Punkt2dNeu r2){
        double a = (r1.x - r2.x) * (r1.x - r2.x);
        double b = (r1.y - r2.y) * (r1.y - r2.y);
        return Math.sqrt(a + b);
    }
}
