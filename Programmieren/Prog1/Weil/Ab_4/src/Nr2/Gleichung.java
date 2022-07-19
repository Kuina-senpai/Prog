package Nr2;

public class Gleichung {

    public static String hoch2 (int a, int b, int c){
        int d = (b*b) - (4*a*c);
        if (a == 0 && b == 0 && c == 0){
            return "allgemeingültig";
        }
        if (a == 0 && b == 0 && c != 0){
            return "keine Lösung";
        }
        if (a == 0 && b != 0){
            return "eine Lösung";
        }
        if (a != 0 && d < 0){
            return "keine Lösung";
        }
        if (a != 0 && d == 0){
            return "eine Lösung";
        }
        else {
            return "zwei Lösungen";
        }
    }
}
