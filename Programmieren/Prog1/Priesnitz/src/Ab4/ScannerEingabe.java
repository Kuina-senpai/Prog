package Ab4;

import java.util.Scanner;

public class ScannerEingabe {

    public static int eingabe(String s){ //gg
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String a;
        while (sc.hasNext()){
            a = sc.next();
            if (a.equals(s)){
                i++;
            }
        }
        return i;
    }
    public static double durchschnitt(){ //gg
        Scanner sc = new Scanner(System.in);
        double summe = 0;
        int i = 0;
        while (sc.hasNext()){
            double eingabe = sc.nextDouble();
            summe+= eingabe;
            i++;
        }
        if (i == 0){
            return 0;
        }
        return summe/i;
    }

    public static void main(String[] args) {
        System.out.println(durchschnitt());
    }
}
