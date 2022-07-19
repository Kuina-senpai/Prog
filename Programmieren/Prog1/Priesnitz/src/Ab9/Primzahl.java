package Ab9;

public class Primzahl {
    public static boolean primLoop(int p){
        int n = 2;
        while (n < p){
            if (p%n == 0){
                return false;
            }
            n++;
        }
        return true;
    }
    public static boolean primRek(int p){
        int n = 2;
        if ( n < p && hilfsmethode(p,n) == 0){
            return false;
        }else{
            hilfsmethode(p,++n);
        }
        return true;
    }
    public static int hilfsmethode(int p, int n){
        return  p % n;
    }

    public static void main(String[] args) {
        System.out.println(primRek(89));
    }
}
