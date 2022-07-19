package AB1_Aufgaben;

import static AB1_Aufgaben.Eins.EinsDrei.Tracetabelle;
import static AB1_Aufgaben.Eins.EinsZwei.datum;

public class Eins {

    public static double produkt(double a,double b){
        return a*b;
    }
    public static boolean negativ(int a){
        if (a < 0){
            return false;
        }
        return true;
    }
    public static void unterschrift(){
        System.out.println("Mickey Mouse");
    }
    static class EinsZwei{
        public static String datum(int jahr, int monat, int tag){
            return jahr + "-" + monat + '-' + tag; // es muss mindestendes eine String ausgabe stattfinden ansonsten ausgabe ungültig
        }
    }

    static class EinsDrei{
        public static void Tracetabelle(){
            int a = 5;
            int b = 7;
            a = b;
            // a bekommt den wert von b. B ust gerade bei 7. ==> a = 7(b)
            b = a;
            // a hat gerade den wert von b(7) bekommen, somit ist a=b=7.
            System.out.println(a + "\n" + b);
        }

        //Was musste man andern, wenn die Inhalte der Variablen ¨ a und b getauscht werden sollten?
        //Wichtig ist die einführung einer temporären variable die als zwischen speicher dient, in diesem fall die variable temp
        public static void Tracetabelle(int a, int b){ //Überladene methode
            int temp;
             temp = a;
             a = b;
             b = temp;
            System.out.println(a + " " + b);
        }

    }


    public static void main(String[] args) {
        System.out.println(datum(2017,6,23));
        Tracetabelle();
        Tracetabelle(3,5);
    }

}
