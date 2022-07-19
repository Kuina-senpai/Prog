package Ab2;

public class Mathe {
    public static int abs(int n){
        if (n < 0){
            return n * (-1);
        }
        return n;
    }
    public static int max3(int a , int b , int c){
        if (a > b && a > c){
            return a;
        }
        if (b >= a && b >= c){
            return b;
        }
        return c;
    }
    public static int fakLoop(int n) {
        int startWert = 1;
        int zwischenEregbnis = 1;
        while (n > 1){
            zwischenEregbnis *= startWert + 1;
            startWert++;
            n--;
        }
        return zwischenEregbnis;
    }
    public static int fakRek(int n){
        int a = n;
        if (n == 2){ //siehe Trace-Tabelle in oneNote Priesnitz AB2
            return a;
        }
        else {
            a *= fakRek(n - 1);
            n--;
        }
        return a;
    }
    public static void quadrateAusgabeRueck(int n){
        while (n > 0){
            System.out.println(n*n);
            n--;
        }
    }

    public static void main(String[] args) {
        quadrateAusgabeRueck(5);
    }
}

