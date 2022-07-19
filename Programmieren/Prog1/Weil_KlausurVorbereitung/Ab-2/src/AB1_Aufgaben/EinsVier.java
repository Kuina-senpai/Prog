package AB1_Aufgaben;

public class EinsVier { //Komposition berechnen siehe Eidip Notizen 1

    public static int f(int x){
        int fx = 3*x + 7;
        return fx;
    }
    public static int g(int x, int y){
        int gx = 5*x - 2*y;
        return gx;
    }
    public static int fg(){
        return f(g(1,4));
    }

    public static void main(String[] args) {
        System.out.println(fg());
    }
}
