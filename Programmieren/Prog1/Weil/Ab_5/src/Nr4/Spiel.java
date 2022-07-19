package Nr4;

import java.util.Scanner;

public class Spiel {
    public static void simplesSpiel(Spieler r1 , Spieler r2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie den Namen des Spielers ein: ");
        r1.name = sc.next();
        r2.name = "Computer";
        System.out.println("Wollen sie eine Runde Spielen ? Wenn ja geben sie \"j\" ein, falls nicht geben sie \"n\" ein");
        String eingabe = sc.next();
        while (eingabe.equals("j")){
            System.out.println (r1.name + " wuerfelt: " + r1.wuerfeln());
            System.out.println (r2.name + " wuerfelt: " + r2.wuerfeln());
            if (r1.wuerfeln() > r2.wuerfeln()){
                r1.punktzahl++;
            }
            if (r2.wuerfeln() > r1.wuerfeln()){
                r2.punktzahl++;
            }
            System.out.println("wollen sie weiter Spielen ?");
            eingabe= sc.next();
        }
        if (eingabe.equals("n")){
            if (r1.punktzahl > r2.punktzahl){
                System.out.println("Spieler: " + r1.name + " hat gewonnen. Punktzahl: " + r1.punktzahl);
                System.out.println(r2.name + ":" + r2.punktzahl);
            }
            if (r2.punktzahl > r1.punktzahl){
                System.out.println("Spieler: " + r2.name + " hat gewonnen. Punktzahl: " + r2.punktzahl);
                System.out.println(r1.name + ": " + r1.punktzahl);
            }
            sc.close();
        }
        else{
            System.out.println("Falsche eingabe");
            sc.close();
        }
    }

    //Zusatzaufgabe
    public static void einsGewinnt(Spieler r1 , Spieler r2){
        int punktzahl = 1;
        int amin = 6;
        int bmin = 6;
        while (punktzahl <= 8){
            int a = r1.wuerfeln();
            int b = r2.wuerfeln();
            if (a < amin){
                amin = a;
            }
            if (b < bmin){
                bmin = b;
            }
            System.out.println(a + " Lukas");
            if (a == 1){
                System.out.println(r1.name + " hat bei " + punktzahl + " versuchen Gewonnen");
                return;
            }
            System.out.println(b + " Fabian");
            if (b == 1){
                System.out.println(r2.name + " hat bei " + punktzahl + " versuchen Gewonnen");
                return;
            }
            punktzahl++;
        }
        if (amin < bmin){
            System.out.println(r1.name + "hat gewonnen");
        }
        if (bmin < amin){
            System.out.println(r2.name + "hat gewonnen");
        }else{
            System.out.println("keiner hat gewonnen");
        }


    }
    public static void pasch6(Spieler r1 , Spieler r2){
        int a, aa;
        int b, bb;
        int z = 1;
        while (true){
            a = r1.wuerfeln();
            aa = r1.wuerfeln();
            b = r2.wuerfeln();
            bb = r2.wuerfeln();
            if(a == 6 && aa == 6){
                System.out.println(r1.name + " hat ein 6er Pasch und somit gewonnen. Gespielte Runden: " + z);
                break;
            }
            if (b == 6 && bb == 6){
                System.out.println(r2.name + " hat ein 6er Pasch und somit Gewonnen. Gespielte Runden: " + z);
                break;
            }
            z++;
        }
    }


    public static void grosseHausnummer(Spieler r1){
        Scanner sc = new Scanner(System.in);
        int pos1 = 0 , pos2 = 0 , pos3 = 0;
        int i = 0;
        while (i < 3){
            int a = r1.wuerfeln();
            System.out.println(r1.name + " hat die zahl: " + a + " . setze deine zahl");
            System.out.println("1: Hunderter Bereich \n" +
                               "2: Zehner Bereich \n" +
                               "3: Einer Bereich");
            int setze = sc.nextInt();
            if (setze <= 0 || setze > 3){
                System.out.println("Die Eingabe hat keine Position. versuche eine Zahl zwischen 1 und 3");
                System.out.println("Versuche es erneut : " );
            }
            //es ist wichtig zuerst zu schauen, ob die gewünschte pos belegt ist und dann zuzuteilen.
            //wenn man es andersherum macht, bekommt man die ausgabe für zugeteilt und danach die für belegt da man 1 Zeile vorher die pos belegt hat
            if (setze == 1 && pos1 != 0){
                System.out.println("Die position ist schon belegt.Probiere eine andere Position");
            }
            if (setze == 1 && pos1 == 0){
                pos1 = a;
                i++;
            }
            if (setze == 2 && pos2 != 0){
                System.out.println("Die position ist schon belegt.Probiere eine andere Position");
            }
            if (setze == 2 && pos2 == 0){
                pos2 = a;
                i++;
            }
            if (setze == 3 && pos3 != 0){
                System.out.println("Die position ist schon belegt.Probiere eine andere Position");
            }
            if (setze == 3 && pos3 == 0){
                pos3 = a;
                i++;
            }
        }
        String sp = "" + pos1 + pos2 + pos3;
        String co = "" + "" + r1.wuerfeln() + r1.wuerfeln() + r1.wuerfeln();
        //r1 wuerfeln ist oke, denn es geht nur um die erhaltenen zufallswerte. es ist egal welche referenz würfelt da die zuweisung wichtig ist
        // für jedes r1.wuerfeln wird die wuerfeln methode ausgeführt
        int spieler = Integer.parseInt(sp);
        int computer = Integer.parseInt(co);
        if (spieler > computer){
            System.out.println(r1.name + " hat Gewonnen, mit der Hausnummer: " + spieler);
            System.out.println("Der Computer hat die Hausnummer: " + computer);
        }
        if (computer > spieler){
            System.out.println("Der Computer hat gewonnen, mit der Hausnummer: " + computer);
            System.out.println(r1.name + " hat die Hausnummer: " + spieler);
        }
    }
}
