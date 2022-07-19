import java.util.Scanner;

public class xSpiel {
    public static void simplesSpiel(xSpieler a, xSpieler b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("möchten sie eine runde Spielen ? (j/n)");
        String abfrage = sc.next();
        if (abfrage.equals("n")) {
            return;
        }
        while (true) {
            int aa = a.wuerfeln();
            int bb = b.wuerfeln();
            if (aa > bb) {
                a.punktPlus();
            }
            if (bb > aa) {
                b.punktPlus();
            }
            System.out.println(a.getName() + " würfelt: " + aa);
            System.out.println(b.getName() + " würfelt: " + bb);
            System.out.println("möchten sie noch eine runde Spielen ? (j/n)");
            abfrage = sc.next();
            if (abfrage.equals("n")) {
                System.out.println(a.toString());
                System.out.println(b.toString());
                if (a.getPunktzahl() > b.getPunktzahl()) {
                    System.out.println("der Sieger des Spiels ist: " + a.getName());
                } else {
                    System.out.println("der Sieger des Spiels ist: " + b.getName());
                }
                break;
            }
        }
    }

    public static void filzlaus(xSpieler a, xSpieler b) {
        int versuche = 1;
        int aPunktzahl = 6, bPunktzahl = 6;
        while (versuche <= 8) {
            int aa = a.wuerfeln();
            int bb = b.wuerfeln();
            System.out.println(aa);
            System.out.println(bb);
            if (aa == 1) {
                System.out.println(a.getName() + " hat gewonnen innerhlab von " + versuche + " versuchen gewonnen");
                break;
            }
            if (bb == 1) {
                System.out.println(b.getName() + " hat gewonnen innerhlab von " + versuche + " versuchen gewonnen");
                break;
            }
            if (aa < aPunktzahl) {
                aPunktzahl = aa;
            }
            if (bb < bPunktzahl) {
                bPunktzahl = bb;
            }
            versuche++;
        }
        if (aPunktzahl < bPunktzahl) {
            System.out.println(a.getName() + " hat gewonnen mit der zahl: " + aPunktzahl);
            System.out.println(b.getName() + " hatte die zahl: " + bPunktzahl);
            return;
        }
        if (aPunktzahl > bPunktzahl) {
            System.out.println(b.getName() + " hat gewonnen mit der zahl: " + bPunktzahl);
            System.out.println(a.getName() + " hatte die zahl: " + aPunktzahl);
        } else {
            System.out.println("keiner hat gewonnen");
        }
    }

    public static void pasch(xSpieler a, xSpieler b) {
        int i = 1; // da die möglickeit besteht im ersten schleifen durchlauf das ziel zu erreichen
        // somit wäre i = 1 als erster versuch zu deuten
        while (true) {
            int a1 = a.wuerfeln(), a2 = a.wuerfeln();
            int b1 = b.wuerfeln(), b2 = b.wuerfeln();
            System.out.println(a1 + " " + a2);
            System.out.println(b1 + " " + b2);
            if (a1 == 6 && a2 == 6) {
                System.out.println(a.getName() + " hat gewonnen mit " + i + " versuchen");
                break;
            }
            if (b1 == 6 && b2 == 6) {
                System.out.println(b.getName() + " hat gewonnen mit " + i + " versuchen");
                break;
            }
            i++;
        }
    }
    public static void hausnummer(xSpieler a){
        Scanner sc = new Scanner(System.in);
        int pos1 = 0 , pos2 = 0 , pos3 = 0;
        int i = 0;
        while (i < 3){
            int a1 = a.wuerfeln();
            System.out.println(a.getName() + " hat die nummer: " + a1 + " wo möchten sie sie platzieren");
            System.out.println("1 = Hunderterbereich 2 = Zehnerbereich 3 = Einerbereich");
            int eingabe = sc.nextInt();
            //es ist wichtig zuerst zu schauen, ob die gewünschte pos belegt ist und dann zuzuteilen.
            if (eingabe < 1 || eingabe > 3){
                System.out.println("Ihre position ist ungültig bitte geben sie eine ander position ein");
            }
            if (pos1 > 0 && pos2 > 0 && pos3 > 0){
                break;
            }
            if ((eingabe == 1 && pos1 != 0) || (eingabe == 2 && pos2 != 0) || (eingabe == 3 && pos3 != 0)){
                System.out.println("Ihre position ist schon besetzt bitte wählen sie eine andere position");
            }
            if (eingabe == 1 && pos1 == 0){
                pos1 = eingabe;
                i++;
            }
            if (eingabe == 2 && pos2 == 0){
                pos2 = eingabe;
                i++;
            }
            if (eingabe == 3 && pos3 == 0){
                pos3 = eingabe;
                i++;
            }
        }
        String spieler = "" + pos1 + pos2 + pos3;
        String computer = "" + a.wuerfeln() + a.wuerfeln() + a.wuerfeln();
        int ergebnisSpieler = Integer.parseInt(spieler);
        int ergebnisComputer = Integer.parseInt(computer);

        if (ergebnisSpieler > ergebnisComputer){
            System.out.println(a.getName() + " hat gewonnen mit der nummer: " + ergebnisSpieler);
            System.out.println("Computer hatte die nummer: " + ergebnisComputer);
        }
        else{
            System.out.println("Computer hat gewonnen mit der nummer: " + ergebnisComputer);
            System.out.println(a.getName() + " hatte die nummer: " + ergebnisSpieler);
        }
    }

    public static void main(String[] args) {
        xSpieler a = new xSpieler("Lukas");
        xSpieler b = new xSpieler("fabian");

    }
}

