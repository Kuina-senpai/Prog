package Nr2;

public class Test {
    public static void main(String[] args) {
        Person lukas = new Person("Lukas",2003);
        Person fabian = new Person("Fabian" , 2001);

        Projekt lesen = new Projekt("Lesen",fabian,10,true);
        Projekt fortnite = new Projekt("fortnite",lukas,3,true);

        Person elias = new Person("elias" , 2001);
        Person hasib = new Person("hasib",2000);
        Person amin = new Person("amin",2001);

        System.out.println(elias.anmelden(fortnite,elias));
        System.out.println(hasib.anmelden(fortnite,hasib));
        System.out.println(amin.anmelden(fortnite,amin));

        fortnite.showteilnehmer();


        System.out.println(fortnite.plaetzeFrei());
        System.out.println(amin.anmelden(fortnite,amin));

    }
}
