package Nr1;

public class Test {
    public static void main(String[] args) {
        Kurs a = new Kurs("Boxen", 30);
        Kurs b = new Kurs("Fortnite", 25);

        Member m1 = new Member("Lukas");
        Member m2 = new Member("Hasib");
        Member m3 = new Member("Ben");
        Member m4 = new Member("Huy");
        Member m5 = new Member("Elias");

        m1.buchen(a);
        m1.buchen(b);

        m2.buchen(a);
        m3.buchen(b);
        m4.buchen(b);
        m5.buchen(b);

        System.out.println(a.getGesamtEinnahmen()); //gg
        System.out.println(b.getGesamtEinnahmen());
        System.out.println(m1.rechnungsBetrag());  //gg
        System.out.println(m1.getAnzBesuchteKurse()); //gg
    }
}
