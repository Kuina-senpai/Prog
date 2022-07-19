public class Newton {
    private static double x0 = 1; //startwert
    private static int a = 0;
    private static int b = 0;
    public static double fx(){
        a++;
        return (x0*x0) -2;
    }
    public static double ffx(){
        b++;
        return 2 * x0;
    }
    private static double abs(){
        return Math.abs(fx());
    }
    public static void ns(){
        double e = 0.00000000000001;
        while(abs() > e){
            double xn1 = x0 - (fx() / ffx());
            x0 = xn1;

        }
        System.out.println("Die Nullstellen der Funktion sind bei x1: " + x0 + " x2: " + (x0*(-1)));
        System.out.println("Methode fx() wurde " + a + " aufgerufen");
        System.out.println("Methode ffx() wurde " + b + " aufgerufen");
    }

    public static void main(String[] args) {
        ns();
    }
}
