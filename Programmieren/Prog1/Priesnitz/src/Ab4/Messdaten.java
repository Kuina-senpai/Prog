package Ab4;

import java.util.Scanner;

public class Messdaten {
    Scanner sc = new Scanner(System.in);

    public static double durchschnitt(Scanner sc, String s){ //falsch
        double summe = 0;
        int z = 0;
        double anz = 0.0;
        double sum = 0.0;
        double max = -Double.MAX_VALUE;
        String datum = "";
        while (sc.hasNext()) {
            int jahr = sc.nextInt();
            int monat = sc.nextInt();
            int tag = sc.nextInt();
            String messgroesse = sc.next();
            double wert = sc.nextDouble();

            if (messgroesse.equals(s)) {
                sum += wert;
                anz++;
                if (wert > max) {
                    max = wert;
                    datum = tag + "." + monat + "." + jahr;
                }
            }
        }
        System.out.println("max. " + s + " (" + max + ") am " + datum);

        return sum / anz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(durchschnitt(sc , "hallo"));
    }
}
