package Nr3;
import java.lang.Math;

public class Newton {

    static double x0 = 1; // startwert
    static int a = 0; // zähler 1
    static int b = 0; // zähler 2

    // Methode für f(x)
    public static double fx (){
        a++;
        double fx = (x0*x0) - 2;
        return fx;
    }
    // Methode für f'(x)
    public static double fstrich (){
        b++;
        double fxx = 2 * x0;
        return fxx;
    }
    public static double abs (){
        double a = Math.abs(fx());
        return a;
    }
    public static void ns () {
        double epsilon = 0.000000000000001;
        while (abs() > epsilon){
            double xn1 = x0 - ( fx()/fstrich() );
            x0 = xn1;
        }
        System.out.println("Die Nullstellen der Funktion sind bei x1: " + x0 + " , x2: " + (x0 * (-1)));
        System.out.println("die Methode f(x) wurde " + a + " mal aufgerufen");
        System.out.println("die Methode f'(x) wurde " + b + " mal aufgerufen");
    }

    public static void main(String[] args) {
        ns();
    }
}
