package Nr1;

public class AutomatTest2 {
    public static void main(String[] args) {
       // test2();
        test1();
    }

    public static void test2() {
        Automat1 a = new Automat1 ("bhf" , 1.5);
        System.out.println(a + "\n");
        System.out.println("Eingabe 0, 1 , 1");
        a.erzeugeTicket( 0, 1 , 1);
        System.out.println("Eingabe 0, 2 , 2");
        a.erzeugeTicket( 0, 2 , 2);
        System.out.println("Eingabe 4, 2 , 3");
        a.erzeugeTicket(4,  2 , 3);
    }

    public static void test1() {
        Automat1 a1 = new Automat1("Schlossallee", 1.5);
        Automat1 a2 = new Automat1("Parkstrasse ", 2.0);

        a2.erzeugeTicket( 10 , 6 , 1);

        a2.Rückgeld();
        /*a1.erzeugeTicket( 10 , 2 , 0);
        a1.erzeugeTicket( 1 , 4 , 2);
        a1.erzeugeTicket( 1 , 5 , 1);
        a2.erzeugeTicket( 1 , 6 , 1);
        a1.erzeugeTicket( 1 , 7 , 1);
        a2.erzeugeTicket( 1 , 8 , 1);
        a2.erzeugeTicket( 0 , 0 , -10);
        System.out.println();
        a1.showStatus();
        a2.showStatus();
        System.out.println();
        a1.Parkdauer();
        a2.Parkdauer();
        System.out.println();
        a1.Rückgeld();
        a2.Rückgeld();*/
    }

}
