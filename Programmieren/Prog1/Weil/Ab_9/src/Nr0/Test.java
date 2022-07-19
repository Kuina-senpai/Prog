package Nr0;

public class Test {
    public static void main(String[] args){
        Medium a = new Medium("Buch" , "Mathe");
        Medium b = new Medium("DVD" , "Harry Potter");

        Buch c = new Buch("Buch" , "Nathan der Weise");
        DVD d = new DVD("DVD" , "Marvel");

        Person elias = new Person("elias" , 21);
        Nutzer fabian = new Nutzer("Fabian" , 21);
        Nutzer hasib = new Nutzer("Hasib" , 22);

        System.out.println(hasib.toString());

        fabian.ausleihen(a);
        fabian.ausleihen(b);
        fabian.ausleihen(c);
        fabian.ausleihen(d);
        hasib.ausleihen(d);
        System.out.println(c.getVerfügbarkeit());
        fabian.rückgabeMedium();
        System.out.println(c.getVerfügbarkeit());

        //fabian.ausleihListe();

    }
}
