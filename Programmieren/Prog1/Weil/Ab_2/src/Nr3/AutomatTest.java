package Nr3;

public class AutomatTest {
    static Automat a1 = new Automat("Schlossallee" ,  1.50);
     static Automat a2 = new Automat("Parkstrasse" , 2);

    static ParkscheinAutomat c1 = new ParkscheinAutomat(3);
    static ParkscheinAutomat c2 = new ParkscheinAutomat(3);
    static ParkscheinAutomat c3 = new ParkscheinAutomat(7);

    public static void main(String[] args) {
        c1.erzeugeTicket(a2);
        c1.erzeugeTicket(a1);
        c1.erzeugeTicket(a1);
        System.out.println(a1.showStatus(c1));

    }
}
