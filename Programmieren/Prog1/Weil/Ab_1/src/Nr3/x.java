package Nr3;

public class x {
    /*
    int a = 5;
    int b = 7;
    a = b
    b = a

    was muss man machen damit a und b wirklich ihre werte tauschen ?
    - man führt eine zusätzliche temporäre variable ein, die den zwischen wert abspeichert
     */
    public static void tausche (){
        int a = 5;
        int b = 7;
        int t = 0;
        t = a;
        a = b;
        b = t;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        tausche();
    }
}
