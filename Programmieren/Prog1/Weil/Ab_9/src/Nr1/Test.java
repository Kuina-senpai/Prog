package Nr1;

public class Test {
    public static void main(String[] args) throws Exception {


        Buch c = new Buch("Buch" , "Nathan der Weise");
        DVD d = new DVD("DVD" , "Marvel" , 18);

        Nutzer elias = new Nutzer("elias" , 21);
        Nutzer fabian = new Nutzer("Fabian" , 21);
        Nutzer hasib = new Nutzer("Hasib" , 22);

        //System.out.println(hasib.toString());

        //Test auf ist bereits ausgeliehen
        //fabian.ausleihen(d);
        //hasib.ausleihen(d);

        //Test auf Max anzahl ausgeliehen
        /*
        Buch e = new Buch("Buch" , "Nathan der Weise");
        DVD f = new DVD("DVD" , "Marvel" , 18);
        Buch g = new Buch("Buch" , "Nathan der Weise");
        DVD h = new DVD("DVD" , "Marvel" , 18);
        Buch i = new Buch("Buch" , "Nathan der Weise");
        DVD j = new DVD("DVD" , "Marvel" , 18);
        Buch k = new Buch("Buch" , "Nathan der Weise");
        DVD l = new DVD("DVD" , "Marvel" , 18);
        Buch m = new Buch("Buch" , "Nathan der Weise");
        DVD n = new DVD("DVD" , "Marvel" , 18);
        Buch p = new Buch("Buch" , "Nathan der Weise");
        DVD q = new DVD("DVD" , "Marvel" , 18);

        fabian.ausleihen(e);
        fabian.ausleihen(f);
        fabian.ausleihen(g);
        fabian.ausleihen(h);
        fabian.ausleihen(i);
        fabian.ausleihen(j);
        fabian.ausleihen(k);
        fabian.ausleihen(l);
        fabian.ausleihen(m);
        fabian.ausleihen(n);
        fabian.ausleihen(p);
        fabian.ausleihen(q);
        */


        //test die Person, ist nicht alt genug
        DVD d2 = new DVD("DVD" , "Halloween" , 25);
        fabian.ausleihen(d2);
        /**
        System.out.println(c.getVerfügbarkeit());
        fabian.rückgabeMedium();
        System.out.println(c.getVerfügbarkeit());
        fabian.ausleihen(d);

        //fabian.ausleihListe();
*/
    }
}
