package Nr2;

public class test{
    public static void main(String[] args) {
        Person p1 = new Person("Lukas" , 2003);
        Person p2 = new Person("Huy" , 2002);

        Projekt a = new Projekt("Lesen" , p1 , 40);
        Projekt b = new Projekt("Fortnite" , p2 , 30, true);

        a.setAnzSchueler(40);

        System.out.println(a.alleSchuelerUntergebracht());

    }
}
