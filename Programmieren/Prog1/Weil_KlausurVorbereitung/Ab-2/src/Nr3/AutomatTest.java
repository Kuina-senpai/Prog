package Nr3;

public class AutomatTest {
    public static void main(String[] args) {
        Automat a = new Automat("Schlossallee", 1.50);
        Automat b = new Automat("Parkstrasse", 2);

        parkscheinAutomat pa1 = new parkscheinAutomat();
        parkscheinAutomat pa2 = new parkscheinAutomat();

        System.out.println(pa1.erzeugeTicket(3, a));
        System.out.println(pa1.erzeugeTicket(4, a));
        System.out.println(pa1.erzeugeTicket(5, a));
        System.out.println(pa1.getEinnahmenAutomat());
        a.showStatus(pa1);

        System.out.println(pa2.erzeugeTicket(7, b));
        System.out.println(pa2.erzeugeTicket(8, b));
        System.out.println(pa2.erzeugeTicket(9, b));
        System.out.println(pa2.getEinnahmenAutomat());
        b.showStatus(pa2);
    }
}
