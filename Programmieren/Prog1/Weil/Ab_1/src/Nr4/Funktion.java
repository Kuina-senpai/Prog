package Nr4;

public class Funktion {
    public static int f (int x){
        int f = 3 * x + 7;
        return f;
    }
    public static int g (int x , int y){
        int g = 5 * x - 2 * y;
        return g;
    }
    public static int fg (int x, int y){
        int a = g(x,y);
        int b = f(a);
        return b;
    }
}
